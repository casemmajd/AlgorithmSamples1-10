public class C000_Print3NSequence {

  public static void main (String[] args) {

    print3NSequence(17);
  }

  static void print3NSequence(int startingValue) {
      
    int N;      // One of the terms in the sequence.
    int count;  // The number of terms.  
    N = startingValue;  // The first term is whatever value
                       //    is passed to the subroutine as 
                       //    a parameter.
   
    count = 1; // We have one term, the starting value, so far.
   
    System.out.println("The 3N+1 sequence starting from " + N);
    System.out.println();
    System.out.println(N);  // print initial term of sequence
 
    while (N > 1) {
      if (N % 2 == 1)     // is N odd?
        N = 3 * N + 1;
      else
        N = N / 2;
      count++;   // count this term
      System.out.println(N);  // print this term
    }
   
    System.out.println();
    System.out.println("There were " + count + " terms in the sequence.");

  }  // end print3NSequence

}