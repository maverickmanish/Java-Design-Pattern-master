# Abstract Factory Method

This factory is known as factory of factories. This pattern comprises of a super-factory which in turns create other factories.

> In the example codes given here, I am providing a credit card creation application. 

In the [CreditCardFactory.java](https://github.com/darpanjbora/Java-Design-Pattern/blob/master/AbstractFactory/exercises/CreditCardFactory.java) file, we create new credit card factory, either   [AmexFactory.java](https://github.com/darpanjbora/Java-Design-Pattern/blob/master/AbstractFactory/exercises/AmexFactory.java) or [VisaFactory.java](https://github.com/darpanjbora/Java-Design-Pattern/blob/master/AbstractFactory/exercises/VisaFactory.java), based on the credit score, but none of the classes has any idea about the implementation of the other class. Again, we create another factory inside of those classes. So, there's a chain of factory, where [CreditCardFactory.java](https://github.com/darpanjbora/Java-Design-Pattern/blob/master/AbstractFactory/exercises/CreditCardFactory.java) is the super factory which creates other factories eventually.

## Pitfalls
- Complexity 
- Runtime Switch - The client has influence what the switches are for.
- Pattern within a pattern
- Problem specific
- Starts as a factory