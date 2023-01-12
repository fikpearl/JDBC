package connect.jdbc.connectivity;

import java.sql.*;

public class JDBC {


    public static void main(String[] args) throws SQLException {

        String url = "jdbc:sqlite:/home/fikilegqibitole/NEWDB";
        String query = "select * from SBHotel";

        /*try{
            Class.forName("");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }*/

        try {
            Connection connect = DriverManager.getConnection(url);
            Statement state = connect.createStatement();
            ResultSet set = state.executeQuery(query);

            while(set.next()){
                String SBHotelData = "";
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
