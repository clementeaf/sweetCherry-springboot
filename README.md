## Spring Boot Project
- Description:
  -   This is a Spring Boot project that provides an API for CRUD operations on a MySQL database.

- Configuration:
  -Requirements:
        - Java 17
        - Maven 3.8.8
        - MySQL 8.0

- Steps to Run:
  - Clone this repository.
  - Go to path where you downloaded the app and from the command line: mvn clean install (make sure you are at /path/to/crud)
  - run: sudo docker-compose up to initialize the database
  - run: mvn spring-boot:run
  - the app will be available in: http://localhost:4000/swagger-ui/index.html#/product-controller/getAllProducts