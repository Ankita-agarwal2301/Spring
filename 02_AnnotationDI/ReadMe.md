## SPRING 
(Annotation Based DI and autowiring)

### Dependency Injection :
Spring provides a light-weight container, e.g. the Spring core container, for dependency injection (DI). This container lets you inject required objects into other objects.

### IOC: is a design pattern that implement Dependency injection


Injecting dependency by an external dependency (IOC core container)
we have 2 approaches to implement it
 1. XML - 
 2. programming - annotation

[Reference](https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#spring-core)


 
### Annotation Based DI 
Instead of using XML to describe a bean wiring, the developer moves the configuration into the component class itself by using annotations on the relevant class, method, or field declaration
 
 `Factory Method` - 
  which returns an object 
  Student getStudent()
  {
  return new Student();
  }
  
  Configuration class uses factory method
 @Bean 
  - can be defined to a factory method
  - construct the object by passing all dependencies
 
 `AnnotationConfigApplicationContext` - 
 In much the same way that Spring XML files are used as input when instantiating a ClassPathXmlApplicationContext, you can use  @Configuration classes as input when instantiating an AnnotationConfigApplicationContext. This allows for completely XML-free usage of the Spring container
 
 
### `Autowiring dependency` -
 when we don't want to inject dependency
 
 @Component - 
 - can be defined at class level
 - don't use factory method with @Bean 
 - Beans are constructed and maintained by core container
 
 @ComponentScan - 
 - can be used in configuration classes
 - to scan for the component in the base package defined
  
 @Autowired - 
  - can be used to  autowire the dependency (can be done at property level , class level . )
  
 @Qualifier - 
 bean matching with this name , only qualifies for autowiring
 The @Qualifier annotation along with @Autowired can be used to remove the confusion by specifying which exact bean will be wired.
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
Spring beans
 - obj or instances - which are constructed or maitanied by ioc container
 
 




