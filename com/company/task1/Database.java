package com.company.task1;

import java.sql.*;
import java.util.UUID;

public class Database {
    private static Database instance;

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionUrl = "jdbc:postgresql://localhost:5432/library";
        try {
            // Here we load the driver’s class file into memory at the runtime
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            Connection con = DriverManager.getConnection(connectionUrl, "postgres", "123");

            return con;
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }


    // constructor is private to prevent direct construction calls with the `new`
    // operator
    private Database() {}

    // The static method that controls access to the singleton
    // instance.
    public static Database getInstance() throws SQLException, ClassNotFoundException {
        if (instance == null) {
            instance = new Database();
        } else if (instance.getConnection().isClosed()) {
            instance = new Database();
        }

        return instance;
    }


    //method for sending sql query to the database
    public String query(String sql) {
        Connection con = null;
        try {
            con = getConnection();
            PreparedStatement st = con.prepareStatement( sql);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Book book = new Book((UUID) rs.getObject("book_id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("lending_period"));

                return book.toString();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

}
