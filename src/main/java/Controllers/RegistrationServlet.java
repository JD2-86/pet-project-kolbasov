package Controllers;

import dao.UserDaoIml;
import entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/registration")
public class RegistrationServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String username =req.getParameter("username");
        String password =req.getParameter("password");
        String firstname=req.getParameter("firstname");
        String lastname =req.getParameter("lastname");
        String email=req.getParameter("email");
        User myuser =new User(username,password,firstname,lastname,email);
        UserDaoIml m =new UserDaoIml();
        m.save(myuser);

    }

}