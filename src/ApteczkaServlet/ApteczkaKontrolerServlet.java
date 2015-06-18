package ApteczkaServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Pawel on 2015-06-11.
 */

public class ApteczkaKontrolerServlet extends HttpServlet {

    private  static  final long serialVersionUID = 102831973239L;
    private static String INSERT = "/addDrug.jsp";
    private static String LIST_APTECZKA = "/printAllUser.jsp";
    private ApteczkaDAO dao;

    public ApteczkaKontrolerServlet(){
        super();
        dao = new ApteczkaDAO();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Apteczka apteczka = new Apteczka();
        request.setCharacterEncoding("UTF-8");

        apteczka.setNazwa_handlowa_leku(request.getParameter("nazwa_handlowa_leku"));
        apteczka.setNazwa_miedzynarodowa(request.getParameter("nazwa_miedzynarodowa"));
        apteczka.setNazwa_substancji_czynnej(request.getParameter("nazwa_substancji_czynnej"));
        apteczka.setWskazania(request.getParameter("wskazania"));
        apteczka.setPrzeciwwskazania(request.getParameter("przeciwwskazania"));
        apteczka.setRodzaj(request.getParameter("rodzaj"));

        dao.addDrug(apteczka);

        RequestDispatcher view = request.getRequestDispatcher(LIST_APTECZKA);
        request.setAttribute("drugs",dao.printDrugs());
        view.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

        if(action.equalsIgnoreCase("delete")) {
            request.setCharacterEncoding("UTF-8");
            String nazwa_handlowa_leku = request.getParameter("nazwa_handlowa_leku");
            dao.removeDrug(nazwa_handlowa_leku);
            forward = LIST_APTECZKA;
            request.setAttribute("drugs", dao.printDrugs());
        }
        else if(action.equalsIgnoreCase("add")){
            forward = INSERT;

        }
        else if(action.equalsIgnoreCase("print")){
            forward = LIST_APTECZKA;
            request.setAttribute("drugs", dao.printDrugs());

        }
        else {
            forward = INSERT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
}
