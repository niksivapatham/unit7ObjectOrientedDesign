import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent; 
import java.awt.Point;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

public class TriangleComponent extends JComponent
{    
    public int count;
    public int x;
    public int y;
    public Ellipse2D.Double point;
    public Ellipse2D.Double point1;
    public Ellipse2D.Double point2;
    public Ellipse2D.Double point3;
    public Line2D.Double line1;
    public Line2D.Double line2;
    public Line2D.Double line3;
    public TriangleComponent()
    {
        count = 0;
        MouseListener listener = new MousePressListener();
        addMouseListener(listener);

    }

    public class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            x = event.getX();
            y = event.getY();
            count++;
            drawPoint(x,y);
        }
        public void mouseReleased(MouseEvent event) {}
        public void mouseClicked(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        if (count == 1){
            point1 = point;
            g2.draw(point1);
        } else if (count == 2) {
            g2.draw(point1);
            point2 = point;
            g2.draw(point2);
            line1 = new Line2D.Double(point1.getX()+5,point1.getY()+5,point2.getX()+5,point2.getY()+5);
            g2.draw(line1);
        } else if (count == 3) {
            g2.draw(point1);
            g2.draw(point2);
            point3 = point;
            g2.draw(point3);
            line2 = new Line2D.Double(point2.getX()+5,point2.getY()+5,point3.getX()+5,point3.getY()+5);
            line3 = new Line2D.Double(point1.getX()+5,point1.getY()+5,point3.getX()+5,point3.getY()+5);
            g2.draw(line1);
            g2.draw(line2);
            g2.draw(line3);
            g2.draw(line1);
        }
        
    }
    
    public void drawPoint(int x, int y)
    {        
        point = new Ellipse2D.Double(x,y,10,10);        
        repaint();
    }
}
