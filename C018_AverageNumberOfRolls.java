

public class C018_AverageNumberOfRolls {
  public static void main (String[] args) {
      int[] totalArray = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};


      System.out.println("Total In Dice      Average Number of Rolls");
      System.out.println("-------------      -----------------------");
      for (int i=0; i<totalArray.length; i++) {
        int total = totalArray[i];
        double result = averageNumberOfRolls(total);
        System.out.printf("%7d %26.4f \n", total, result);
      }
  }

  public static int rollPairOfDice(int total){
      if ( total < 2 || total > 12 ) throw new IllegalArgumentException("Impossible total for a pair of dice.");
      int result = 0;
      int sum = 0;
      while (sum != total) {
        sum = ((int)(Math.random()*6) + 1) + ((int)(Math.random()*6) + 1);
        result++;
      }
      return result;
  }

  public static double averageNumberOfRolls(int total) { 
    final int NUMBER_OF_EXPERIMENTS = 10000;

    double count = 0;
    for (int i=0; i<NUMBER_OF_EXPERIMENTS; i++) {
      count = count + rollPairOfDice(total);
    }
    return count / NUMBER_OF_EXPERIMENTS;
  }
}