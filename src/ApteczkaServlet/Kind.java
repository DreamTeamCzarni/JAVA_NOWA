package ApteczkaServlet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pawel on 2015-06-05.
 */
public class Kind {
    static List<String> allKind = new ArrayList<String>();

    public void fillList(){
        allKind.add("ma��, krem");
        allKind.add("tabletki");
        allKind.add("proszek do sporz�dzenia roztworu");
        allKind.add("rozstw�r do wstrzykiwania");
        allKind.add("krople doustne");
        allKind.add("syrop");
    }
    public void addToList(String element){
        allKind.add(element);

    }
}
