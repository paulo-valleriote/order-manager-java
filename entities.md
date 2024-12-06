# System Entities

## User
### Description

User is the entity that represents a user in the system, can be an customer or an admin.

### Attributes

- id
- name
- email
- password
- role
- createdAt

## Product
### Description

Product is the entity that represents a product in the system.

### Attributes

- id
- name
- description
- price
- stockQuantity
- createdAt
- updatedAt

## Order
### Description

Order is the entity that represents an order in the system.

### Attributes

- id
- customerId
- status (PENDING, PROCESSED, SENDED, DELIVERED, CANCELLED)
- totalPrice
- createdAt
- updatedAt

## OrderItem
### Description

OrderItem is the entity that represents an item in an order in the system.

### Attributes

- id
- orderId
- productId
- quantity
- price

## Notification
### Description

Notification is the entity that represents a notification in the system.

### Attributes

- id
- type (CREATED, UPDATED, CANCELLED)
- payload
- sentAt
- sentTo
- viewedAt
