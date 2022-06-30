# Factory Method


In this design pattern, we create objects without exposing instantiation logic to clients. All that client knows is a common interface that the factory exposes. 

> In the example codes given here, we are providing website creation service to our clients. 

In the [WebsiteFactory.java](https://github.com/darpanjbora/Java-Design-Pattern/blob/master/Factory/exercises/WebsiteFactory.java) file, we are exposing a static member function `getWebsite()`which depending upon client's website type selection will create and return objects. 

## Pitfalls
- Complexity 
- Creation in subclasses
- Not a kind of pattern which is generally refactored into


