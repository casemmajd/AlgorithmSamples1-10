The sample program RandomMosaicWalk.java shows a "disturbance" that wanders around a grid of colored squares. 
When the disturbance visits a square, the color of that square is changed. 
  To compile and run the program RandomMosaicWalk.java that uses the API, the classes "Mosaic" and "MosaicPanel" must be available. 
  That is, the files Mosaic.java and MosaicPanel.java, or the the corresponding compiled class files, must be in the same folder as the class that defines the program.
  The class "Mosaic" allows a program to work with a window that displays little colored rectangles arranged in rows and columns. 
  The window can be opened, closed, and otherwise manipulated with static member subroutines defined in the Mosaic class. 
  In fact, the class defines a toolbox or API that can be used for working with such windows.
Here's an idea for a variation on that program. 

In the new version, all the squares start out with the default color, black. 
Every time the disturbance visits a square, a small amount is added to the green component of the color of that square. 
The result will be a visually interesting effect, as the path followed by the disturbance gradually turns a brighter and brighter green.

Write a subroutine that will add 25 to the green component of one of the squares in the mosaic. 
(But don't let the green component go over 255, since that's the largest legal value for a color component.) 
The row and column numbers of the square should be given as parameters to the subroutine. 

Recall that you can discover the current green component of the square in row r and column c with the function call Mosaic.getGreen(r,c). 
Use your subroutine as a substitute for the changeToRandomColor() subroutine in the program RandomMosaicWalk2.java. 
(This is the improved version of the program from Section 4.7 that uses named constants for the number of rows, number of columns, and square size.) 
Set the number of rows and the number of columns to 80. 
Set the square size to 5.

By default, the rectangles in the mosaic have a "3D" appearance and a gray border that makes them look nicer in the random walk program. 
But for this program, you want to turn off that effect. 
To do so, call Mosaic.setUse3DEffect(false) in the main program.

Don't forget that you will need Mosaic.java and MosaicPanel.java to compile and run your program, since they define non-standard classes that are required by the program. 

