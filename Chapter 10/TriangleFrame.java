import javax.swing.JFrame;
public class TriangleFrame extends JFrame
{
    private int frame_width;
    private int frame_height;
    private String frame_name;
    
   
    public TriangleFrame(int width,int height,String title)
    {
        frame_width = width;
        frame_height = height;
        frame_name = title;
        setTitle(title);
        setSize(frame_width, frame_height);
        setVisible(true);
    }
}
