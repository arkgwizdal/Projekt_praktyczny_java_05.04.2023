package org.financeMennager;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbInitializer {

    private final Connection connection;
    public DbInitializer(Connection conecntion) {
        this.connection =conecntion;
    }

    public void initDb() throws IOException, SQLException{
        try (InputStream incoms = getClass().getResourceAsStream("/sql/incoms_ddl.sql");
                InputStream categorys = getClass().getResourceAsStream("/sql/cattegorys_ddl.sql");
                InputStream expenses = getClass().getResourceAsStream("/sql/expenses_ddl.sql")){
           executeSqlFromeResources(incoms);
           executeSqlFromeResources(categorys);
           executeSqlFromeResources(expenses);

        }


    }

    private void executeSqlFromeResources(InputStream inputStream) throws IOException, SQLException {
        if(inputStream == null){
            System.err.println("Failed to open reource");
            return;
        }
        String sql = new String(inputStream.readAllBytes());
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
    }

}
