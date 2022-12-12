package com.example.vins.web;

import com.example.vins.model.ViExpert;
import com.example.vins.model.Vins;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "viselectionaction", value = "/viselectionaction")
public class viselectionaction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String color = request.getParameter("color");
        ViExpert viExpert = new ViExpert();
        Vins vi1 = new Vins("Messet del Lleó","rosat");
        Vins vi2 = new Vins("hola2","blanc");
        Vins vi3 = new Vins("vi3","negre");
        Vins vi4 = new Vins("vi4","blanc");
        viExpert.AddVins(vi1);
        viExpert.AddVins(vi2);
        viExpert.AddVins(vi3);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println ("<HTML>");
        out.println ("<BODY>");
        out.println ("<H1>Marques de Vi suggerides</H1>");
        out.println (viExpert.getMarques(color));
        out.println ("</BODY>");
//        out.println("----llista de marques de vins----");
        out.println ("</HTML>");

    }
}
