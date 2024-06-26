package com.subscription;

import com.coxautodev.graphql.tools.GraphQLSubscriptionResolver;
import com.subscription.model.StockPrice;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class SubscriptionResolver implements GraphQLSubscriptionResolver {

  public Publisher<StockPrice> stockPrice(String symbol) {

    Random random = new Random();
    return Flux.interval(Duration.ofSeconds(1))
        .map(num -> new StockPrice(symbol, random.nextDouble(), LocalDateTime.now()));
  }
}
