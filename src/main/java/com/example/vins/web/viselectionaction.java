package com.example.vins.web;

import com.example.vins.model.ViExpert;
import com.example.vins.model.Vins;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ViSelectionAction", value = "/ViSelectionAction")
public class viselectionaction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String color = request.getParameter("color");
        ViExpert viExpert = new ViExpert();
        viExpert.AddVins();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String fonsColor = "";
        String lletraColor = "black";
        if (color.equals("negre")){
            fonsColor = "black";
        } else if (color.equals("blanc")) {
            fonsColor = "white";
        } else {
            fonsColor = "pink";
        }
        if (fonsColor.equals("black")){
            lletraColor = "white";
        }
        out.println ("<HTML>");
        out.println ("<BODY style=\"background-color:" + fonsColor + ";\">");
//        out.println ("<H1 style=\"text-align:center;\">Marques de Vi suggerides</H1>");
        out.println ("<H1 style=\"text-align:center;color:" + lletraColor + "\">Marques de Vi suggerides</H1>");
        out.println ("<p style=\"text-align:center;color:" + lletraColor + "\">" + viExpert.getMarques(color));
        out.println ("</BODY>");
//        out.println("----llista de marques de vins----");
        out.println ("</HTML>");

    }
}
