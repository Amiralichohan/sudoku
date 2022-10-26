import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {

  MyFrame() {
    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    this.setBounds(-7, 0, size.width + 14, size.height);
    this.setTitle(" Soduko Game by Geeks pro");
    ImageIcon image = new ImageIcon("Logo2.png");
    this.setIconImage(image.getImage());
    this.getContentPane().setBackground(new Color(15,156,123 ));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }
}
