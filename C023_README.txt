This function makes a copy of its parameter, except that it leaves out all the elements of list that are equal to zero. 
It builds a new array that contains all the non-zero elements of list, and it returns that array as the value of the function. 
(Note that this is an example of using an array type as the return type of a function.)

The function creates a new array to be the return value. 
But to do that, it must know how long to make the array. 
The first five lines of the function definition count the number of non-zero elements in list. 
This is how many spaces we need in the new array, so count is used as the length when the new array is created. 
The remainder of the function goes through the original list and copies elements into newList. 
An element is copied only if it is non-zero. 
We have to keep track of how many spaces in newList have been filled so far. 
That's what j is for. This is the "partially filled array" pattern.

