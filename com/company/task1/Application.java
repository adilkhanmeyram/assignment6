package com.company.task1;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Database foo = Database.getInstance();
        String sql1 = "SELECT book_id, title, author, lending_period FROM books WHERE title = '1984' AND author = 'George Orwell'";
        System.out.println(foo.query(sql1));

        Database bar = Database.getInstance();
        String sql2 = "SELECT book_id, title, author, lending_period FROM books WHERE title = 'Robinson Crusoe' " +
                "AND author = 'Daniel Defoe'";
        System.out.println(bar.query(sql2));


    }
}
