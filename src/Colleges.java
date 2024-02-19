import javax.swing.*;

public class Colleges extends JFrame {
    JFrame frame2=new JFrame();
    Colleges()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setResizable(false);
         this.setVisible(true);
         this.setSize(600,600);
          this.setTitle("College Recommendation");
          JLabel label1=new JLabel();
         label1.setText("Enter your score");
         //frame1.add(label1);
    }
}
