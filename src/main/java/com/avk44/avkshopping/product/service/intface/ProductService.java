package com.avk44.avkshopping.product.service.intface;

import com.avk44.avkshopping.product.model.product.ProductDetailResponse;
import com.avk44.avkshopping.product.model.product.ProductResponse;
import com.avk44.avkshopping.product.model.product.ProductSaveRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {

  ProductResponse save(ProductSaveRequest request);
  Flux<ProductResponse> getAll();
  Mono<Long> count();
  Mono<ProductDetailResponse> getProductDetail(String id);

}
