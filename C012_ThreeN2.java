public class C012_ThreeN2 {

   public static void main(String[] args) {

      System.out.println("This program will print out 3N+1 sequences");
      System.out.println("for starting values that you specify.");
      System.out.println();
      
      int K;   // Starting point for sequence, specified by the user.
      do {
         System.out.println("Enter a starting value;");
         System.out.print("To end the program, enter 0: ");
         K = TextIO.getlnInt();  // get starting value from user
         if (K > 0)              // print sequence, but only if K is > 0
            print3NSequence(K);
      } while (K > 0);           // continue only if K > 0
 
   } // end main
 

   static void print3NSequence(int startingValue) {
  
      int N;       // One of the terms in the sequence.
      int count;   // The number of terms found.
      int onLine;  // The number of terms that have been output
                   //     so far on the current line.
      
      N = startingValue;   // Start the sequence with startingValue;
      count = 1;           // We have one term so far.
   
      System.out.println("The 3N+1 sequence starting from " + N);
      System.out.println();
      System.out.printf("%8d", N);  // Print initial term, using 8 characters.
      onLine = 1;        // There's now 1 term on current output line.
   
      while (N > 1) {
          N = nextN(N);  // compute next term
          count++;   // count this term
          if (onLine == 5) {  // If current output line is full
             System.out.println();  // ...then output a carriage return
             onLine = 0;      // ...and note that there are no terms 
                              //               on the new line.
          }
          System.out.printf("%8d", N);  // Print this term in an 8-char column.
          onLine++;   // Add 1 to the number of terms on this line.
      }
   
      System.out.println();  // end current line of output
      System.out.println();  // and then add a blank line
      System.out.println("There were " + count + " terms in the sequence.");
   
   }  // end of print3NSequence
   
   
   static int nextN(int currentN) {
       if (currentN % 2 == 1)
          return 3 * currentN + 1;
       else
          return currentN / 2;
   }  // end of nextN()
   
   
} // end of class ThreeN2