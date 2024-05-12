
# Strategy Pattern

The Strategy pattern suggests to take a class that does something specific in a lot of different ways then extract all of these algorithms into separate classes called strategies.

This will help the client use the Strategy/Algorithm which they want to use while keeping the class closed for modification.

This will also help in testing as making changes to one algorithm will only require us to test only that algorithm.
## Explaination

For Using Strategy Pattern, we will need to create an interface for Strategy (ILoggingStrategy).
Now, the class will need to use an object of the interface in-order to do the algorithmic computation.

After the class is ready, client can choose from the algorithms (CredentialLoggerStrategy, FormattedLoggerStrategy) which fits their usecase.

## Screenshots


![Class Diagram](https://github.com/aditya-chaudhari/design-patterns/blob/main/strategy-pattern/images/StrategyPattern.png)


## Source

- https://refactoring.guru/design-patterns/strategy
