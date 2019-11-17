

To use a subroutine, you would have to check whether the values of the parameters are legal. 
If not, you would throw the exception. 
For example, consider the print3NSequence subroutine. 
The parameter of print3NSequence is supposed to be a positive integer. 
We can modify the subroutine definition to make it throw an exception when this condition is violated:


If the start value is bad, the computer executes the throw statement. 
This will immediately terminate the subroutine, without executing the rest of the body of the subroutine. 
Furthermore, the program as a whole will crash unless the exception is "caught" and handled elsewhere in the program by a try..catch statement. 
For this to work, the subroutine call would have to be in the "try" part of the statement.


throw  new  IllegalArgumentException( error-message );