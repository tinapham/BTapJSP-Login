package controller;

import model.bean.Admin;
import model.bo.CheckLoginBO;
import model.bo.SearchBO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by TiNa on 09/05/2017.
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String destination = null;
        String search ="";
        try{
            if(!(request.getParameter("search")).equals(null)) search = request.getParameter("search");
        } catch (Exception e){}
        System.out.print("Demo 1 "+search);
        SearchBO searchBO = new SearchBO();
        try {
            List<Admin> list = searchBO.searchUser(search);
            request.setAttribute("searchArray", list);
            destination = "/search_result.jsp";
            RequestDispatcher rd = getServletContext().getRequestDispatcher(
                    destination);
            rd.forward(request, response);
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
