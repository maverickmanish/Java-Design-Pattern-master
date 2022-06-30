# Singleton Design Pattern

  

This is one of the most simple Design Pattern.

  

Singleton Design pattern restricts the instantiation of a class to only one object.

  

> Real life usage includes creating only one database connection which can be shared by multiple objects. 
*Also, one thing that needs to be considered for such scenario is making the connection thread safe.*

  

## Pitfalls 

  

- This pattern is often overused. Because of the simplicity and power of singleton, people tends to make everything singleton when it doesn't necessarily need to be.

- This pattern makes unit testing difficult.

- Not thread-safe, if not implemented correctly.

  

## Contrast to Factory pattern 

| Singleton                          | Factory                         |
|-------------------------------|-----------------------------|
Returns same instance.            |Returns various instances            |
No interface           |Interface driven          |
One constructor method - no args|Multiple constructors|
| | Adaptable to environment more easily|
|
