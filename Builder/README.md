# Builder Design Pattern

  ## Why do we need Builder Design Pattern? 

>Let's take an example to understand this. Suppose we want to design an application for a store which delivers sandwiches. 

So we created a class for our application and named it `PrepareFood`.
After that we'll go for either of these two approaches to design that class - 

- **Telescoping Constructor pattern** - In this approach, we create constructors to create and set values to each parameter of the object. Refer the [PrepareFoodTC.java](https://github.com/darpanjbora/Java-Design-Pattern/blob/master/Builder/exercises/PrepareFoodTC.java) file for the code. 

But what if some customer doesn't want veggies in the sandwich? Or say sauces? We would need to write constructors for all cases then. 

- **JavaBean pattern** - In this approach, we create a no-arguments constructor to create an object and called the setter method on this object to set values to each parameter. Refer the [PrepareFoodBean.java](https://github.com/darpanjbora/Java-Design-Pattern/blob/master/Builder/exercises/PrepareFoodBean.java) file for the code.

This solution looks perfect, right? But it has some drawbacks too. JavaBean makes a class `mutable`. Also, it creates an object which is `inconsistent` unless all the parameters are set explicitly. 

This is where `Builder Design Pattern` comes into play! This pattern is great for handling the construction of objects that may contain a lot of parameters, and we want to make the object immutable once we're done constructing it. Refer the [PrepareFood.java](https://github.com/darpanjbora/Java-Design-Pattern/blob/master/Builder/exercises/PrepareFood.java) for the code. 

## Summary
- Objects created by this pattern are immutable. 
- It is a creative way to deal with complexity surrounding constructors in the creation of objects. 
- Easy to implement. 
