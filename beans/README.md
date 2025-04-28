# Spring Beans

What is a Spring Bean?

A Spring Bean is a Java object that is managed by the Spring IoC (Inversion of Control) container.<br>
When we annotate a class with @Component or its specializations like @Controller, @Service, @Repository... Spring automatically creates a bean of that class and stores it in the Application Context.
<hr>

What is Depencency Injection (DI)?

Dependency Injection (DI) is a design pattern in which an object receives the objects it depends on from an external source instead of creating them itself.

In our DI code example, which is present in ".beans.di" package, our VehicleController is dependent on Car object, which Car in trun is dependent on Engine object.<br>
When Spring start to create Beans from Engine class, it checks that Car requires Engine, so it injects an Engine object at runtime.

There are 3 types of DI:
- Field based DI
- Constructor based DI
- Setter based DI

In our example, we have used Constructor based DI, as it is the most used and loosely coupled.
<hr>

Bean Lifecycle:

In Spring, a bean goes through various stages from creation to destruction.<br>
Bean definition -> Instantiation -> Dependency Injection -> Initialization -> Ready to use -> Destruction<br>
Spring provides several mechanisms to execute logic during the initialization and destruction phases of a bean's lifecycle.

- Post-Construct (Initialization)<br>
- Pre-Destroy (Destruction)

In the output of code example, the @PostConstruct is called just after injecting dependencies (if present), or else after instantiaing (if none are present for the current bean).<br>
The @PreDestroy is called just before the application shuts down completely.

There are multiple ways to perform this - Annotation-based, Interface-based, Method-based, etc.
Out of which The Annotation-based (i.e. using @PostConstruct and @PreDestroy) is preferred as it keeps the code cleaner.

In our Interface-based example, afterPropertiesSet() is similar to @PostConstruct and destroy() is similar to @PreDestroy.
