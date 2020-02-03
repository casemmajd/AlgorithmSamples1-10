The newest version of Java, Java 8, makes a few useful additions to interfaces. 
The one that I will discuss here is default methods. Unlike the usual abstract methods in interfaces, a default method has an implementation. 
When a class implements the interface, it does not have to provide an implementation for the default method -- although it can do so if it wants to provide a different implementation. 
Essentially, default methods are inherited from interfaces in much the same way that ordinary methods are inherited from classes. 
This moves Java partway towards supporting multiple inheritance. 
It's not true multiple inheritance, however, since interfaces still cannot define instance variables.

A default method in an interface must be marked with the modifier default. 
It can optionally be marked public but, as for everything else in interfaces, default methods are automatically public and the public modifier can be omitted.