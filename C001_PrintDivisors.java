class C001_PrintDivisors {

  static void printDivisors( int N ) {
    int D;   // One of the possible divisors of N.
    System.out.println("The divisors of " + N + " are:");
    for ( D = 1; D <= N; D++ ) {
      if ( N % D == 0 )  // Dose D evenly divide N?
        System.out.println(D);
    }
  }

  public static void main (String [] args) {
    printDivisors(22);
  }
}