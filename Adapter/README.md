# Adapter Pattern

Adapter pattern comes into play when we need to connect two incompatible interfaces. Like how we use the `Arrays.asList` method to convert an array to a list. This design pattern falls under structural category. It is easy to implement and useful when need to integrate something with legacy code which can't be modified.

In the example, [EmployeeClient.java](https://github.com/darpanjbora/Java-Design-Pattern/blob/master/Adapter/exercises/EmployeeClient.java) file fetches employee data from three different sources, DB, LDAP and CSV. And to overcome the differences among the data sources and maintain uniformity of data for the client, we use two adapters, namely [EmployeeLdapAdapter.java](https://github.com/darpanjbora/Java-Design-Pattern/blob/master/Adapter/exercises/EmployeeLdapAdapter.java) and [EmployeeCSVAdapter.java](https://github.com/darpanjbora/Java-Design-Pattern/blob/master/Adapter/exercises/EmployeeCSVAdapter.java).


## Pitfalls
- Don't complicate
- Mulitple Adapters
- Don't add functionality