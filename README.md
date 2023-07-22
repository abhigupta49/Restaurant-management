# Restaurant Management System

The Restaurant Management System is a web application built with Spring Boot that allows users to manage food items, place orders, and perform user management tasks. The system provides different levels of access based on user roles, such as admin, normal user, and visitor.

## Features

- User Management:
     - User signup and sign-in functionality
    - User roles: admin, normal user, and visitor
    - Role-based access control: admin has additional privileges compared to normal users and visitors
     - User profile management

- Food Item Management:
    - Admin can create food items with a title, description, price, and dummy image URL
    - Visitors and normal users can view food items

- Order Management:
  - Normal users can place orders for food items
  - Admin can view all orders and update their status (created, dispatched, delivered)

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL (or any other database of your choice)
- RESTful APIs
- Maven

