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


public class DrugList {

    static String url = "mysql.agh.edu.pl";
    static String baza = "anowak";
    //static String login = "root";
    static String password = "gg83Vbdg";

    static int id_Drug;
    static String DrugName;
    static String InternationaDrugName;
    static String ActivityProductName;
    static String DrugIndication;                      //moze by tak enum?
    static String DrugContraidications;                //tutaj tez
    static String DrugType;                            //i tu rowniez

    static List<DrugList> allDrugList = new ArrayList<DrugList>();

    void printAllDrugsAlphabetically(String character){     //wyswietlanie lekartsw alfabetycznie

            /*tutaj nalezy wyslac zapytanie do mysql ktore bd szukalo wszystkich rekordow
            zaczynajacych sie na litere w zmiennej character, nale¿y tez zgrac to z klas*/
    }
    void printAllDrugs(){            //wyswietlanie wszystkich lekarstw
             /*tutaj nalezy wyslac zapytanie do mysql ktore bd szukalo wszystkich rekordow
            a nastepnie je wyœwieli*/

    }
    void addToDrugList(String name,String internationalName,String activityProduct,String indcication,String contra,String type){
            /*tutaj zapytanie do mysql INSERT*/
            /*mozna sie zastanowic nad przesylaniem parametrow do funkcji i wybrac inny sposob, np
             mozna najpierw za pomoca konstruktora utworzyc obiekt a pozniej wyslac ten obiekt do funkcji*/

    }
    void removeDrugFromList(String name){
            /*tutaj zapytanie do mysql DELETE*/
    }

    public DrugList(int id_drug){                           //konstruktor uzupelnia wszystkie pola w zaleznosci od id

            /* tutaj bd trzeba bd pobrac dane z formularza i uzupelnic
            te wszystkie pola              */

    }

}