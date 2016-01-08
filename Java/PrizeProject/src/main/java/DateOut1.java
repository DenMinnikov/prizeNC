import org.joda.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/date")
public class DateOut1 extends HttpServlet {
    protected void doPost (HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {


        req.getParameter("age");// == 25

        LocalDate ld = new LocalDate();
        LocalDate result = ld.plusDays(15);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/date.jsp");
        req.setAttribute("date", ld );

       }@Override
    protected void doGet (HttpServletRequest req,
                           HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("In doGet Method");

        LocalDate ld = new LocalDate();
        LocalDate result = ld.plusDays(15);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/date.jsp");
        req.setAttribute("dateNow", ld);
        req.setAttribute("dateResult", result );
        rd.forward(req, resp);
    }

}




