public class C007_Print3NSequence {

  public static void main (String[] args) {

    print3NSequence(-17);
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
      if (N % 2 == 1)     
        N = 3 * N + 1;
      else
        N = N / 2;
      count++;   
      System.out.println(N);  
    }
   
    System.out.println();
    System.out.println("There were " + count + " terms in the sequence.");
  } 
}