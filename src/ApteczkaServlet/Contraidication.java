package ApteczkaServlet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pawel on 2015-06-05.
 */
public class Contraidication {

    public static List<String> allContraidication = new ArrayList<String>();

    public static void fillList() {
        allContraidication.add("uczulenie na sk³adniki");
        allContraidication.add("ci¹za");
        allContraidication.add("brak");
        allContraidication.add("nadciœnienie têtnicze");
        allContraidication.add("kamica dróg moczowych");
    }
    public void addToList(String element){
        allContraidication.add(element);

    }

}