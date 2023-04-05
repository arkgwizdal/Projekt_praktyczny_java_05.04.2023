package org.financeMennager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/";

    private static final String DB_NAME_ENV = "DB_NAME";

    private static final String BD_USER_ENV = "DB_USER";

    private static final String DB_PASSWORD_ENV = "DB_PASSWORD";

    public static void main(String[] args) throws SQLException, IOException {
        try (final Connection connection = DriverManager.getConnection(JDBC_URL + System.getenv(DB_NAME_ENV),
                System.getenv(BD_USER_ENV),System.getenv(DB_PASSWORD_ENV))){
            DbInitializer dbInitializer = new  DbInitializer(connection);
            dbInitializer.initDb();
            System.out.println("Well done !!!");
        }


    }


    }