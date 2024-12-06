package br.com.pv.order_manager.modules.users.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class User {
  private UUID id;
  private String name;
  private String email;
  private String password;
  private UserRole role;
  private LocalDateTime createdAt;
}
