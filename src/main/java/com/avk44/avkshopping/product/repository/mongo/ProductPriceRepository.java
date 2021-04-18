package com.avk44.avkshopping.product.repository.mongo;

import com.avk44.avkshopping.product.domain.ProductPrice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductPriceRepository extends ReactiveMongoRepository<ProductPrice, String> {
}
