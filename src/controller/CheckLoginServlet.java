package controller;

import model.bo.CheckLoginBO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by TiNa on 03/05/2017.
 */
@WebServlet("/CheckLoginServlet")
public class CheckLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        String destination = null;

        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        CheckLoginBO checkLoginBO = new CheckLoginBO();
        HttpSession session = request.getSession();

        try{
            if (checkLoginBO.isValidUser(userName, password)) {
                session.setAttribute("username",userName);
                destination = "/welcome.jsp";
                RequestDispatcher rd = getServletContext().getRequestDispatcher(
                        destination);
                rd.forward(request, response);
            } else {
                destination = "/fail.jsp";
                RequestDispatcher rd = getServletContext().getRequestDispatcher(
                        destination);
                rd.forward(request, response);

            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
