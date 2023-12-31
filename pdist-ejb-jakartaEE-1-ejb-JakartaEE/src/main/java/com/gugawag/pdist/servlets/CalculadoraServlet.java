package com.gugawag.pdist.servlets;

import br.edu.ifpb.ejb.CalculadoraIF;
import jakarta.ejb.EJB;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/calculadora.do")
public class CalculadoraServlet extends HttpServlet {
    @EJB(lookup="java:global/calculadoraejb-1.0-SNAPSHOT/calculadoraService")
    private CalculadoraIF calculadora;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String operacao = request.getParameter("somar");
        PrintWriter resposta = response.getWriter();
        int n1 = Integer.parseInt(request.getParameter("n1"));
        int n2 = Integer.parseInt(request.getParameter("n2"));
        resposta.println("Somatório = " + calculadora.somar(n1, n2));
    }
}
