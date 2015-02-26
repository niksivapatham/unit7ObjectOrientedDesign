import javax.swing.JComponent;
import javax.swing.JFrame;

public class Viewer
{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;
    
    public static void main(String[] args)
    {
        JComponent comp = new TriangleComponent();
        JFrame frame = new TriangleFrame(FRAME_WIDTH,FRAME_HEIGHT,"Triangle Viewer!");
        frame.add(comp);
    }
}
