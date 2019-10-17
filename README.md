# Machine Test API - Demonstrating Spring Boot and Java Generics
This is a Spring boot REST API demonstrates following technologies
#### Technologies invloved
* Spring boot - Development Framework
* Spring Data - ORM Framework
* Guava Cache - Caching framework 
* Jackson - JSON Library with XML support
* H2 - Inmemory database
* Swagger - API Documentation and UI client support

#### Modules involved
The API has combination of two apis internally which are 
1. Employee API
2. Customer API

## Employee API
This API demonsrates the ability of Java generics to write widely reusable for common operations. Basic CRUD operations are carried out though a Generic workflow for any type of object.
API exposes CRUD endpoints according to different usecases/entities but internally shares the common generic implementation. 

## Customer API
This API demonstrates the ability of flexibility in receiving/producing request and reponse in any data formats like JSON, XML. It demonstrates libraries supported by Spring Boot to define the input types and output types in convertible to different formats.
API exposes two endpoints to save customer details and fetch the stored details but the api can send and recieve combinations of JSON and XML type of input and output types.

## Run 
Application is based on Maven(Pre-requestie) and start up command to run the application is as below 
> mvn spring-boot:run

## API UI Client 
UI client is enabled using Swagger UI and it can be accessed with the url given below
> http://localhost:8080/swagger-ui.html

## H2 Database console
H2 database can be accessed with HTML based client starts with the application and it can be access with url given below
> http://localhost:8080/h2-console
