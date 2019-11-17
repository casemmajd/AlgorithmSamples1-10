public class C009_LetterGrade {

  static char letterGrade(int numGrade) {
    if (numGrade >= 90)
      return 'A';   // 90 or above gets an A
    else if (numGrade >= 80)
      return 'B';   // 80 to 89 gets a B
    else if (numGrade >= 65)
      return 'C';   // 65 to 79 gets a C
    else if (numGrade >= 50)
      return 'D';   // 50 to 64 gets a D
    else
      return 'F';   // anything else gets an F
   
  }  // end of function letterGrade

  public static void main (String[] args) {
    System.out.println(letterGrade(89));

  }
}