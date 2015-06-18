package ApteczkaServlet;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Pawel on 2015-06-11.
 */
public class ApteczkaDAO {
    Connection connection;

    public ApteczkaDAO() {
        connection = DBConn.getConnection();
    }

    public void addDrug(Apteczka Apteczka) {
        try {

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Apteczka(" +
                    "nazwa_handlowa_leku," +
                    "nazwa_miedzynarodowa," +
                    "nazwa_substancji_czynnej," +
                    "wskazania," +
                    "przeciwwskazania," +
                    "rodzaj) VALUES(?,?,?,?,?,?)");
            preparedStatement.setString(1, Apteczka.getNazwa_handlowa_leku());
            preparedStatement.setString(2, Apteczka.getNazwa_miedzynarodowa());
            preparedStatement.setString(3, Apteczka.getNazwa_substancji_czynnej());
            preparedStatement.setString(4, Apteczka.getWskazania());
            preparedStatement.setString(5, Apteczka.getPrzeciwwskazania());
            preparedStatement.setString(6, Apteczka.getRodzaj());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void removeDrug(String nazwa_handlowa_leku){
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Apteczka where nazwa_handlowa_leku=?");
            preparedStatement.setString(1,nazwa_handlowa_leku);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Apteczka> printDrugs(){
        List<Apteczka> drugs = new ArrayList<Apteczka>();
        try{

            Statement stmt = connection.createStatement();
            // tutaj Pawe³ zaczyna siê ta funkcja do tego wyœwietlania alfabetycznie
            ResultSet rs = stmt.executeQuery("SELECT * FROM  `Apteczka`");

            while(rs.next()){

                Apteczka apteczka = new Apteczka();
                apteczka.setId_leku(rs.getInt("id_leku"));
                apteczka.setNazwa_handlowa_leku(rs.getString("nazwa_handlowa_leku"));
                apteczka.setNazwa_miedzynarodowa(rs.getString("nazwa_miedzynarodowa"));
                apteczka.setNazwa_substancji_czynnej(rs.getString("nazwa_substancji_czynnej"));
                apteczka.setWskazania(rs.getString("wskazania"));
                apteczka.setPrzeciwwskazania(rs.getString("przeciwwskazania"));
                apteczka.setRodzaj(rs.getString("rodzaj"));
                drugs.add(apteczka);

            }

        //rs.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        return drugs;
    }



}
