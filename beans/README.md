# Spring Beans

What is a Spring Bean?

A Spring Bean is a Java object that is managed by the Spring IoC (Inversion of Control) container.<br>
When we annotate a class with @Component or its specializations like @Controller, @Service, @Repository... Spring automatically creates a bean of that class and stores it in the Application Context.

What is Depencency Injection (DI)?

Dependency Injection (DI) is a design pattern in which an object receives the objects it depends on from an external source instead of creating them itself.

In our DI code example, which is present in ".beans.di" package, our VehicleController is dependent on Car object, which Car in trun is dependent on Engine object.<br>
When Spring start to create Beans from Engine class, it checks that Car requires Engine, so it injects an Engine object at runtime.
