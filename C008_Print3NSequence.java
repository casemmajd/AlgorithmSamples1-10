public class C008_Print3NSequence {

  public static void main (String[] args) {

    print3NSequence(17);
  }

  static int nextN(int currentN) {
    if (currentN % 2 == 1)     // test if current N is odd
      return 3*currentN + 1;  // if so, return this value
    else
      return currentN / 2;    // if not, return this instead
  }
  

  static void print3NSequence(int startingValue) {
   
    if (startingValue <= 0)  // The contract is violated!
      throw new IllegalArgumentException( "Starting value must be positive." );

    int N;      
    int count;  
    N = startingValue;  
    count = 1; 
   
    System.out.println("The 3N+1 sequence starting from " + N);
    System.out.println();
    System.out.println(N);  
 
    while (N > 1) {
        N = nextN( N );
      count++;   
      System.out.println(N);  
    }
   
    System.out.println();
    System.out.println("There were " + count + " terms in the sequence.");
  } 
}