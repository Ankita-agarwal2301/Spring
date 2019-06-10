## SPRING

- Disadvantages of ENTERPRISE APPLication with Java EE

1. heavy weight
2. 3 tier structure : Presentation , business , database
3. complexities 
4. dependencies
5. configurations

- Spring benefits : 
1. solving difficulties of enterprise application development
2. support enterprise app development through POJO
3. Easy integration with other framework
4. Application testing
5. Modularity
6. Spring transaction management


### Create a maven project with spring (Eclipse)

add dependency of spring in pom.xml
https://mvnrepository.com/artifact/org.springframework/spring-context/5.1.5.RELEASE

### Dependency Injection :
Spring provides a light-weight container, e.g. the Spring core container, for dependency injection (DI). This container lets you inject required objects into other objects.

### IOC: is a design pattern that implement Dependency injection


injecting dependency by an external dependency (IOC core container)
we have 2 approaches to implement it
 1. XML - 
 2. programming - annotation
 
`Spring beans`
objects or instances constructed and maintained by IOC container


[Reference](https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#spring-core)

Instantiate core container:
- ApplicationContext
- 

### Scope: 
 `Singleton`  - evrytimw we ask for a instance only one instance created
by default if no scope is mentioned , it is considered as singleton	
 `prototype` - 
 
### Lifecycle :
 
 init-method - code for initialization
 destroy-method - code for cleanup
 
 default-destroy-method - for coomen for every bean4
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
Spring beans
 - obj or instances - which are constructed or maitanied by ioc container
 
 




