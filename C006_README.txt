Command-line arguments are often used to pass the names of files to a program. 
For example, consider the following program for making a copy of a text file. 
It does this by copying one line at a time from the original file to the copy, using TextIO. 
The function TextIO.eof() is a boolean-valued function that is true if the end of the file has been reached.

/**
 *  Requires two command line arguments, which must be file names.  The
 *  the first must be the name of an existing file.  The second is the name
 *  of a file to be created by the program.  The contents of the first file
 *  are copied into the second.  WARNING:  If the second file already 
 *  exists when the program is run, its previous contents will be lost!
 *  This program only works for plain text files.
 */
