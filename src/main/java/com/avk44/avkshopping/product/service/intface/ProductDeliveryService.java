package com.avk44.avkshopping.product.service.intface;

import com.avk44.avkshopping.product.domain.mongo.MoneyTypes;

import java.math.BigDecimal;

public interface ProductDeliveryService {

  String getDeliveryInfo(String productId);
  boolean freeDeliveryCheck(String productId, BigDecimal price, MoneyTypes moneyType);
}
