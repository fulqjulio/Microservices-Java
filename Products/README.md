# Products Microservice

This is the Products microservice. It is responsible for handling all operations related to products.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

You need to have the following installed on your machine:

- Java 8 or higher
- Maven

### Installing

To install the project, follow these steps:

1. Clone the repository
2. Navigate to the project directory
3. Run `mvn clean install`

## Running the Application

To run the application, use the following command:

```
mvn spring-boot:run
```

## API Endpoints

The following endpoints are available:

- `GET /products`: Fetch all products
- `GET /products/{id}`: Fetch a single product by its ID
- `POST /products`: Create a new product
- `PUT /products/{id}`: Update an existing product
- `DELETE /products/{id}`: Delete a product

## Built With

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/)
- [Retrofit](https://square.github.io/retrofit/)

## Authors

- Your Name

## License

This project is licensed under the MIT License.