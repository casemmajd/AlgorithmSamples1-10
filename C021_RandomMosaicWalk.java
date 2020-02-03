


public class C021_RandomMosaicWalk {

    static int currentRow;    
    static int currentColumn; 
    final static int numRow = 80;
    final static int numColumn = 80;
    final static int rowSize = 5;
    final static int columnSize = 5;

    public static void main(String[] args) {
        Mosaic.open(numRow,numColumn,rowSize,columnSize);
        Mosaic.setUse3DEffect(false);
        fillWithRandomColors();
        while (Mosaic.isOpen()) {
            copyColorToRandomNeighbor();
            Mosaic.delay(0);
        }
    }

    static void fillWithRandomColors() {
        int row, column;
        for (row=0; row < numRow; row++) {
            for (column=0; column < numColumn; column++) {
                changeToRandomColor(row, column);  
            }
        }
    }


    static void changeToRandomColor(int rowNum, int colNum) {
        int red = (int)(256*Math.random());    
        int green = (int)(256*Math.random());  
        int blue = (int)(256*Math.random());   
        Mosaic.setColor(rowNum,colNum,red,green,blue); 
    }


    static void randomMove() {
        int directionNum; 
        directionNum = (int)(4*Math.random()); // Randomly set to 0, 1, 2, or 3 to choose direction.
        switch (directionNum) {
        case 0:  // move up 
            currentRow--;
            if (currentRow < 0)
                currentRow = numRow -1;
            break;
        case 1:  // move right
            currentColumn++;
            if (currentColumn >= numColumn)
                currentColumn = 0;
            break; 
        case 2:  // move down
            currentRow ++;
            if (currentRow >= numRow)
                currentRow = 0;
            break;
        case 3:  // move left  
            currentColumn--;
            if (currentColumn < 0)
                currentColumn = numColumn -1;
            break; 
        }
    }



    static void randomMoveCoordinates() {
        int directionNum; 
        directionNum = (int)(4*Math.random()); // Randomly set to 0, 1, 2, or 3 to choose direction.
        switch (directionNum) {
        case 0:  // move up 
            currentRow--;
            if (currentRow < 0)
                currentRow = numRow -1;
            break;
        case 1:  // move right
            currentColumn++;
            if (currentColumn >= numColumn)
                currentColumn = 0;
            break; 
        case 2:  // move down
            currentRow++;
            if (currentRow >= numRow)
                currentRow = 0;
            break;
        case 3:  // move left  
            currentColumn--;
            if (currentColumn < 0)
                currentColumn = numColumn -1;
            break; 
        }
    }

   static void addGreen(int rowNum, int colNum) {
        int red = 0;    
        int green = 0;  
        int blue = 0;   
        int currentGreen = Mosaic.getGreen(rowNum, colNum);
        int greenIncrement = 25;
        currentGreen = currentGreen + greenIncrement;
        if (currentGreen > 255) currentGreen = 255;
        Mosaic.setColor(rowNum, colNum, red, currentGreen + greenIncrement, blue); 
        randomMove();

   }


   static void copyColorToRandomNeighbor() {
        int randomRowNum = (int)(numRow*Math.random());    
        int randomColNum = (int)(numColumn*Math.random());  
        int currentRed = Mosaic.getRed(randomRowNum, randomColNum);
        int currentGreen = Mosaic.getGreen(randomRowNum, randomColNum);
        int currentBlue = Mosaic.getBlue(randomRowNum, randomColNum);
        int directionNum = (int)(4*Math.random()); // Randomly set to 0, 1, 2, or 3 to choose direction.

        switch (directionNum) {
        case 0:  // move up 
            randomRowNum--;
            if (randomRowNum < 0)
                randomRowNum = numRow -1;
            break;
        case 1:  // move right
            randomColNum++;
            if (randomColNum >= numColumn)
                randomColNum = 0;
            break; 
        case 2:  // move down
            randomRowNum++;
            if (randomRowNum >= numRow)
                randomRowNum = 0;
            break;
        case 3:  // move left  
            randomColNum--;
            if (randomColNum < 0)
                randomColNum = numColumn -1;
            break; 
        }

        Mosaic.setColor(randomRowNum, randomColNum, currentRed, currentGreen, currentBlue);
   }
}
