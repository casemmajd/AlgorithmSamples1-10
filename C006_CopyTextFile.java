public class C006_CopyTextFile {

    public static void main( String[] args ) {
        if (args.length < 2 ) {
            System.out.println("Two command-line arguments are required!");
            System.exit(1);
        }
        TextIO.readFile( args[0] );   // Open the original file for reading.
        TextIO.writeFile( args[1] );  // Open the copy file for writing.
        int lineCount;  // Number of lines copied
        lineCount = 0;
        while ( TextIO.eof() == false ) {
            // Read one line from the original file and write it to the copy.
            String line;
            line = TextIO.getln();
            TextIO.putln(line);
            lineCount++;
        }
        System.out.printf( "%d lines copied from %s to %s%n",
                                lineCount, args[0], args[1] );
    }

}