package ApteczkaServlet;

/**
 * Created by Pawel on 2015-06-05.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DrugList {

    static int id_Drug;
    static String DrugName;
    static String InternationaDrugName;
    static String ActivityProductName;
    static String DrugIndication;                      //moze by tak enum?
    static String DrugContraidications;                //tutaj tez
    static String DrugType;                            //i tu rowniez

    //static List<DrugList> allDrugList = new ArrayList<DrugList>();

    public static void printAllDrugs(){            //wyswietlanie wszystkich lekarstw
        try
        {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUser("anowak");
            dataSource.setPassword("gg83Vbdg");
            dataSource.setServerName("mysql.agh.edu.pl");
            dataSource.setDatabaseName("anowak");
            dataSource.setPort(3306);
            Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            // tutaj Pawe³ zaczyna siê ta funkcja do tego wyœwietlania alfabetycznie
            ResultSet rs = stmt.executeQuery("SELECT * FROM  `Apteczka` ORDER BY  `Apteczka`.`nazwa handlowa leku` ASC");
            int columnCount = rs.getMetaData().getColumnCount();

            for(int i=1;i<=columnCount;i++)
            {
                System.out.print(rs.getMetaData().getColumnName(i));
                System.out.print("\t");
            }

            while(rs.next())
            {
                for(int i=1;i<=columnCount;i++)
                {
                    System.out.print(rs.getObject(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

            rs.close();
            stmt.close();
            conn.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }
    public static void addToDrugList(String name,String internationalName,String activityProduct,String indcication,String contra,String type){
        try {

            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUser("anowak");
            dataSource.setPassword("gg83Vbdg");
            dataSource.setServerName("mysql.agh.edu.pl");
            dataSource.setDatabaseName("anowak");
            dataSource.setPort(3306);
            Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();

            int row = stmt.executeUpdate("INSERT INTO `Apteczka`("+
                    "`nazwa handlowa leku`,"+
                    " `nazwa miêdzynarodowa`,"+
                    " `nazwa substancji czynnej`,"+
                    " `wskazania`,"+
                    " `rodzaj`, "+
                    " `przeciwwskazania`) "+
                    "VALUES('"+name+"','"+internationalName+"','"+activityProduct+"','"+indcication+"','"+type+"','"+contra+"')");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }
    public static void removeDrugFromList(String name) {
        try {

            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUser("anowak");
            dataSource.setPassword("gg83Vbdg");
            dataSource.setServerName("mysql.agh.edu.pl");
            dataSource.setDatabaseName("anowak");
            dataSource.setPort(3306);
            Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();

            int row = stmt.executeUpdate("DELETE FROM  `Apteczka` WHERE `Apteczka`.`nazwa handlowa leku`='"+name+"'  ");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public DrugList(int id_drug){                           //konstruktor uzupelnia wszystkie pola w zaleznosci od id

            /* tutaj bd trzeba bd pobrac dane z formularza i uzupelnic
            te wszystkie pola              */

    }

}