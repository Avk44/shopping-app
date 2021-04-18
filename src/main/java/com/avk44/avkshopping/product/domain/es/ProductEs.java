package com.avk44.avkshopping.product.domain.es;

import com.avk44.avkshopping.product.domain.mongo.ProductImage;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;

@Document(indexName = "product")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class ProductEs {
  private String id;
  private String name;
  private String code;
  private String description;
  private CompanyEs seller;
  private String features;
  private CategoryEs category;
  private List<ProductImage> imageList;
  private Boolean active;
}
