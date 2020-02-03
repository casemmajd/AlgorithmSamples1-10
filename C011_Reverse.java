public class C011_Reverse {

  static String reverse(String str) {
    String copy;  // The reversed copy.
    int i;        // One of the positions in str, 
                 //       from str.length() - 1 down to 0.
    copy = "";    // Start with an empty string.
    for ( i = str.length() - 1;  i >= 0;  i-- ) {
            // Append i-th char of str to copy.
      copy = copy + str.charAt(i);  
    }
    return copy;
}

  public static void main (String[] args) {
    System.out.println(reverse("Hello World"));
    String word = "radar";
    if (word.equals(reverse(word))) {
      System.out.println("The word \"" + word + "\" is a  palindrome!");
    }
  }
}