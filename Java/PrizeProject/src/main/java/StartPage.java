import org.joda.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/start")
public class StartPage extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DateOut dateOut = new DateOut();
        response.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");
        String age = request.getParameter("age");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        name = new String(name.getBytes("ISO-8859-1"), "UTF-8");
        lastname = new String(lastname.getBytes("ISO-8859-1"), "UTF-8");
        age = new String(age.getBytes("ISO-8859-1"), "UTF-8");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Пользователь</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Пользователь</h1>");
        out.println(
                "Имя: " + ((name == null || name.equals(""))?
                        "Не известно" : name));
        out.println("<br><br>");
        out.println(
                "Фамилия: " + ((lastname == null || lastname.equals(""))?
                        "Не известно" : lastname));
        out.println("<br><br>");
        out.println(
                "Возраст: " + ((tryParseInt(age) == null || tryParseInt(age).equals(""))?
                        "Не известно" : tryParseInt(age)));
        out.println("<br><br>");
        out.println("Предполагаемая дата лоставки: " + dateOut.resultDate());
        out.println("<br><br>");
        try {
            out.println("Вам доступны призы: " + DBClass.prizeSearch(tryParseInt(age)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        out.println("</body>");
        out.println("</html>");

        out.println();

        out.close();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doPost(request, response);
    }
    Integer tryParseInt(String s) {
        try {
            return new Integer(s);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
