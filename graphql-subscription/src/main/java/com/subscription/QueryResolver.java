package com.subscription;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.subscription.model.StockDetail;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class QueryResolver implements GraphQLQueryResolver {

  public StockDetail stockDetail(String symbol) {
    return new StockDetail(symbol, "name", 2000l);
  }

  public List<StockDetail> stockDetails() {
    List<StockDetail> stockDetails = new ArrayList<>();
    stockDetails.add(new StockDetail("Symbol 1", "name1", 2000l));
    stockDetails.add(new StockDetail("Symbol 2", "name2", 3000l));
    stockDetails.add(new StockDetail("Symbol 3", "name3", 4000l));

    return stockDetails;
  }
}
