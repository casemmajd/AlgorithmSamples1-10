


public class C020_RandomMosaicWalk {

    static int currentRow;    
    static int currentColumn; 
    final static int numRow = 80;
    final static int numColumn = 80;

    public static void main(String[] args) {
        Mosaic.open(numRow,numColumn,5,5);
        Mosaic.setUse3DEffect(false);
        for (int row=0; row < numRow; row++) {
            for (int column=0; column < numColumn; column++) {
                Mosaic.setColor(row, column, 0, 0, 0);
            }
        }
        currentRow = 8;   
        currentColumn = 10;
        while (Mosaic.isOpen()) {
            addGreen(currentRow, currentColumn);
            randomMove();
            Mosaic.delay(1);
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


   static void addGreen(int rowNum, int colNum) {
        int red = 0;    
        int green = 0;  
        int blue = 0;   
        int currentGreen = Mosaic.getGreen(rowNum, colNum);
        int greenIncrement = 25;
        currentGreen = currentGreen + greenIncrement;
        if (currentGreen > 255) currentGreen = 255;
        Mosaic.setColor(rowNum, colNum, red, currentGreen + greenIncrement, blue); 

   }
}
