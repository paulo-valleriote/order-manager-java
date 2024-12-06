package br.com.pv.order_manager.modules.notifications.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class Notification {
  private UUID id;
  private NotificationType type;
  private String payload;
  private LocalDateTime sentAt;
  private LocalDateTime viewedAt;
}
