public class C028_Stars implements C028_Readable {

    public char readChar() {
        if (Math.random() > 0.02)
           return '*';
        else
           return '\n';
    }
    
    public static void main(String[] args) {
        C028_Stars stars = new C028_Stars();
        for (int i = 0 ; i < 10; i++ ) {
            String line = stars.readLine();
            System.out.println( line );
        }
    }
      
}