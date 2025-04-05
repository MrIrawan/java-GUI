package frame;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

    public MyFrame() {

        this.setTitle("Farrel Java GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(700, 450);
        this.setVisible(true);

    }

}
