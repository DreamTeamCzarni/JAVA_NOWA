package ApteczkaServlet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pawel on 2015-06-05.
 */
public class Indication {
    static List<String> allIndication = new ArrayList<String>();

    public void fillList() {
        allIndication.add("podra¿nienia skóry");
        allIndication.add("zaka¿enia skóry");
        allIndication.add("zaka¿enia ran");
        allIndication.add("zawa³ miêœnia sercowego");
        allIndication.add("bóle s³abe i umiarkowane");
        allIndication.add("zaburzenia snu");
        allIndication.add("choroby gor¹czkowe");
        allIndication.add("zaburzenia pamiêci");
        allIndication.add("kamica dróg moczowych");
        allIndication.add("alergiczne zapalenie b³ony œluzowej nosa");
        allIndication.add("utrudnione odksztuszanie");
        allIndication.add("nadciœnienie têtnicze");
        allIndication.add("zaka¿enia paso¿ytnicze");

    }
    public void addToList(String element){
        allIndication.add(element);

    }
}
