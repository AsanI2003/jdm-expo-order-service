# jdm-expo-order-service
Document database-backed microservice built with Spring Data MongoDB and MongoDB for processing vehicle reservation orders in the JDM Expo platform.<br> <br>
* **Student Name:** A.G.Asan Indusara
* **Student Number:** 241722063
* **GCP Project ID:** <br> <br>
## Technology Stack
* **Language:** Java 25
* **Framework:** Spring Boot
* **Data Layer:** Spring Data MongoDB, MongoDB
* **Cloud Infrastructure:** Spring Cloud Netflix Eureka Client, Spring Cloud Config Client
## API Endpoints
* `POST /api/v1/orders` - Submit a new vehicle reservation
* `GET /api/v1/orders/{id}` - Retrieve reservation details by Order ID
## Getting Started / Setup Instructions
1. Clone this repository: git clone https://github.com/AsanI2003/jdm-expo-order-service.git
2. Navigate to the project folder: cd jdm-expo-order-service
3. Ensure MySQL is running locally and database parameters are configured in application.yml.
4. Build and run the application: ./mvnw spring-boot:run
5. The service automatically registers with the Eureka Server and runs on port 8082 by default.
