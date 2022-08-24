## README

#### Spring WebFlux and Reactive WebClient Demo Project 
* In this demo project you may example of reactive endpoints built on top of Spring WebFlux, and using WebClient for calling other resources.

>> 1. Explaining different communication models in reactive application with Spring WebFlux. Differences between standard application/json content type and application/stream+json. Introduction to back pressure term. Detailed description can be found here: Using Reactive WebClient with Spring WebFlux
>>>
>> 2. A detailed analysis of threading and concurrency model used by Spring WebFlux and Reactor Netty. It also threats about WebClient and Spring Boot Actuator pooling. A detailed description can be found here: A Deep Dive Into Spring WebFlux Threading Model
Guide
### Required:

* JDK 11+
* Maven
### How to run ? mvn clean install
````
mvn : clean
mvn : compile
mvn : test
mvn : run
````
###### To provide some standalone tests just run the main class SampleSpringWebFluxApp. For generating some traffic to the application run application SendingApp. It runs MockWebServer on localhost:8082 in order to mock downstream service called by WebClient and then calls endpoints exposed by the application using TestRestTemplate.