As an example, we will write an animation program, based on the same animation framework that was used in C021_RandomMosaicWalk. 
The animation shows a number of semi-transparent disk that grow in size as the animation plays. 
The disks have random colors and locations. 
When a disk gets too big, or sometimes just at random, the disk disappears and is replaced with a new disk at a random location.

A disk in this program can be represented as an object. A disk has properties -- color, location, and size -- that can be instance variables in the object.
We need to be able to draw it, so we can include an instance method draw(g), where g is a graphics context that will be used to do the drawing. 
The class can also include one or more constructors. 
A constructor initializes the object. 
It's not always clear what data should be provided as parameters to the constructors. 
In this case, as an example, the constructor's parameters specify the location and size for the circle, but the constructor makes up a color using random values for the red, green, and blue components.


The main program for my animation is a class GrowingCircleAnimation. 
The program uses 100 disks, each one represented by an object of type CircleInfo. 
To make that manageable, the program uses an array of objects. 
