package JDBC;

import com.sun.codemodel.internal.JForEach;

import java.sql.*;

public class DemoDB {

    final static String CREATE = "CREATE TABLE sometable (id serial PRIMARY KEY, " +
            "name VARCHAR (50) NOT NULL)" ;

    final static String INSERT = "INSERT INTO sometable values (1, 'test')" ;
    final static String SELECT = "SELECT id, name FROM sometable where id =?" ;


    public static final String URL = "jdbc:postgresql://localhost:54320/postgres?" +
            "user=postgres&password=postgres";

    public static void main(String[] args) {
        createStorage();

    }

    private static void createStorage() {
        try {
            Class.forName("org.postgresql.Driver").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Statement st = null;
        try {
            st = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        try {
//            st.execute(INSERT);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        try {
//            st.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        try{
            PreparedStatement ps = conn.prepareStatement(SELECT);
            ps.setInt(1,1);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt("id")+ " : "+ rs.getString("name"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
