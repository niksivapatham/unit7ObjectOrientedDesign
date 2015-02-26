import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class ButtonViewer
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 100;

    private JFrame frame;
    private JButton buttonA;
    private JButton buttonB;
    private JPanel panel;
    private JLabel label;

    public ButtonViewer()
    {
        frame = new JFrame();
        buttonA = new JButton("Click me!");
        buttonB = new JButton("Click me too!");
        panel = new JPanel();
        label = new JLabel( "No button clicked." );

        panel.add(buttonA);
        panel.add(buttonB);
        panel.add(label);
        frame.add( panel );

        ActionListener listener = new ClickListener();
        buttonA.addActionListener(listener);
        buttonB.addActionListener(listener);

        frame.setSize( FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible( true );
    }

    public class ClickListener implements ActionListener
    {
        private int count;
        private String name;

        public void actionPerformed( ActionEvent event)
        {
            count++;

            label.setText( "Button \"" + event.getActionCommand() + "\" was clicked!");
        }
    }

    public static void main(String[] args)
    {
        ButtonViewer gui = new ButtonViewer();
    }
}