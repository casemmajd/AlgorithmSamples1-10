public class C005_CLDemo {
   
   public static void main(String[] args) {
      System.out.println("You entered " + args.length + " command-line arguments");
      if (args.length > 0) {
         System.out.println("They were:");
         int i;
         for ( i = 0; i < args.length; i++ )
            System.out.println("   " + args[i]);
      }
   }  
} 