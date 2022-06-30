# Prototype Design Pattern

## When do we need it? 

> Let's take an example to understand this. Say, I am going to create an e-commerce website which sells only movies and books. I would need to create objects for each movies and books and object creation may include costly operations. What would be the best approach in such a scenario? 

Prototype Design Pattern can be helpful in such scenarios. The concept behind this design pattern is we copy the existing object instead of creating a new instance, which may include costly operations everytime. The existing object acts as a prototype and contains the state of the object. 

For the above-mentioned example, we created two classes [Book.java](https://github.com/darpanjbora/Java-Design-Pattern/blob/master/Prototype/exercises/Book.java) and [Movie.java](https://github.com/darpanjbora/Java-Design-Pattern/blob/master/Prototype/exercises/Movie.java) and inherited the [Item.java](https://github.com/darpanjbora/Java-Design-Pattern/blob/master/Prototype/exercises/Item.java) class. 

These two classes will act as prototypes for us. 

Then we create a [Registry](https://github.com/darpanjbora/Java-Design-Pattern/blob/master/Prototype/exercises/Registry.java) which will basically clone the prototype everytime we will need a new instance. 

## Pitfalls
- Most of the time it needs to be used with other patterns.
	- Registry. 
- Shallow vs Deep Copy. 

## Summary
- It gurantees an unique instance everytime. 
- Often refactored in. 
- Can help in performance issues. 