package frame;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

    MyFrame() {

        this.setTitle("Farrel Java GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(600, 400);
        this.setVisible(true);

    }

}
