package com.charlie.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author charlie
 * @since 2021-04-04 09:10
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    public static final String USER_NAME = "jay";
    public static final String PASS_WORLD = "abc123";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (USER_NAME.equals(username) && PASS_WORLD.equals(password)) {
            response.getWriter().write("login success...");
        } else {
            response.getWriter().write("login failed...");
        }
    }
}
