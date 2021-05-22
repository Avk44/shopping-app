package com.avk44.avkshopping.product.service.impl;

import com.avk44.avkshopping.product.domain.category.Category;
import com.avk44.avkshopping.product.model.category.CategoryResponse;
import com.avk44.avkshopping.product.model.category.CategorySaveRequest;
import com.avk44.avkshopping.product.repository.mongo.CategoryRepository;
import com.avk44.avkshopping.product.service.intface.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

  private final CategoryRepository categoryRepository;

  public Flux<CategoryResponse> getAll() {
    return categoryRepository.findAll().map(this::mapToDto);
  }

  public Category getById(String id) {
    return categoryRepository.findById(id).block();
  }

  public CategoryResponse save(CategorySaveRequest request) {
    Category cat = Category.builder().code("C" + request.getName().charAt(0)).name(request.getName()).build();
    return mapToDto(categoryRepository.save(cat).block());
  }

  private CategoryResponse mapToDto(Category category) {
    if (category == null) {
      return null;
    }
    return CategoryResponse.builder().id(category.getId()).name(category.getName()).build();
  }
}
