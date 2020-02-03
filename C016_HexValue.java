import java.util.Scanner;


public class C016_HexValue {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Type in a hexa decimal number: ");
    String inputHexValue = scanner.nextLine().toUpperCase();
  
    char[] stringToCharArray = inputHexValue.toCharArray();

    try {
      long value = 0;
      for (int i=0; i<stringToCharArray.length; i++) {
        value = value*16 + hexValue(inputHexValue.charAt(i));
      }
      System.out.println("The decimal value of \"" + inputHexValue + "\" is: " + value); 
    }
    catch (IllegalArgumentException e) {
      System.out.println("Error:  Input is not a hexadecimal number.");
    }
  }

  public static int hexValue(char inputHexValueChar){
    int hexValue;
    switch (inputHexValueChar) {
      case '1': hexValue = 1;
              break;
      case '2': hexValue = 2;
              break;
      case '3': hexValue = 3;
              break;
      case '4': hexValue = 4;
              break;
      case '5': hexValue = 5;
              break;
      case '6': hexValue = 6;
              break;
      case '7': hexValue = 7;
              break;
      case '8': hexValue = 8;
              break;
      case '9': hexValue = 9;
              break;
      case '0': hexValue = 0;
              break;
      case 'A': hexValue = 10;
              break;
      case 'B': hexValue = 11;
              break;
      case 'C': hexValue = 12;
              break;
      case 'D': hexValue = 13;
              break;
      case 'E': hexValue = 14;
              break;
      case 'F': hexValue = 15;
              break;
      default: 
              throw new IllegalArgumentException("Not a legal hexadecimal digit: '" + inputHexValueChar + "'.");
    }
    return hexValue;
  }
}