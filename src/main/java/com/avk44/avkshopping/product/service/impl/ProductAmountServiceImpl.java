package com.avk44.avkshopping.product.service.impl;

import com.avk44.avkshopping.product.service.intface.ProductAmountService;
import org.springframework.stereotype.Service;

@Service
public class ProductAmountServiceImpl implements ProductAmountService{

  public int getByProductId(String productId) {
    return 10;
  }
}
