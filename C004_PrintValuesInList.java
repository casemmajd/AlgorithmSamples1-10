public class C004_PrintValuesInList {

  static void printValuesInList( int[] list ) {
    System.out.print('[');
    int i;
    for ( i = 0; i < list.length; i++ ) {
        if ( i > 0 ) System.out.print(','); // No comma in front of list[0]
        System.out.print(list[i]);
    }
    System.out.println(']');
  }

  public static void main (String[] args){

    int[] numbers = new int[3];
    numbers[0] = 42;
    numbers[1] = 17;
    numbers[2] = 256;
    printValuesInList(numbers);

  }
}