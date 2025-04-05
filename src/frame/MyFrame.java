package frame;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    public MyFrame() {

        this.setTitle("Farrel Java GUI");  //set the title on frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //set the default operation while close
        this.setResizable(false);  //set the resize option for frame
        this.setSize(700, 450);  //set the size of frame
        this.setVisible(true);  //set the visibility of frame


        this.getContentPane().setBackground(new Color(0xe0e7ff));  //set the background color for the frame

        ImageIcon icon = new ImageIcon("src/assets/farrel.jpg");
        this.setIconImage(icon.getImage());

    }

}
