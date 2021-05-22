package com.avk44.avkshopping.product.service.impl;

import com.avk44.avkshopping.product.domain.mongo.MoneyTypes;
import com.avk44.avkshopping.product.service.intface.ProductDeliveryService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProductDeliveryServiceImpl implements ProductDeliveryService {


  public String getDeliveryInfo(String productId) {
    // TODO
    return "Tomorrow";
  }

  public boolean freeDeliveryCheck(String productId, BigDecimal price, MoneyTypes moneyType) {
    // TODO
    return true;
  }
}
