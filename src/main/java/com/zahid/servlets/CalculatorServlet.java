package com.zahid.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var num1 = request.getParameter("num1");
        var num2 = request.getParameter("num2");

        if (num1 != null  && num1.length() > 0 && num2 != null  && num2.length() > 0) {
            double x = Double.parseDouble(num1);
            double y = Double.parseDouble(num2);
            double s = x + y;
            request.setAttribute("result", s);
            request.getRequestDispatcher("calculator-result.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var num1 = request.getParameter("num1");
        var num2 = request.getParameter("num2");

        if (num1 != null  && num1.length() > 0 && num2 != null  && num2.length() > 0) {
            double x = Double.parseDouble(num1);
            double y = Double.parseDouble(num2);
            double s = x + y;
            request.setAttribute("result", s);
            request.getRequestDispatcher("calculator-result.jsp").forward(request, response);
        }
    }
    
}
