package ApteczkaServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pawel on 2015-06-05.
 */
public class DodawanieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the response message's MIME type
        response.setContentType("text/html;charset=UTF-8");
        // Allocate a output writer to write the response message into the network socket
        PrintWriter out = response.getWriter();
        Indication.fillList();
        Contraidication.fillList();
        Kind.fillList();
        // Write the response message, in an HTML page
        try {
            String s = "<option> " + Indication.allIndication.get(0) + " </option>\n";
            String p = "<option> " + Contraidication.allContraidication.get(0) + " </option>\n";
            String k = "<option> " + Kind.allKind.get(0) + " </option>\n";
            out.println("<!DOCTYPE html>");
            out.println("<html><head>");
            out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
            out.println("<title>Dodawanie leku</title></head>");
            out.println("<body>");
            out.println("<form action=\"http://localhost:8081/dodawanie\" method=\"POST\"/>\n" +
                    " Nazwa leku: <input type=\"text\" name=\"nazwa\"/><br>\n" +
                    " Nazwa miêdzynarodowa leku: <input type=\"text\" name=\"miedzynarodowa\"/><br>\n" +
                    " Nazwa substancji czynnej: <input type=\"text\" name=\"substancja\"/><br>\n" +
                    " Wskazania: <select name=\"wskazania\">\n ");
            int i = 1;
            while (i < 12) {

                s = s + "<option> " + Indication.allIndication.get(i) + " </option>\n";
                i++;
            }
            out.println(s);
            out.println("</select>\n<br>" +
                    " Przeciwwskazania: <select name=\"przeciwwskazania\">\n ");
            i = 1;
            while (i < 5) {

                p = p + "<option> " + Contraidication.allContraidication.get(i) + " </option>\n";
                i++;
            }
            out.println(p);
            out.println("</select>\n<br>" +
                    " Rodzaj: <select name=\"rodzaj\">\n ");
            i = 1;
            while (i < 6) {

                k = k + "<option> " + Kind.allKind.get(i) + " </option>\n";
                i++;
            }
            out.println(k);
            out.println("</select>\n<br>" +
                    "  <input type=\"submit\" value=\"Dodaj lek\"<br>\n" +
                    "</form>");

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();  // Always close the output writer
        }

    }
}
