package com.zahid.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

// import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// @WebServlet("/hello")
public class DateServlet extends HttpServlet {
    
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");

        
        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>Hello World</h1>");
        writer.println("<p>The time is: " + new Date() + "</p>");
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    }
}
