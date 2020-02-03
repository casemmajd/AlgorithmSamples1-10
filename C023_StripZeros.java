import java.util.Scanner;
import java.util.Arrays;


public class C023_StripZeros {
  public static void main(String[] args) {
    
    String inputString;
    int[] list;
    char[] charList;
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Type in a number that you want to strip out its 0's: ");
    inputString = scanner.nextLine();
    charList = inputString.toCharArray();
    for(int i=0; i<charList.length; i++) {
      if (!Character.isDigit(charList[i])) {
        throw new IllegalArgumentException("You did not type in a number!");
      }

    }
 
    
    System.out.println(inputString);
    int inNumber = Integer.parseInt(inputString.trim());
    
    list = Integer.toString(inNumber).chars().map(c -> c-'0').toArray(); 
       // Integer.toString(num); Convert the int to its String value
       // Integer.toString(num).chars; Get a stream of int that represents the ASCII value of each char(~digit) composing the String version of our integer
       // Convert the ascii value of each char to its value. To get the actual int value of a char, we have to substract the ASCII code value of the char '0' from the ASCII code of the actual char. To get all the digits of our number, this operation has to be applied on each character (corresponding to the digit) composing the string equivalent of our number which is done by applying the map function below to our IntStream.
//    System.out.println(Arrays.toString(list));
    list = stripZeros(list);
//    System.out.println(Arrays.toString(list));

    String outputString = "";
    for(int i=0; i<list.length; i++) {
      outputString = outputString + list[i];
    }
    System.out.println(outputString);
    
  }


  static int[] stripZeros( int[] list ) {
    int count = 0;
    for (int i = 0; i < list.length; i++) {
        if ( list[i] != 0 )
            count++;
    }
    int[] newList;
    newList = new int[count];
    int j = 0;
    for (int i = 0; i < list.length; i++) {
        if ( list[i] != 0 ) {
            newList[j] = list[i];
            j++;
        }
    }
    return newList;
  }

}

