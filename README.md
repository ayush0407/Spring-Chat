# Spring-Chat
This is an event driven chat application made using spring-boot and Java .

# Important Notes regarding properties file.
By setting spring.jpa.properties.hibernate.boot.allow_jdbc_metadata_access to false, 
Hibernate no longer tries to access the JDBC metadata during startup, 
which can help avoid certain connection-related issues.

# Commands to run Stomp Rabbit Mq on Local environment.
rabbitmq-server start
rabbitmqctl status
sudo rabbitmq-plugins enable rabbitmq_stomp

# UI credits to JavaInUse.com
As my focus was to create a backend, so I took the UI code from the above-mentioned 
website and modified it according to my code.