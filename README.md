# BankingApplication
An applicaiton that uses Postman to fetch and send user data using Spring Securities JWT authentication and authorization. This was apart of Multivers's final project module that allowed us to showcase a porject using tools and systems that we use on the Job.

# Overview
Once the user sends an HTTP request to the backend system which is running springboot container. The JwtAuthFilter will check the JWT token and extract the email and will use that email to fetch the user details information from the database then once the user is fetched, will have the response from the database which can be an existing user or non existing user, once we get the response from the JwtAuthFilter, then from there will start the validation process mechanism which will try to call the JwtService which will take a parameter the user itself and also the string token, after the execution of the validation process, well update the security context holder and set the connected user, once it is updated it will dispatch the request and it will dispatchservlet it will send directly to the controller which will do all the execution like calling the service. And will send back a response back to the user.


# Technologies
- Java 17
- Spring web
- Spring Security
- Spring Data JPA
- PostgreSQL
- Lombok
- Postman
