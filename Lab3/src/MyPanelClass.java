import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
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
                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        //Draw a second border inside the first one with color RED
//                        g.setColor(Color.RED);
//                        g.drawRect(x1 + 10, y1 + 10, width - 20 , height - 20);
//                      //Line across the window
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        //Second line across the window
//                        g.setColor(Color.GREEN);
//                        g.drawLine(x2, myInsets.right,x1,y2);
                        
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillOval((getWidth()/2) - 27, (getHeight()/2) - 27, 55, 55);
            }
}
