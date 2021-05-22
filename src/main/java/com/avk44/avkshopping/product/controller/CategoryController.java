package com.avk44.avkshopping.product.controller;


import com.avk44.avkshopping.product.model.category.CategoryResponse;
import com.avk44.avkshopping.product.service.intface.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
@CrossOrigin("*")
public class CategoryController {

  private final CategoryService categoryService;

  @GetMapping
  public Flux<CategoryResponse> getAll() {
    return categoryService.getAll();
  }
}
