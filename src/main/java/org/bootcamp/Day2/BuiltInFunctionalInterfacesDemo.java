package org.bootcamp.Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfacesDemo {
    public void createConnection(String url, String username, String password) {

        Supplier<Connection> connectionSupplier = () -> {
            // Create a new database connection
            try {
                return DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        };
        // Get the database connection
        Connection connection = connectionSupplier.get();


    }
}
