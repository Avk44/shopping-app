package com.avk44.avkshopping.product.domain.mongo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collation = "product")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Product {
  private String id;
  private String name;
  private String code;
  private String description;
  private String companyId;
  private String features;
  private String categoryId;
  private Boolean active;

}
