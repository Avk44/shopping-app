package com.avk44.avkshopping.product.domain.es;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryEs {
  private String id;
  private String name;
  private String code;
}
