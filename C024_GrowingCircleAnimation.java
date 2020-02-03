import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;



public class C024_GrowingCircleAnimation extends JPanel implements ActionListener {

  private CircleInfo[] circleData;
  private void drawFrame(Graphics g, int frameNumber, int width, int height) {
    if (circleData == null) {
      circleData = new CircleInfo[100];
      for (int i = 0; i < circleData.length; i++) {
        circleData[i] = new CircleInfo(
                   (int)(width*Math.random()),
                   (int)(height*Math.random()),
                   (int)(100*Math.random()) );
      }
    }

    for (int i = 0; i < circleData.length; i++) {
      circleData[i].radius++;
      circleData[i].draw(g);
      if (Math.random() < 0.01 || circleData[i].radius > 100) {
        circleData[i] = new CircleInfo( 
                     (int)(width*Math.random()),
                     (int)(height*Math.random()),
                     1);
      }
    }
    g.setColor(Color.BLACK);
    g.drawRect(0,0,width-1,height-1);  
  }

  public static void main(String[] args) {
        JFrame window = new JFrame("Falling Circles");
        C024_GrowingCircleAnimation drawingArea = new C024_GrowingCircleAnimation();
        drawingArea.setBackground(Color.WHITE);
        window.setContentPane(drawingArea);
        drawingArea.setPreferredSize(new Dimension(600,480));
        window.pack();
        window.setLocation(100,50);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        Timer frameTimer = new Timer(20,drawingArea);
        window.setVisible(true);
        frameTimer.start();    
  }

  private int frameNum;
  public void actionPerformed(ActionEvent evt) {
        frameNum++;
        repaint();
  }

  protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawFrame(g, frameNum, getWidth(), getHeight());
  }

}


class CircleInfo {
  public int radius;
  public int x,y;
  public Color color;

  public CircleInfo(int centerX, int centerY, int rad) {
    x = centerX;
    y = centerY;
    radius = rad;
    int red = (int)(255*Math.random());
    int green = (int)(255*Math.random());
    int blue = (int)(255*Math.random());
    color = new Color(red, green, blue, 100);
  }

  public void draw( Graphics g ) {
    g.setColor( color );
    g.fillOval( x - radius, y - radius, 2*radius, 2*radius );
    g.setColor( Color.BLACK );
    g.drawOval( x - radius, y - radius, 2*radius, 2*radius );
  }

}

