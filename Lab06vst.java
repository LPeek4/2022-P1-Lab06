// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet
{

    public void paint(Graphics g)
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);

        Random rand = new Random();


        // Draw Random Lines

        for(int k = 0; k < 100; k++){

            int x1 = rand.nextInt(391) + 10;
            int y1 = rand.nextInt(286) + 10;
            int x2 = rand.nextInt(391) + 10;
            int y2 = rand.nextInt(286) + 10;

            int red = rand.nextInt(256);
            int blue = rand.nextInt(256);
            int green = rand.nextInt(256);

            g.setColor(new Color(red,blue,green));
            g.drawLine(x1,y1,x2,y2);

        }

        // Draw Random Squares

        for(int k = 0; k < 100; k++) {

            int x1 = rand.nextInt(341) + 400;
            int y1 = rand.nextInt(236) + 10;
            int Height = 50;
            int Width = 50;

            int red = rand.nextInt(256);
            int blue = rand.nextInt(256);
            int green = rand.nextInt(256);

            g.setColor(new Color(red,blue,green));
            g.fillRect(x1, y1, Width, Height);

        }

        // Draw Random Circles

        for(int k = 0; k < 100; k++) {

            int wh = rand.nextInt(201);

            int x1 = rand.nextInt(391 - wh) + 10;
            int y1 = rand.nextInt(280 - wh) + 310;

            int red = rand.nextInt(256);
            int blue = rand.nextInt(256);
            int green = rand.nextInt(256);

            g.setColor(new Color(red,blue,green));

            g.drawOval(x1,y1,wh,wh);
        }

            // Draw 3-D Box

        g.setColor(Color.red);
        g.fillRect(600,425,100,100);

        g.setColor(Color.green);
        Polygon Square = new Polygon();
        Square.addPoint(600,425);
        Square.addPoint(600,525);
        Square.addPoint(550,475);
        Square.addPoint(550,375);
        g.fillPolygon(Square);

        g.setColor(Color.yellow);
        Polygon Trap = new Polygon();
        Trap.addPoint(550,375);
        Trap.addPoint(650,375);
        Trap.addPoint(650,425);
        Trap.addPoint(600,425);
        g.fillPolygon(Trap);

        g.setColor(Color.blue);
        Polygon Tri = new Polygon();
        Tri.addPoint(650,375);
        Tri.addPoint(650,425);
        Tri.addPoint(700,425);
        g.fillPolygon(Tri);

    }

}



    
 