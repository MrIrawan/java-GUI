package frame;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

    public MyFrame() {

        
        JLabel MyLabel = new JLabel();
        MyLabel.setText("Hello Everyone, this is my first Java GUI");
        MyLabel.setBounds(50, 50, 500, 50);

        this.setTitle("Farrel Java GUI");  //set the title on frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //set the default operation while close
        this.setResizable(false);  //set the resize option for frame
        this.setSize(700, 450);  //set the size of frame
        this.setVisible(true);  //set the visibility of frame


        this.getContentPane().setBackground(new Color(0xe0e7ff));  //set the background color for the frame

        ImageIcon icon = new ImageIcon("src/assets/farrel.jpg");
        this.setIconImage(icon.getImage());

        this.add(MyLabel);

    }

}
