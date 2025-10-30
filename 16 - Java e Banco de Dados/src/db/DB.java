package db;

// This class will be used to establish and to close the connection with the database
// Essa classe será usada para estabelecer e interromper a conexão com o banco de dados

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class DB {

    private static Connection connection = null;
    private static BufferedWriter buffw = null;

    public static Connection getConnection() {
        if (connection == null) {
            createLOG(); // Initiates the LOG in a different file | Inicia o LOG em um arquivo diferente
            try {
                buffw.write("LOG: Attempting Connection with the database.\n");

                Properties prop = loadProperties();
                String url  = prop.getProperty("dburl");
                connection = DriverManager.getConnection(url, prop);

                buffw.write("LOG: Connection established.\n");
            } catch (SQLException | IOException e ) {
                throw new DbException(e.getMessage());
            }

            // Connecting to a database means creating an instance of the Connection class
            // Conectar com um banco de dados significa instanciar um objeto da classe Connection

        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                buffw.write("LOG: Closing Connection.\n");
                buffw.write("LOG: Closing LOG.\n");

                connection.close();
                buffw.close();
            } catch (SQLException | IOException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void select(String table) {
        if (connection != null) {

            ResultSet rs = null;
            ResultSetMetaData rsmd;

            try {

                PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM " + table);
                rs = preparedStatement.executeQuery();
                rsmd = rs.getMetaData();

                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    while(rs.next()) {
                        System.out.println(
                                rs.getInt("Id") + ", " +
                                rs.getString("Name") + ", " +
                                rs.getString("Email") + ", " +
                                rs.getDate("BirthDate").getTime() + ", " +
                                rs.getDouble("BaseSalary") + ", " +
                                rs.getInt("DepartmentId") + ".");
                    }
                }

                buffw.write("LOG: SELECTED every row from " + table + ".\n");

            } catch (SQLException | IOException e) {
                throw new DbException(e.getMessage());
            } finally {
                DB.closeResultSet(rs);
            }

        } else {
            try {
                buffw.write("LOG: No database found.");
            } catch (IOException e) {
                throw new DbException(e.getMessage());
            }
        }

    }

    // "Properties" is a kind of Map (the structure) where both keys and values are Strings
    // "Properties" é um tipo de Map (estrutura) onde ambos valores e chaves são Strings

    private static Properties loadProperties() {
        try(FileInputStream fis = new FileInputStream("db.properties")) {
            Properties prop = new Properties();
            prop.load(fis);
            return prop;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    private static void createLOG() {
        if ( buffw == null) {
            try {
                buffw = new BufferedWriter(new FileWriter("LOG.txt"));
                buffw.write("LOG: Creating log file.\n");
            } catch (RuntimeException | IOException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

}
