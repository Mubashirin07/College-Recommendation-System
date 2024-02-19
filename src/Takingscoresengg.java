import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.SocketOption;
import java.sql.*;

public class Takingscoresengg extends JFrame implements ActionListener {
   // JFrame frame1=new JFrame();
    double score;
    String name;
    JButton button3;
    JTextField textfield;
    JLabel collegeLabel,percentagelabel;
    JTextArea colgname;
    JScrollPane scroll;
    Takingscoresengg(){
        JFrame frame1=new JFrame();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setVisible(true);
        this.setSize(600,600);
        this.setTitle("College Recommendation");
        this.setLayout(new FlowLayout());
        button3=new JButton("Show Colleges");
        button3.addActionListener(this);
        textfield=new JTextField();
        textfield.setPreferredSize(new Dimension(200,25));
        percentagelabel=new JLabel();
        percentagelabel.setText("Enter your score");

        JPanel panel = new JPanel();
        panel.setSize(400,400);
        panel.add(percentagelabel);
        panel.add(textfield);
        panel.add(button3);
        JPanel midpanel = new JPanel();
        panel.setSize(600,600);

        this.add(panel);
        this.add(midpanel);
        collegeLabel = new JLabel();
        collegeLabel.setSize(500,500);
        collegeLabel.setBackground(Color.GRAY);
        this.add(collegeLabel);
        colgname = new JTextArea();
        colgname.setColumns(50);
        scroll =new JScrollPane(colgname);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        this.add(scroll);
        this.add(colgname);
        midpanel.add(scroll);
        midpanel.add(colgname);


        //JOptionPane.showMessageDialog(null,"Enter you percentage","title",JOptionPane.PLAIN_MESSAGE);
       // JTextField text=new JTextField();
       // text.setPreferredSize(new Dimension(250,40));
      // frame1.add(text);
      //  String name=JOptionPane.showInputDialog("Enter you score");
      // score=Integer.parseInt(name);
      //  System.out.println("You score is "+score);
      //  Colleges mycollege=new Colleges();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==button3){
          name= textfield.getText();
          score=Integer.parseInt(name);
          Connection connection= null;
          try {
              connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ca","root","moulvi786");
              //Statement statement=connection.createStatement();
              PreparedStatement stmt=connection.prepareStatement("select * from enggcollegecsv where open<=?");
              stmt.setDouble(1,score);
              ResultSet resultset=stmt.executeQuery();
              while(resultset.next()) {
                // collegeLabel.setText(resultset.getString("Name Of College"));
                 colgname.append(resultset.getString("Name Of College")+"\n");
                System.out.println(resultset.getString("Name Of College"));             }
          } catch (SQLException er) {
              er.printStackTrace();
              throw new RuntimeException(er);

            }
       /*if(score>=90 && score<=100){
            collegeLabel.setText("<html>1)Veermata Jijabai Technological Institute(VJTI), Matunga, Mumbai <br><br>2) Manjara Charitable Trust's Rajiv Gandhi Institute of Technology, Mumbai<br><br>3) Vidyalankar Institute of Technology,Wadala, Mumbai<br><br>4) Mahavir Education Trust's Shah & Anchor Kutchhi Engineering , Mumbai<br><br>5) Thakur College of Engineering and Technology, Kandivali, Mumbai<br><br>6) Thadomal Shahani Engineering College, Bandra, Mumbai<br><br>7) Conceicao Rodrigues College of Engineering, Bandra,Mumbai <br><br> 8) Vivekanand Education Society's Institute of Technology, Chembur, Mumbai<br><br> 9) N.Y.S.S.'s Datta Meghe College of Engineering, Airoli, Navi Mumbai<br><br> 10) Bharati Vidyapeeth College of Engineering, Navi Mumbai<br><br> 11) Terna Engineering College, Nerul, Navi Mumbai </html>");
        } else if (score>=80 && score<90) {
             collegeLabel.setText("<html>1) Usha Mittal Institute of Technology SNDT Women's University, Mumbai<br><br> 2) M.G.M.'s College of Engineering and Technology, Kamothe, Navi Mumbai<br><br> 3) Anjuman-I-Islam's M.H. Saboo Siddik College of Engineering, Mumbai<br><br> 4) Vasantdada Patil Pratishthan's College Of Engineering , Mumbai<br><br> 5) Smt. Indira Gandhi College of Engineering, Navi Mumbai<br><br> 6) Shivajirao S. Jondhale College of Engineering, Dombivali,Mumbai<br><br> 7) Lokmanya Tilak College of Engineering, Kopar Khairane, Navi Mumbai<br><br> 8) Shree L.R. Tiwari College of Engineering, Mira Road, Mumbai<br><br> 9) TSSMS's Pd. Vasantdada Patil Institute of Technology, Bavdhan, Pune<br><br>10) JSPM's Imperial College of Engineering and Research, Wagholi, Pune<br><br>11) Indira College of Engineering & Management, Pune<br><br> 12) Sinhgad Academy of Engineering, Kondhwa (BK) Kondhwa-Saswad Road, Pune<br><br><br>14) Marathwada Mitra Mandal's Institute of Technology, Lohgaon, Pune</html>");
         } else if (score>=70 && score<80) {
          collegeLabel.setText("<html>1) Genba Sopanrao Moze Trust Parvatibai Genba Moze College of Engineering, Pune<br><br> 2) Genba Sopanrao Moze College of Engineering, Baner-Balewadi, Pune<br><br> 3) Siddhant College of Engineering, A/p Sudumbare, Tal.Maval, Dist-Pune<br><br> 4) Alard Charitable Trust's Alard College of Engineering and Management, Pune<br><br> 5) Nutan College of Engineering and Research, Talegaon Dabhade Tal. Maval, Pune<br><br> 6) N. B. Navale Sinhgad College of Engineering, Kegaon, solapur<br><br> 7) Sahyadri Valley College of Engineering & Technology, Rajuri, Pune.<br><br> 8) Shree Ramchandra College of Engineering, Lonikand,Pune<br><br> 9)P.K. Technical Campus, Pune.<br><br> 10) SKN Sinhgad Institute of Technology & Science, Kusgaon(BK),Pune.<br><br> 11) Keystone School of Engineering, Pune</html>");

         } else if (score>=60 && score<70) {
           collegeLabel.setText("<html> 1) Kai Amdar Bramhadevdada Mane Shikshan & Samajik Prathistan's Bramhadevdada Mane Institute of Technology, Solapur<br><br> 2) Shanti Education Society, A.G. Patil Institute of Technology, Soregaon, Solapur(North)<br><br> 3) Samarth Group of Institutions, Bangarwadi, Post Belhe Tal. Junnar Dist. Pune<br><br> 4) Suman Ramesh Tulsiani Technical Campus: Faculty of Engineering, Kamshet,Pune.</html>");

         }
         else {
            collegeLabel.setText("Sorry!, No College's Found For This Percentage in CSE Branch");
         }
           //ImageIcon im
*/

      }
    }
}
