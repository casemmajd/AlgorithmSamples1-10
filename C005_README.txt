For example, if the name of the program is myProg, then the user can type "java myProg" to execute the program. 
In this case, there are no command-line arguments. 
But if the user types the command
  java myProg one two three
then the command-line arguments are the strings "one", "two", and "three". 
The system puts these strings into an array of Strings and passes that array as a parameter to the main() routine. 
Here, for example, is a short program that simply prints out any command line arguments entered by the user



