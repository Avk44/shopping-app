package com.avk44.avkshopping.product.service;

import com.avk44.avkshopping.product.domain.category.Category;
import com.avk44.avkshopping.product.model.category.CategoryResponse;
import com.avk44.avkshopping.product.model.category.CategorySaveRequest;
import reactor.core.publisher.Flux;

public interface CategoryService {

  Flux<CategoryResponse> getAll();
  Category getById(String id);
  CategoryResponse save(CategorySaveRequest request);
}
