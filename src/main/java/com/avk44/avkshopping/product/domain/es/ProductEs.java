package com.avk44.avkshopping.product.domain.es;

import com.avk44.avkshopping.product.domain.mongo.MoneyTypes;
import com.avk44.avkshopping.product.domain.mongo.ProductImage;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

@Document(indexName = "product")
@Getter
@Setter
@Builder
@EqualsAndHashCode(of = "id")
public class ProductEs {
  private String id;
  private String name;
  private String code;
  private String description;
  private CompanyEs seller;
  private String features;
  private CategoryEs category;
  private HashMap<MoneyTypes, BigDecimal> price;
  private List<String> images;
  private Boolean active;
}
