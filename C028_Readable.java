public interface C028_Readable { // represents a source of input

    public char readChar();  // read the next character from the input

    default public String readLine() { // read up to the next line feed
        StringBuilder line = new StringBuilder();
        char ch = readChar();
        while (ch != '\n') {
            line.append(ch);
            ch = readChar();
        }
        return line.toString();
    }

}