package br.com.pv.order_manager.modules.products.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Product {
  private UUID id;
  private String name;
  private String description;
  private BigDecimal price;
  private Integer stockQuantity;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}
