package ApteczkaServlet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pawel on 2015-06-05.
 */
public class Indication {
    static List<String> allIndication = new ArrayList<String>();

    public void fillList() {
        allIndication.add("podra�nienia sk�ry");
        allIndication.add("zaka�enia sk�ry");
        allIndication.add("zaka�enia ran");
        allIndication.add("zawa� mi�nia sercowego");
        allIndication.add("b�le s�abe i umiarkowane");
        allIndication.add("zaburzenia snu");
        allIndication.add("choroby gor�czkowe");
        allIndication.add("zaburzenia pami�ci");
        allIndication.add("kamica dr�g moczowych");
        allIndication.add("alergiczne zapalenie b�ony �luzowej nosa");
        allIndication.add("utrudnione odksztuszanie");
        allIndication.add("nadci�nienie t�tnicze");
        allIndication.add("zaka�enia paso�ytnicze");

    }
    public void addToList(String element){
        allIndication.add(element);

    }
}
