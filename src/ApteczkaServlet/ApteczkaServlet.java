package ApteczkaServlet;

import java.io.IOException;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



/**
 * Created by Pawel on 2015-06-04.
 */
public class ApteczkaServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        // Set the response message's MIME type
        response.setContentType("text/html;charset=UTF-8");
        // Allocate a output writer to write the response message into the network socket
        PrintWriter out = response.getWriter();

        // Write the response message, in an HTML page
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html><head>");
            out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
            out.println("<title>Apteczka</title></head>");
            out.println("<body>");
            out.println("<form action=\"http://localhost:8081/dodawanie\"/>\n" +
                    "  <input type=\"submit\" value=\"Dodaj lek\"/><br></form>\n" +
                    "<form action=\"http://localhost:8081/usuwanie\"/>\n" +
                    "  <input type=\"submit\" value=\"Usuñ lek\"/><br></form>\n"  +
                    "<form action=\"http://localhost:8081/wyswietlalfabetycznie\"/>\n"+
                    "  <input type=\"submit\" value=\"Wyswietl wszystkie leki alfabetycznie\"<br>\n" +
                    "</form>");

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();  // Always close the output writer
        }
    }
}

