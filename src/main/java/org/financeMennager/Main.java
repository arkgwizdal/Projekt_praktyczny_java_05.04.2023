package org.financeMennager;

import jakarta.persistence.EntityManager;
import org.financeMennager.service.CattegoryService;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

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
            EntityManager entityManager = DbConnection.getEntityMennager();

            System.out.println("msql is connected and initialized propery ");
        }
        final  Scanner scanner =  new Scanner(System.in);
        final CattegoryService cattegoryService = new CattegoryService();

        while (true){
            System.out.println("What you can do :");
            System.out.println("0 - Exit program ");
            System.out.println("1 - Add new expences  ");
            System.out.println("2 - Add new income ");
            System.out.println("3 - Delete expences ");
            System.out.println("4 - Delete income");
            System.out.println("5 - Show all expences & income ");
            System.out.println("6 - Show all expences ");
            System.out.println("7 - Show expences by date ");
            System.out.println("8 - Show expences by category ");
            System.out.println("9 - Show sum of expences and quantity in cattegory ");
            System.out.println("10 - Show all income");
            System.out.println("11 - Show balance");
            System.out.println("12 - Add new cattegory");
            System.out.println("13 - Delete cattegory");

            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0 -> {
                    System.exit(0);
                }
                case 1 -> {

                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {

                }
                case 6 -> {

                }
                case 7 -> {

                }
                case 8 -> {

                }
                case 9 -> {

                }
                case 10 -> {

                }
                case 11 -> {

                }
                case 12 -> {
                    System.out.println("Adding new cattegory.");
                    System.out.println("Write name of new cattegory:");
                    String cattegoryName = scanner.nextLine();
                    cattegoryService.addCattegory(cattegoryName);
                }
                case 13 -> {
                    System.out.println("Delete cattegory : ");
                    String cattegoryName = scanner.nextLine();
                    cattegoryService.deleteCattegory(cattegoryName);
                }

            }

        }

    }


}