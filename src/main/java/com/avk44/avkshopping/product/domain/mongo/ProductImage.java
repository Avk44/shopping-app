package com.avk44.avkshopping.product.domain.mongo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductImage {
  private ImageType imageType;
  private String url;

}
