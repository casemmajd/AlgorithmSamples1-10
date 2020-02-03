Write a function that simulates rolling a pair of dice until the total on the dice comes up to be a given number. 
The number that you are rolling for is a parameter to the function. 
The number of times you have to roll the dice is the return value of the function. 
The parameter should be one of the possible totals: 2, 3, ..., 12. 
The function should throw an IllegalArgumentException if this is not the case. 
Use your function in a program that computes and prints the number of rolls it takes to get snake eyes. 
(Snake eyes means that the total showing on the dice is 2.)


public class C017_ComputeNumberOfRolls {
  public static void main (String[] args) {

    try
      Take in the total: snae eye (2)
      result = rollPairOfDice(2)
      print result

    catch
      Exception

  }

  public static int rollPairOfDice(int total){

    Check the range of total = 2, 3, ..., 12
      If not within range, throw IllegalArgumentException

    result = Number of times I have rolled = 0
    Start counting:
      Randome dice 1
      Random dice 2
      Sum dice 1 + dice 2
      if Sum = total then stop
      increment result

    return result = "Number of time I have rolled"
  }
}
