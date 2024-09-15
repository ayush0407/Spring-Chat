# Spring-Chat
This is an event driven chat application made using spring-boot and Java .

# Important Notes regarding properties file.
By setting spring.jpa.properties.hibernate.boot.allow_jdbc_metadata_access to false, 
Hibernate no longer tries to access the JDBC metadata during startup, 
which can help avoid certain connection-related issues.
