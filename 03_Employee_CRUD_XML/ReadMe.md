### WEB APP 

(App to add and delete employee data in arraylist using XML method)
 
### MVC
 
`FRONT CONTROLLER DESIGN PATTERN`
The front controller design pattern is used to provide a centralized request handling mechanism so that all requests will be handled by a single handler. This handler can do the authentication/ authorization/ logging or tracking of request and then pass the requests to corresponding handlers. Following are the entities of this type of design pattern.

Spring MVC is based on front controller design pattern followed by MVC design pattern

DispatcherServlet : front controller
HandlerMapping - will map each url request to particular Controller , so it will identify the controller
Controller - will construct Model object , and give logical name of view jsp(instead of directly delegating it) .
View resolver - have mapping of actual jsp mapping to logical name , and give ultimate response back accordingly

  	 
 PRACTICAL - 
 In eclipse create a Maven project , select web app instead of quickstart.
 
 Now add dependency in pom.xml
 - Spring Web MVC
 - Servlet (javax.servlet)
 - Jstl (javax.servlet)
 
 - now click on run on server , and configure server Apache Tomcat
 
 1.- `configure web.xml` to configure Front controller design pattern , to inform that every user request has to goto DispatcherServlet  , configure Servlet mapping in web.xml (servlet name - dispatcher)
 
 (Reference )[https://docs.spring.io/spring/docs/3.2.x/spring-framework-reference/html/mvc.html]
 
 - copy the <web-app> configuration
  <web-app>

    <servlet>
        <servlet-name>dispatcher</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>

    <servlet-mapping>
        <servlet-name>dispatcher</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>

</web-app>


 - In the Web MVC framework, each DispatcherServlet has its own WebApplicationContext, which inherits all the beans already defined in the root WebApplicationContext. These inherited beans can be overridden in the servlet-specific scope, and you can define new scope-specific beans local to a given Servlet instance.
 
 - Upon initialization of a DispatcherServlet, Spring MVC looks for a file named [servlet-name]-servlet.xml in the WEB-INF directory of your web application and creates the beans defined there, overriding the definitions of any beans defined with the same name in the global scope.
 
 2. So create `dispatcher-servlet.xml` and add bean configuration in it, also define base-package 
 WEB-INF - dispatcher-servlet.xml
 
 copy from 17.3.1 Defining a controller with @Controller
 (Reference )[https://docs.spring.io/spring/docs/3.2.x/spring-framework-reference/html/mvc.html]
 
	<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:p="http://www.springframework.org/schema/p"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="
        http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd">

    <context:component-scan base-package="org.springframework.samples.petclinic.web"/>

    <!-- ... -->

</beans>

 - change base package  
 - `Configure View resolver` , that can map logical name of jsp to actual jsp name
 - we will use InternalResourceViewResolver
 
	 <bean id="jspViewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
  <property name="viewClass" value="org.springframework.web.servlet.view.JstlView"/>
  <property name="prefix" value="/WEB-INF/jsp/"/>
  <property name="suffix" value=".jsp"/>
</bean>

 - created a folder views for all jsp pages
  - change prefix accordingly in above config(we have created view folder for all jsp and changed prefix)
  
  
  3 . `CONTROLLER`
 - Add @Controller to make it a controller
 - whatever mapping we do inside it , will be mapped by URL's
 - request mapping done by @GetMapping , @PostMapping , etc
 
  4 . Modify index.jsp 
  
 add use this page directive to write java code in html
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 and isELIgnored="false"  
 
 (Form -- DispatcherServlet -- EmployeeContoller -- DB)
 
 5 . EmployeeRepository - to perform DB operations
 using ArrayList for DB storage
 
 6 . As we are using XML approach , so create bean.xml
 use bean definition from dispatcher-servlet.xml to configure beans
 this file is used to handle beans to be managed by core container (like instantiation)
 
 7. `modelAttribute` 
 The @ModelAttribute is an annotation that binds a method parameter or method return value to a named model attribute and then exposes it to a web view. 
 
 modelAttribute="employee" in index,.jsp and define name="id" for every property matching with attributes of class
 @ModelAttribute("employee") in controller

 [Reference](https://docs.spring.io/spring/docs/3.2.x/spring-framework-reference/html/mvc.html)
 
 
8. use ClassPathXmlApplicationContext in controller for configurations

9. use ModelMap - to map model from controller to jsp , we use this.

