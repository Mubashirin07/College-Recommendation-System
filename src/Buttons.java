import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons extends JFrame implements ActionListener {
    JButton bcse,bentc,bcivil,bmech,bit,bchem;

    Buttons(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //this.setResizable(false);
        this.setVisible(true);
        this.setSize(600, 600);
        this.setTitle("College Recommendation");
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        this.setLayout(new GridLayout(2,2,20,20));
        bcse=new JButton("CSE");
        bentc=new JButton("ENTC");
        bmech=new JButton("MECH");
        bcivil=new JButton("Civil");
        bit=new JButton("IT");
        bchem=new JButton("Chemical");
        bcse.addActionListener(this);
        bentc.addActionListener(this);
        bmech.addActionListener(this);
        bcivil.addActionListener(this);
        bit.addActionListener(this);
        bchem.addActionListener(this);
        this.add(bcse);
        this.add(bentc);
        this.add(bmech);
        this.add(bcivil);
        this.add(bit);
        this.add(bchem);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bcse || e.getSource()==bentc || e.getSource()==bmech || e.getSource()==bcivil || e.getSource()==bit || e.getSource()==bchem){
            Takingscoresengg score1=new Takingscoresengg();
        }
    }
}
