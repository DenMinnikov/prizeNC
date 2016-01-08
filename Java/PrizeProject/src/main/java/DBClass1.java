import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.List;
@WebServlet("/prize")
public class DBClass1 extends HttpServlet {
    private ServletConfig config;

    public void init(ServletConfig config) throws ServletException{
        this.config = config;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String page = "prize.jsp";
        List<Prize> datalist = null;
        try {
            datalist = DBClass.prizeSearch(25);
            for(Prize s: datalist){
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("data", datalist);
        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        if(dispatcher != null){
            dispatcher.forward(request, response);
        }
    }
}
