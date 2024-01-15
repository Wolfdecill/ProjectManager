/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Service.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author USER-PC
 */
@WebServlet(name = "Login_Servlet", urlPatterns = {"/Login_Servlet"})
public class Login_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Service_Interface service= new Service_Implementation();
        String password,username;
        
        switch(request.getParameter("submit")){
            case "Login":
                //Getting User's login credentials
                username =request.getParameter("username");
                password=request.getParameter("password");
                
                //Check if user exists and has correct password
                if(service.loginUser(username, password)){
                request.setAttribute("result","Login sucessfull");
                request.getRequestDispatcher("Home.html").forward(request, response);    
                }
                else{
                request.setAttribute("result","Login failed: Username or Password incorrect or User doesnt exist");
                request.getRequestDispatcher("Login.html").forward(request, response);
                }
            break;
            case "Register":
                username=request.getParameter("username");
                password=request.getParameter("password");
                
                service.registerUser(username, password);
            break;
        }
        
    }

    /* Description of what Servlet does */
    @Override
    public String getServletInfo() {
        return "This Servlet is responsible for all Login.html actions";
    }

}
