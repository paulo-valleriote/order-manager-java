package br.com.pv.order_manager.modules.orders.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "orders")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  
  @Enumerated(EnumType.STRING)
  private OrderStatus status;

  @Column(name = "total_price")
  private BigDecimal totalPrice;
  
  @Column(name = "created_at")
  @CreationTimestamp
  private LocalDateTime createdAt;
  @Column(name = "updated_at")
  @UpdateTimestamp
  private LocalDateTime updatedAt;
}
