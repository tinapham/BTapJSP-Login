package controller;

import model.bean.Admin;
import model.bo.RegisterBO;
import model.bo.SearchBO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by TiNa on 09/05/2017.
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String destination = null;

        String username = request.getParameter("username");
        String pass = request.getParameter("password");
        String fullname = request.getParameter("fullname");
        String roles = request.getParameter("roles");
        RegisterBO registerBO = new RegisterBO();
        try {
            if(registerBO.register(username,pass,fullname,roles)) {
                destination = "/index.jsp";
                RequestDispatcher rd = getServletContext().getRequestDispatcher(
                        destination);
                rd.forward(request, response);
            } else {
                request.setAttribute("fail","Username is used");
                destination = "/register.jsp";
                RequestDispatcher rd = getServletContext().getRequestDispatcher(
                        destination);
                rd.forward(request, response);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
