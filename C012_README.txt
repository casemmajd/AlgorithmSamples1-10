This is a complete new version of the 3N+1 program. 
This will give me a chance to show the function nextN() used in a complete program. 
I'll also improve the program by getting it to print the terms of the sequence in columns, with five terms on each line. 
This will make the output more presentable. 
The idea is this: Keep track of how many terms have been printed on the current line; 
when that number gets up to 5, start a new line of output. 
To make the terms line up into neat columns, I use formatted output.

/**
 * A program that computes and displays several 3N+1 sequences.  Starting
 * values for the sequences are input by the user.  Terms in the sequence 
 * are printed in columns, with five terms on each line of output.
 * After a sequence has been displayed, the number of terms in that 
 * sequence is reported to the user.
 */

   /**
    * print3NSequence prints a 3N+1 sequence to standard output, using
    * startingValue as the initial value of N.  It also prints the number 
    * of terms in the sequence. The value of the parameter, startingValue, 
    * must be a positive integer.
    */

   /**
    * nextN computes and returns the next term in a 3N+1 sequence,
    * given that the current term is currentN.
    */
