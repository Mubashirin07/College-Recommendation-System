import java.sql.*;
public class testjdbc {
    public static void main(String[] args) {
        Connection connection= null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ca","root","moulvi786");
            Statement statement=connection.createStatement();
            ResultSet resultset=statement.executeQuery("select * from enggcollegecsv");
            while(resultset.next()) {
                System.out.println(resultset.getString("Name Of College"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);

        }


    }
}
