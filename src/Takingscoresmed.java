import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Takingscoresmed extends JFrame implements ActionListener {

    int score2;
    String name2;
    JButton button4;
    JTextField textfield;
    JLabel collegeLabel1,percentagelabel1;
    Takingscoresmed(){
        JFrame frame1=new JFrame();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setVisible(true);
        this.setSize(600,600);
        this.setTitle("College Recommendation");
        this.setLayout(new FlowLayout());
        button4=new JButton("Show Colleges");
        button4.addActionListener(this);
        percentagelabel1=new JLabel();
        percentagelabel1.setText("Enter your score");

        textfield=new JTextField();
        textfield.setPreferredSize(new Dimension(200,25));
        JPanel panel = new JPanel();
        panel.setSize(400,400);
        panel.add(percentagelabel1);
        panel.add(textfield);
        panel.add(button4);

        this.add(panel);
        collegeLabel1 = new JLabel();
        collegeLabel1.setSize(500,500);
        collegeLabel1.setBackground(Color.GRAY);
        this.add(collegeLabel1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button4){
            name2= textfield.getText();
            score2=Integer.parseInt(name2);
            if(score2>=600 && score2<=700){
                collegeLabel1.setText("<html> 1.Byramjee Jeejeebhoy Government Medical College and Sassoon General Hospital, and College of Nursing, Pune <br><br>2.Government Medical College and Hospital, Nagpur <br><br> 3.Government Medical College, Aurangabad <br><br>4.Government Medical College, Miraj <br><br>5.Grant Medical College and Sir JJ Group of Hospitals, Mumbai <br><br>6.Indira Gandhi Government Medical College and Hospital, Nagpur <br><br></html>");
            } else if (score2>550 && score2<600) {
                collegeLabel1.setText("<html> 1.Government Medical College and Hospital, Baramati <br><br> 2.Government Medical College and Hospital, Jalgaon <br><br>3.Government Medical College, Akola<br><br>a 4.Government Medical College, Chandrapur<br><br> 5.Government Medical College, Gondia <br><br> 6.Government Medical College, Latur<br><br> 7.Government Medical College, Nandurbar <br><br> 8.Kasturba Health Societys Mahatma Gandhi Institute of Medical Sciences, Sevagram <br><br> 9.KJ Somaiya Medical College and Research Centre, Mumbai<br><br></html>");
            }
            else{
                collegeLabel1.setText("<html> The score is too low to grab a MBBS seat<br><br>Bettter luck next Time!");
            }
        }
    }
}