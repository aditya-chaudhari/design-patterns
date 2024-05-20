
# Facade Pattern

Facade means the front wall of a **large building** that you see from the outside.

Facade Pattern means adding a simplified layer between client and complicated library or logic. For example if for performing a task we need to coordination betweeen multiple classes and methods we can use facade pattern which will take care of these complicated logic and will provide client a simple method to call.

## Explaination

For Understanding Facade pattern consider we have to use an third party library for authentication and it provides couple of methods which we need to call in order for it to work.

As it is a third party library, if the method changes we don't want the underlying classes to change otherwise testing and scope of the work will increase. Hence we should use a facade pattern which will take care of abstracting the complicated logic of calling multiple methods and provide a simple method to client for use.

Here the Facade Class will take care of validating a token which requires call to multiple methods of third party library 

## Source

- https://refactoring.guru/design-patterns/facade
