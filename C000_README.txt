The "3N+1" problem: 
  (Recall that a 3N+1 sequence is computed according to the rule, "if N is odd, multiply it by 3 and add 1; if N is even, divide it by 2; continue until N is equal to 1." 
For example, starting from N=3 we get the sequence: 3, 10, 5, 16, 8, 4, 2, 1.) 
  Suppose that we want to write a subroutine to print out such sequences. 
  The subroutine will always perform the same task: Print out a 3N+1 sequence. 
  But the exact sequence it prints out depends on the starting value of N. 
  So, the starting value of N would be a parameter to the subroutine. 
  The subroutine can be written like this:

/**
 * This subroutine prints a 3N+1 sequence to standard output, using
 * startingValue as the initial value of N.  It also prints the number 
 * of terms in the sequence. The value of the parameter, startingValue, 
 * must  be a positive integer.
 */