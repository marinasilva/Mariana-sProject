/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author marina.silva
 */
public class ConnectionFactory {
    
    static Connection connection;
    
    public static Connection getConnection() throws SQLException{
    
        if (connection != null) {
            return connection;
        }
        else{
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=MedindoFebre;"
                        + "user=sa;password=P@55W0RD;MultipleActiveResultSets=true;";
                connection = DriverManager.getConnection(connectionURL);
                System.out.println("Conexão efetuada com sucesso!");
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
                System.out.println("Falha na conexão: " + e);
                throw new SQLException();
            }
        }
        return connection;
    }
}
