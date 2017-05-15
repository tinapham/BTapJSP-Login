package controller;

import model.bo.CheckLoginBO;
import model.bo.UpdateBO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by TiNa on 13/05/2017.
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        String destination = null;
        String userName = (String) request.getParameter("id");
        UpdateBO updateBO = new UpdateBO();

        try{
            if (updateBO.deleteUser(userName)) {
                destination = "/SearchServlet";
                RequestDispatcher rd = getServletContext().getRequestDispatcher(
                        destination);
                rd.forward(request, response);
            } else {
                destination = "/SearchServlet";
                RequestDispatcher rd = getServletContext().getRequestDispatcher(
                        destination);
                rd.forward(request, response);

            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        String destination = null;
        String userName = (String) request.getSession().getAttribute("id"); //get session attribute
        String fullname = request.getParameter("fullname");
        String roles = request.getParameter("roles");
        UpdateBO updateBO = new UpdateBO();

        try{
            if (updateBO.updateUser(userName, fullname, roles)) {
                destination = "/SearchServlet";
                RequestDispatcher rd = getServletContext().getRequestDispatcher(
                        destination);
                rd.forward(request, response);
            } else {
                destination = "/SearchServlet";
                RequestDispatcher rd = getServletContext().getRequestDispatcher(
                        destination);
                rd.forward(request, response);

            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
