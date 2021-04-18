package com.avk44.avkshopping.product.repository.mongo;

import com.avk44.avkshopping.product.domain.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
}
