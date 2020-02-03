This example that draws some text using a variety of fonts. 
The program draws multiple copies of the string "Hello JavaFX" using random fonts and locations. 
The text is filled with random colors and stroked with a thin black stroke.
The program uses five fonts, which are created in the start() method using several different static factory methods from the Font class:
font1 = Font.font("Times New Roman", FontWeight.BOLD, 20);
font2 = Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 28);
font3 = Font.font("Verdana", 32);
font4 = Font.font(40);
font5 = Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,60);

The program defines a draw() method that completely redraws the content of a canvas. 
It is called when the canvas is first created, and it is also called when the user clicks the "Redraw" button. 
The method first fills the canvas with a white background, which erases the previous contents of the canvas. 
It then fills and strokes 25 copies of "Hello JavaFX", using a random fill color, a random position for the text, and a randomly selected font for each copy.

GUI program that shows multiple copies of a message in random positions, colors, and fonts. 
When the user clicks the program window, the positions, colors, and fonts are changed to new random values. 

/**
 * This program displays 25 copies of a message, and it runs
 * an animation in which the strings move around on the screen.
 * The color, position, and velocity of each message is selected 
 * at random when the program first starts, and there is a button that
 * the user can click to reinitialize all the random values.
 */


    /**
     * Creates an array of 25 StringData objects and fills it with
     * randomly generated data for each of the 25 strings.  This is
     * called in the start() method and when the user clicks the
     * "Restart!" button.
     */



    /**
     * Update the data for the 25 strings by moving each string, where the
     * distance moved depends on the velocity.  If a string moves too far
     * off the canvas, move it to the opposite side of the canvas.
     * (To make sure a string has moved all the way off the canvas to the
     * left, wait until data.x reaches -400 before moving it to the
     * right of the canvas. 
     * @param deltaTimeInSeconds time that has elapsed since the previous
     *          call to updateStringData, measured in seconds.
     */


    /**
     * The draw() method is responsible for drawing the content of the canvas.
     * It draws 25 copies of the message string, using a random color, font, and
     * position for each string.
     */



