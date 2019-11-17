public class C010_IsPrime {

  static boolean isPrime(int N) {
    int divisor;  // A number we will test to see whether it evenly divides N.
    if (N <= 1)
      return false;  // No number <= 1 is a prime.
    int maxToTry;  // The largest divisor that we need to test.
    maxToTry = (int)Math.sqrt(N);
   
    for (divisor = 2; divisor <= maxToTry; divisor++) {
      if ( N % divisor == 0 )  // Test if divisor evenly divides N.
        return false;         // If so, we know N is not prime.
    }
    return true;  // Yes, N is prime.
  }

  public static void main (String[] args) {

    System.out.println(isPrime(18));

  }
}