
# Factory method

Factory Method is used to encapsulate the new keyword. It is useful when creation of  object requires an business logic or has heavy computation.

Factory Method is used when we don’t know what kind of object we will be dealing with.

Advantage of Factory Method is loose coupling, if we want to alter the logic of how object is created we just need to change factory class. 

It is called Factory Method because it enforces to create an interface which will have an factory method to create object

## Explaination

For Creating FactoryMethod we will need to create an interface for shared object (ILogger) and an interface for FactoryClass (ILoggerFactory). So that these interfaces can be extended to create different implementation.

The client class (Main) will use interfaces to call methods, and the implementation can be provided from outside the client or from within the client. As client is working with interface object if an new implementation is added we can support it with minimal changes.


## Screenshots


![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)


## Source

- https://www.pentalog.com/blog/design-patterns/factory-method-design-pattern

- https://refactoring.guru/design-patterns/factory-method 