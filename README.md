# Spring Boot Project - smalled-missing-positive-integer
positive-integer-in-given-array

This is a sample Spring Boot project that expose API which takes input as array and returns the smallest missing position integer from that list 

## Getting Started

### Prerequisites

- Java 11 or later
- Maven 3.8.3 or later

### Building the Project

To build the project, run the following command in the root directory:

**mvn clean install**

### Running the Project

To run the project, run the following command in the root directory:

**mvn spring-boot:run**

This will start the application on port 8080.

### Testing the Project

To test the project, run the following command in the root directory:

**mvn test**


This will run all the unit tests in the project.

## Features

This project includes the following features:

- A RESTful API that expose API which takes input as array and returns the smallest missing position integer from that list

### Input Validation
- Input array should be nonempty. 
- Input array should consist at least one positive element. 

### Documentation
- The API documentation is generated using Swagger UI and is available at http://localhost:8080/swagger-ui.html.
- The API specification is available in JSON format at http://localhost:8080/v3/api-docs.
