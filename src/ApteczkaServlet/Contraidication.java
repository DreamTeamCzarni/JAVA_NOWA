package ApteczkaServlet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pawel on 2015-06-05.
 */
public class Contraidication {

    static List<String> allContraidication = new ArrayList<String>();

    public void fillList() {
        allContraidication.add("uczulenie na sk�adniki");
        allContraidication.add("ci�za");
        allContraidication.add("brak");
        allContraidication.add("nadci�nienie t�tnicze");
        allContraidication.add("kamica dr�g moczowych");
    }
    public void addToList(String element){
        allContraidication.add(element);

    }

}