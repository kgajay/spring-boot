Spring boot app 

Reference: http://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-first-application.html

Dependency:
    A) maven3
    
    B) java 1.8
    
    C) Eclipse or IntelliJIdea
    
    
Steps:
   A) git clone <clone path>
   
   B) cd to clone directory
   
   c) run mvn clean package
   
   d) check for if build is success
   
   e) to run app => 
        java -jar target/spring-boot-1.0-SNAPSHOT.jar --spring.config.location=classpath:/application.properties  --logging.config=src/main/resources/logback.xml
   
   f) API:
   
       curl -X GET http://127.0.0.1:8080/health
       
       curl -X GET http://127.0.0.1:8080/v1/index
       
       curl -X GET http://127.0.0.1:8080/v1/sample-bean
       
