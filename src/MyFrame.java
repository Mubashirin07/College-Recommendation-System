import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button1,button2;

    JPanel namepanel, panelmain,buttonpanel;
    JLabel  label,namelabel;
    int score;
     MyFrame() {
         button1 = new JButton();
         button2 = new JButton();
         button2.setBounds(220, -100, 200, 50);
         button2.addActionListener(this);
         button2.setText("Medical(MBBS)");
         button1.setBounds(220, 100, 200, 50);
        // this.add(button1, BorderLayout.CENTER);
        // this.add(button2, BorderLayout.AFTER_LINE_ENDS);
         button1.addActionListener(this);
         button1.setText("Engineering");
         Border border=BorderFactory.createLineBorder(Color.BLACK,2);
         namelabel=new JLabel("Enter your name");
         JTextField nametext=new JTextField(20);
         namepanel =new JPanel();
         namepanel.add(namelabel);
         namepanel.add(nametext);
         label=new JLabel();
         label.setText("Choose your Field");
         label.setForeground(Color.red);
         label.setBackground(Color.gray);
         label.setBorder(border);
        panelmain=new JPanel();
         panelmain.setSize(400,400);
         panelmain.add(label);
         buttonpanel=new JPanel();
         buttonpanel.setSize(400,400);
         buttonpanel.add(button1);
         buttonpanel.add(button2);



         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         //this.setResizable(false);
         this.setVisible(true);
         this.setSize(600, 600);
         this.setTitle("College Recommendation");
         this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
         this.add(namepanel);
         this.add(panelmain);
         this.add(buttonpanel);
         this.pack();

     }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            Buttons grid=new Buttons();

        }
        if(e.getSource()==button2){
            Takingscoresmed score2=new Takingscoresmed();
        }
    }
}
