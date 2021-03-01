# Microservices
## Introduction To Web Services
### What is a web service?
Web Service - W3C Definition
- Software system designed to support interoperable machine-to-machine interaction over a network.
3 Keys
- Designed for machine-to-machine (or application-to-application) interaction
- Should be interoperable-Not platform dependent
- Should allow communication over a network
### Important How Questions related to Web Services
How does data exchange between applications take place?
- Application sends input call to web service (Request).
- Web service needs to send output back to application (Response).
How can we make web services platform independent?
- Make the request and the response platform independent.
How does the Application A know the format of Request and Response?
- The service definition.
    - Request/Response Format
        - JSON?
        - XML?
        - Other?
    - Request Structure
        - How can a consumer create a request?
        - What is the format of the request?
    - Response Structure
        - What is the structure of the response which is returned by the service?
    - Endpoint
        - Where is the service available?
### Web Services - Key Terminology
Request:
- The input of our service.
Response:
- Output from a web service.
Message Exchange Format:
- XML and JSON?
- What is the format of the request and response?
Service Provider/Server: 
- The one which hosts the web service
Service Consumer/Client: 
- The one which is consuming the web service.
Service Definition:
- The contract between the service provider and the service consumers.
Transport:
- Defines how a service is called.
- HTTP and MQ?
- Exposed over internet or queue?
### Introduction to SOAP Web Services
Web Service Groups:
- SOAP-based
    - Simple Object Access Protocol.
    - Uses XML as the request exchange format.
    - SOAP-ENV: Envelope which contains a header and body.
            - Header contains meta information like authentication, authorization, signatures, etc.
            - Body is where you put the real content of your request or your response.
    - Poses restrictions on the format of XML which is exchanged between your service provider and the service consumer.
    - Service Definiton:
        - Web Service Definition Language (WSDL)
- REST-styled
    - Defines an architectural approach.
- Format
    - SOAP XML Request
    - SOAP XML Response
- Transport
    - SAOP over MQ
    - SOAP over HTTP
- Service Definition
    - WSDL
### Introduction to RESTful Web Services
Rest:
- REpresentational State Transfer
- Format defined by Hyper Text Transfer Protocol(HTTP)
- GET request
- POST Request
- HTTP Header and body
- HTTP Methods
- HTTP Status Codes
- Data Exchange Format
    - No restrictions
    - JSON is popular
- Transport
    - Only HTTP
- Service Definition
    - No Standard, WADL/Swagger, etc.
### SOAP vs RESTful Web Services
- Restrictions vs Architectural Approach
- Data Exchange Format
- Service Definition
- Transport
- Ease of implementation

## Restful Web Services with Spring Boot
1. Initializing a RESTful Services Project with Spring Boot
2. Understanding the RESTful Services we would create in this course 
- Notes: Restful Web Services
    - Social Media Application
  
    - User -> Posts (one-to-many)
    - Retrieve all Users   - GET /users
    -  Create a User         - POST /users
    -  Retrieve one User   - GET users/{id} -> /users/1
    -  Delete a User          - DELETE users/{id} -> /users/1
    -  Retrieve all posts for a User - GET /users/{id}/posts
    -  Create a post for a User        - POST /users/{id}/posts
    -  Retrieve details of a post       - GET /users/{id}/posts/{post_id}
3. Creating a Hello World Service
4. Enhancing the Hello World Service to return a Bean
5. Quick Review of Spring Boot Auto Configuration and Dispatcher Servlet
- What is dispatcher servlet?
- Who is configuring dispatcher servlet?
- What does dispatcher servlet do?
- How does the HelloWorldBean object get converted to JSON? 
- Who is configuring the error mapping?
6. Enhancing the Hello World Service with a Path Variable
7. Creating User Bean and User Service
8. Implementing GET Methods for User Resource
9. Implementing POST Method to create User Resource
10. Enhancing POST Method to return correct HTTP Status Code and Location
11. Implementing Exception Handling - 404 Resource Not Found
12. Implementing Generic Exception Handling for all Resources 
13. Exercise: User Post Resource and Exception Handling
14. Implementing DELETE Method to delete a User Resource
15. Implementing Validations for RESTful Services
16. Implementing HATEOAS for RESTful Service
17. Overview of Advanced RESTful Service Features
18. Part:
    1. Internationalization for RESTful Services
    - Internationalization
        - i18n
    - Configuration
        - LocalResolver
        - Default Locale - Locale.US
        - ResourceBundleMessageSource
    - Usage
        - Autowire MessageSource 
        - @RequestHeader(value = “Accept-Language”, required = false) Locale locale
        - messageSource.getMessage(“helloWorld.message”, null, locale)
    - Internationalization for RESTful Services
19. Content Negotiation - Implementing Support for XML
20. Configuring Auto Generation of Swagger Documentation
21. Introduction to Swagger Documentation Format
22. Enhancing Swagger Documentation with Custom Annotations
23. Monitoring APIs with Spring Boot Actuator
24. Implementing Static Filtering for RESTful Service
25. Implementing Dynamic Filtering for RESTful Service
26. Versioning RESTful Services - Basic Approach with URIs- Versioning
- Media type versioning (a.k.a “content negotiation” or “accept header”)
    - Github
- (Custom) headers versioning
    - Microsoft
- URI Versioning
    - Twitter
- Parameter versioning
    - Amazon
- Factors
    - URI Pollution
    - Misuse of HTTP Headers
    - Caching
    - Can we execute the request on the browser?
    - API Documentation
-  No Perfect Solution
27. Versioning RESTful Services - Header and Content Negotiation Approach
28. Implementing Bacis Authentication with Spring Security
29. Overview of Connection RESTful Service to JPA
30. Creating User Entity and some test data Table structure - Create table user ( - Id integer not null, - birth_date timestamp, - Name varchar(255), - Primary key (id))
31. Updating GET methods on User Resource to use JPA
32. Updating POST and DELETE methods on User Resource to use JPA
33. Creating Post Entity and Many to One Relationship with User Entity
34. Implementing a GET service to retrieve all Posts of a User
35. Implementing a POST service to create a Post for a User
36. Richardson Maturity Model
37. RESTful Web Services - Best Practices
