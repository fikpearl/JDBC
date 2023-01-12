package connect.jdbc.connectivity;

import java.sql.*;

public class JDBC {


    public static void main(String[] args) throws SQLException {

        String url = "jdbc:sqlite:/home/fikilegqibitole/NEWDB"; //url for database,where all the data I want to print is
        String query = "select * from SBHotel";   //What from the data do I want to print

        try {
            Connection connect = DriverManager.getConnection(url); //Connecting Database
            Statement state = connect.createStatement();
            ResultSet set = state.executeQuery(query); //used to execute query (enables printing what I want from the data)

            while(set.next()){                 //While loop to loop through each row/column
                String SBHotelData = "";                  //of data and print out everything in each column (I Have 4 columns and 7 rows)
                for(int i = 1; i <= 4;i++){
                    SBHotelData += set.getString(i) + ":";
                 }
                System.out.println(SBHotelData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
