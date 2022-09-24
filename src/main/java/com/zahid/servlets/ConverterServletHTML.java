package com.zahid.servlets;

import java.io.IOException;
// import java.io.PrintWriter;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
// import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// @WebServlet("/convert")
public class ConverterServletHTML extends HttpServlet {

/*     @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer = response.getWriter();
        var temperature = request.getParameter("temperature");
        response.setContentType("text/html");

        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>Celsius to Farenhit Converter</h1>");
        if (temperature != null && temperature.length() > 0) {
            double C = Double.parseDouble(temperature);
            // double F = (9 * C / 5)  + 32;
            double F = 1.8 * C + 32;
            request.setAttribute("farenhit", F);
            // request.getSession().setAttribute("F", F);

            writer.println("<h3>Temperature in Farenhit: " + F + "</h3>");

            System.out.println(F);
        }
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    } */

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        var temperature = request.getParameter("temperature");
        response.setContentType("text/html");

        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>Celsius to Farenhit Converter</h1>");
        if (temperature != null && temperature.length() > 0) {
            double C = Double.parseDouble(temperature);
            // double F = (9 * C / 5)  + 32;
            double F = 1.8 * C + 32;
            request.setAttribute("farenhit", F);
            // request.getSession().setAttribute("F", F);

            writer.println("<h3>Temperature in Farenhit: " + F + "</h3>");

            System.out.println(F);
        }
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        var temperature = request.getParameter("temperature");
        response.setContentType("text/html");

        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>Celsius to Farenhit Converter</h1>");
        if (temperature != null && temperature.length() > 0) {
            double C = Double.parseDouble(temperature);
            // double F = (9 * C / 5)  + 32;
            double F = 1.8 * C + 32;
            request.setAttribute("farenhit", F);
            // request.getSession().setAttribute("F", F);

            writer.println("<h3>Temperature in Farenhit: " + F + "</h3>");

            System.out.println(F);
        }
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    }

}
