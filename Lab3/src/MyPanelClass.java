import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.BLACK);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                        //Draw the red rectangles of the flag
                        g.setColor(Color.RED);
                        g.fillRect(this.getWidth()/2 - 200, this.getHeight()/2 - 100, 400, 50);
                        g.fillRect(this.getWidth()/2 - 200, (this.getHeight()/2 - 100) + 100, 400, 50);
                        g.fillRect(this.getWidth()/2 - 200, (this.getHeight()/2 - 100) + 200, 400, 50);
                        
                        //Draw the white rectangles of the flag
                        g.setColor(Color.WHITE);
                        g.fillRect(this.getWidth()/2 - 200, (this.getHeight()/2 - 100) + 50, 400, 50);
                        g.fillRect(this.getWidth()/2 - 200, (this.getHeight()/2 - 100) + 150, 400, 50);
                        
                        // Draw the blue triangle 
                        g.setColor(Color.BLUE);
                        Polygon Triangulo = new Polygon();
                        Triangulo.addPoint(this.getWidth()/2 - 200, this.getHeight()/2 - 100);
                        Triangulo.addPoint(this.getWidth()/2 , this.getHeight()/2 - 100 + 125);
                        Triangulo.addPoint(this.getWidth()/2 - 200 , this.getHeight()/2 - 100 + 250);
                        g.fillPolygon(Triangulo);
                        
                        //50% of the star
                        Polygon MiddleStar= new Polygon();
                        MiddleStar.addPoint(this.getWidth()/2 - 200 + 70, this.getHeight()/2 - 100 + 80);
                        MiddleStar.addPoint(this.getWidth()/2 - 200 + 45, this.getHeight()/2 - 100 + 155);
                        MiddleStar.addPoint(this.getWidth()/2 - 200 + 70, this.getHeight()/2 - 100 + 130);
                        MiddleStar.addPoint(this.getWidth()/2 - 200 + 95, this.getHeight()/2 - 100 + 155);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(MiddleStar);
                        
                        //Another 50% of the star
                        Polygon MiddleStar2= new Polygon();
                        MiddleStar2.addPoint(this.getWidth()/2 - 200 + 30, this.getHeight()/2 - 100 + 105);
                        MiddleStar2.addPoint(this.getWidth()/2 - 200 + 110, this.getHeight()/2 - 100 + 105);
                        MiddleStar2.addPoint(this.getWidth()/2 - 200 + 70, this.getHeight()/2 - 100 + 130);
                        g.fillPolygon(MiddleStar2);
}
}
