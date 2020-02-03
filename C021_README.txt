For this exercise, you will do something even more interesting with the Mosaic class that was discussed in C021_RandomMosaicWalk. 
(Again, don't forget that you will need Mosaic.java and MosaicPanel.java to compile and run your program.) 

The program that you write for this exercise should start by filling a mosaic with random colors. 
Then repeat the following until the user closes the mosaic window: 
  Select one of the rectangles in the mosaic at random. 
  Then select one of the neighboring rectangles -- above it, below it, to the left of it, or to the right of it. 
  Copy the color of the originally selected rectangle to the selected neighbor, so that the two rectangles now have the same color. 

As this process is repeated over and over, it becomes more and more likely that neighboring squares will have the same color. 
The result is to build up larger color patches. 
On the other hand, once the last square of a given color disappears, there is no way for that color to ever reappear. 
(Extinction is forever!) 
If you let the program run long enough, eventually the entire mosaic will be one uniform color.

