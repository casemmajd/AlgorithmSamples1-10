

public class C017_ComputeNumberOfRolls {
  public static void main (String[] args) {
      int total = 2;
      int result = rollPairOfDice(total);
      System.out.println("the sum is: " + result);

  }

  public static int rollPairOfDice(int total){
      if ( total < 2 || total > 12 ) throw new IllegalArgumentException("Impossible total for a pair of dice.");
      int result = 0;
      int sum = 0;
      int a =0;
      while (sum != total) {
        sum = ((int)(Math.random()*6) + 1) + ((int)(Math.random()*6) + 1);
        result++;
      }
      return result;
  }
}