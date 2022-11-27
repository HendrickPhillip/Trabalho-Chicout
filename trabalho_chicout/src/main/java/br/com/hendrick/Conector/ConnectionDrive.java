package br.com.hendrick.Conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionDrive {

    public static final String DRIVER = "org.h2.Driver";
    public static final String URL = "jdbc:h2:file:.\\DB";
    public static final String USER = "as";
    public static final String PASS = "";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return (Connection) DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao conectar com o banco de dados");
        }
    }

    public static void closeConnection(Connection connection,
            PreparedStatement statement, ResultSet resultSet) {

        try {
            if (statement != null) {
                statement.close();
            }

            if (resultSet != null) {
                resultSet.close();
            }

            if (connection != null) {
                connection.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao encerrar a conexão com o banco de dados");
        }
    }

    public static void closeConnection(Connection connection,
            PreparedStatement statement) {

        try {
            if (statement != null) {
                statement.close();
            }

            if (connection != null) {
                connection.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao encerrar a conexão com o banco de dados");
        }
    }

}
