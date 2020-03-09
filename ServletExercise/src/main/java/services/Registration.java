package services;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        urlPatterns = {"/registerPage"},
        name = "Register"
)

public class Registration extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String userName = req.getParameter("username");
        String password = req.getParameter("password");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String str = "<table border>";
        str += "<thead>";
        str += "<th>Email</th>";
        str += "<th>UserName</th>";
        str += "<th>Password</th>";
        str += "</thead>";
        str += "<tbody>";
        str += "<tr>";
        str += "<td>"+email+"</td>";
        str += "<td>"+userName+"</td>";
        str += "<td>"+password+"</td>";
        str += "</tr>";
        str += "</tbody>";
        str += "</table>";

        out.write(str);
        out.flush();

    }
}