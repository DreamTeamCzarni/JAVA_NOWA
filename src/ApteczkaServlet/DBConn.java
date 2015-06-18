package ApteczkaServlet;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Pawel on 2015-06-11.
 */
public class DBConn {
    static Connection connection = null;

    public static Connection getConnection(){
        if(connection != null)            return connection;

        else{
            try{
                MysqlDataSource dataSource = new MysqlDataSource();
                dataSource.setUser("anowak");
                dataSource.setPassword("gg83Vbdg");
                dataSource.setServerName("mysql.agh.edu.pl");
                dataSource.setDatabaseName("anowak");
                dataSource.setPort(3306);
                connection = dataSource.getConnection();
            }
            catch(SQLException ex){
                ex.printStackTrace();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }

            return connection;
        }

    }
}
