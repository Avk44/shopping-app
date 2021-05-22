package com.avk44.avkshopping.product.repository.mongo;

import com.avk44.avkshopping.product.domain.category.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoryRepository extends ReactiveMongoRepository<Category,String> {
}
