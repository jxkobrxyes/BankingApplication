# BankingApplication
An applicaiton that uses Postman to fetch and send user data using Spring Securities JWT authentication and authorization. This was apart of Multivers's final project module that allowed us to showcase a porject using tools and systems that we use on the Job.

# Overview
Once the user sends an HTTP request to the backend system which is running springboot container. 

<img width="541" alt="Screenshot 2023-07-27 at 10 20 45 AM" src="https://github.com/jxkobrxyes/BankingApplication/assets/79924650/91b5225f-3618-4d79-abb7-abd688543669">

The JwtAuthFilter will check the JWT token and extract the email and will use that email to fetch the user details information from the database then once the user is fetched, will have the response from the database which can be an existing user or non existing user.

<img width="824" alt="Screenshot 2023-07-27 at 10 14 27 AM" src="https://github.com/jxkobrxyes/BankingApplication/assets/79924650/69e12395-44f9-4f5b-9f39-d889cbf1d950">

once we get the response from the JwtAuthFilter, then from there will start the validation process mechanism which will try to call the JwtService which will take a parameter the user itself and also the string token, after the execution of the validation process, well update the security context holder and set the connected user, once it is updated it will dispatch the request and it will dispatchservlet it will send directly to the controller which will do all the execution like calling the service. And will send back a response back to the user.

# Technologies
- Java 17
- Spring web
- Spring Security
- Spring Data JPA
- PostgreSQL
- Lombok
- Postman

# Competencies
| Job Function | Description |
| --- | --- |
| JF 3.2 | Can explain the principles and uses of relational and non-relational databases |
| JF 3.6 | Can implement a RESTful API |
| JF 3.7 | Can implement authentication and authorization to an API |
| JF 3.8 | Can encrypt sensitive data via hashing  |
| JF 4.1 | Can explain organizational policies and procedures relating to the tasks being undertaken, and when to follow them. For example, the storage and treatment of sensitive data. |
| JF 4.2 | Acts with integrity with respect to ethical, legal and regulatory ensuring the protection of personal data, safety and security. |
| JF 4.4 | Can interpret and implement a given design while remaining compliant with security and maintainability requirements |
