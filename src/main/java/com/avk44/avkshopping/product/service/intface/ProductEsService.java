package com.avk44.avkshopping.product.service.intface;

import com.avk44.avkshopping.product.domain.es.ProductEs;
import com.avk44.avkshopping.product.domain.mongo.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductEsService {

  Flux<ProductEs> findAll();
  Mono<ProductEs> findById(String id);
  Mono<ProductEs> saveNewProduct(Product product);
}
