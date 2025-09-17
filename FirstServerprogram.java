package com.Destination;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FirstServerprogram")
public class FirstServerprogram extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Fetch the "username" value entered in the form
        String username = request.getParameter("username");
        String password= request.getParameter("password");
        

        // Simple logic
        if (username == null && username.equals(" ")) {
            out.println("<h1>Please enter a valid username!</h1>");
        } else {
            out.println("<h1> Hi hello! Welcome to " + username + "</h1>");
        }
        if(password== null && password.equals(null)) {
        	out.println("<h1> please enter the valid passwors!</h1>");
        }
        else {
        	out.println("<h1>wow your password is very nice ! good choice<h1>");
        }
    }
}
