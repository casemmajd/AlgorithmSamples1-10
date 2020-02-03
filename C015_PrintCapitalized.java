import java.util.Scanner;

public class C015_PrintCapitalized {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Type a scentence: ");
    String inputText = scanner.nextLine();

    for (int i=0; i<inputText.length(); i++){
      char[] stringToCharArray = inputText.toCharArray();
      Character character = (Character) stringToCharArray[i];
      if (i==0){
        System.out.print(Character.toUpperCase(character));
      } else if (Character.isLetter(character) && (!Character.isLetter((Character) stringToCharArray[i-1]))){
          System.out.print(Character.toUpperCase(character));
      } else {
          System.out.print(character);
      }
    }
  }
}