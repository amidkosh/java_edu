package JDBC;

import java.sql.*;

public class DBworker {
    public static final String URL = "jdbc:postgresql://localhost:54320/postgres?" +
            "user=postgres&password=postgres";

    final static String CREATE = "CREATE TABLE product (id serial PRIMARY KEY, " +
            "name VARCHAR (50) NOT NULL)" +
            "description VARCHAR (500) NOT NULL)";

    private Connection conn = null;

    DBworker() {
        createConnection();
        ResultSet res = null;
        try {
            res = conn.getMetaData().getTables(null, null, "product", new String[]{"TABLE"});
            if (res.wasNull()) {
                createStorage();
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection createConnection() {
        try {
            Class.forName("org.postgresql.Driver").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection(URL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    private void createStorage() {
        Statement st = null;
        try {
            st = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            st.execute(CREATE);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Storage has been created!");
    }

    public void save(Product product) {
    }
}
