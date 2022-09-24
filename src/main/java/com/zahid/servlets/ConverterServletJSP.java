package com.zahid.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
// import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// @WebServlet(urlPatterns = "/convert", name = "ConverterServlet2")
public class ConverterServletJSP extends HttpServlet {

/*     @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        var temperature = request.getParameter("temperature");

        if (temperature != null && temperature.length() > 0) {
            double C = Double.parseDouble(temperature);
            // double F = (9 * C / 5)  + 32;
            double F = 1.8 * C + 32;
            request.setAttribute("farenhit", F);

            // request.getSession().setAttribute("F", F);
            // request.getSession().setAttribute("farenhit", String.valueOf(F));
            // response.sendRedirect("result.jsp");

            request.getRequestDispatcher("converter-result.jsp").forward(request, response);
            // System.out.println(F);
        }
    } */

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var temperature = request.getParameter("temperature");

        if (temperature != null && temperature.length() > 0) {
            double C = Double.parseDouble(temperature);
            // double F = (9 * C / 5)  + 32;
            double F = 1.8 * C + 32;
            request.setAttribute("farenhit", F);
            request.getRequestDispatcher("converter-result.jsp").forward(request, response);
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var temperature = request.getParameter("temperature");

        if (temperature != null && temperature.length() > 0) {
            double C = Double.parseDouble(temperature);
            // double F = (9 * C / 5)  + 32;
            double F = 1.8 * C + 32;
            request.setAttribute("farenhit", F);
            request.getRequestDispatcher("converter-result.jsp").forward(request, response);
        }
    }

}
