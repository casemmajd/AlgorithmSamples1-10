Here is a very simple function that could be used in a program to compute 3N+1 sequences. 
(The 3N+1 sequence problem is one we've looked at several times already) 
Given one term in a 3N+1 sequence, this function computes the next term of the sequence:

static int nextN(int currentN) {
   if (currentN % 2 == 1)     // test if current N is odd
      return 3*currentN + 1;  // if so, return this value
   else
      return currentN / 2;    // if not, return this instead
}

This function has two return statements. 
Exactly one of the two return statements is executed to give the value of the function. 
Some people prefer to use a single return statement at the very end of the function when possible. 
This allows the reader to find the return statement easily. 
You might choose to write nextN() like this, for example:

static int nextN(int currentN) {
   int answer;  // answer will be the value returned
   if (currentN % 2 == 1)    // test if current N is odd
      answer = 3*currentN+1; // if so, this is the answer
   else
      answer = currentN / 2; // if not, this is the answer
   return answer;   // (Don't forget to return the answer!)
}

Here is a subroutine that uses this nextN function. 
In this case, the improvement from the previous version of the subroutine is not great, but if nextN() were a long function that performed a complex computation, then it would make a lot of sense to hide that complexity inside a function.

