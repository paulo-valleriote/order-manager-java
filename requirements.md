# ORDER MANAGEMENT API

## Functional Requirements

- [] System should be able to handle Users
  - [] User should be able to register
  - [] User should be able to login
    - [] System should validate user credentials
    - [] System should generate a JWT token
    - [] System should use RBAC (Role Based Access Control) with ADMIN and CUSTOMER roles
  - [] User should be able to logout
  - [] User should be able to change password
  - [] User should be able to delete their account
  - [] System should be able to retrieve a user by his id
  - [] System should be able to retrieve a user by his email
  - [] System should be able to retrieve all users
- [] System should be able to handle Products
  - [] System should be able to create a product
  - [] System should be able to retrieve a product by its id
  - [] System should be able to retrieve all products
  - [] System should be able to update a product
  - [] System should be able to delete a product
  - [] System should be able to search products by name, description, price, etc.
  - [] System should be able to filter products by price, category, etc.
  - [] System should be able to sort products by price, name, etc.
  - [] System should be able to paginate products
  - [] System only should allow ADMIN users to create, update and delete products
- [] System should be able to handle Orders
  - [] System should be able to create an order
  - [] System should be able to retrieve an order by its id
  - [] System should be able to retrieve all orders
  - [] System should be able to update an order
  - [] System should be able to delete an order
- [] System should be able to handle Notifications
  - [] System should be able to send a message to a queue when an order is created
  - [] System should be able to send a message to a queue when an order is updated
  - [] System should be able to send a message to a queue when an order is deleted
  - [] System should be able to send a notification to a user through a queue consumer service
- [] System should be able to generate reports
  - [] System should be able to generate a report of the number of orders per user
  - [] System should be able to generate a report of the number of orders per product
  - [] System should be able to generate a report of the total revenue per product
  - [] System should be able to generate a report of the total revenue per user

## Non-Functional Requirements

- [] Security
  - [] System routes should be protected and only accessible by authenticated users
  - [] System should use JWT tokens to authenticate users
  - [] System should use RBAC to manage user roles and permissions
- [] Scalability
  - [] System should use RabbitMQ to handle async messages
- [] Portability
  - [] System should be executed on a container platform like Docker
  - [] System should use an orchestration platform like Docker Compose to handle Database and Queue Broker Service (PostgreSQL and RabbitMQ)
- [] Code Quality
  - [] System should have unit tests and integration tests
  - [] System should have a CI/CD pipeline (optional for now)
- [] Documentation
  - [] System should be documented using Swagger
  - [] System should have a `README.md` file explaining how to run the system and its dependencies (later)

## Technical Requirements

- [] Back-end with Java using Spring Boot
- [] Security using Spring Security and JWT
- [] Database with PostgreSQL
- [] Queue Broker Service with RabbitMQ
- [] API Documentation with Swagger
- [] Deploy with Docker and Docker Compose
- [] Tests with JUnit and Mockito
