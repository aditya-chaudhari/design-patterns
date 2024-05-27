
# Adapter Pattern

Adapter Pattern is used when we want to communicate with an method or library which has a different way of communication.

We will create an adapter which will act as a translater and do the object conversion for us.

Advantage of Adapter Pattern is loose coupling, if the library changes its implementation we will just need to update the interface. Another Advantage is we can use adapter pattern if we want to change the method signature but don't want the client to know about it.

## Explaination

Here we have taken an example of Fitness Library which has an class to calculate BMI but it accepts weight in lbs and height in inches. We cannot use this library because our code is tightly coupled or is designed to work only with weight in KG and height in meters for some reason. 

To Solve this we will use adapter pattern which will do the conversion for us. The client class (Main) will use adapter methods to calculate BMI without knowing that underhood conversion is happening

## Source

- https://refactoring.guru/design-patterns/adapter
