/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 *
 * @author Hp
 */
@WebServlet(urlPatterns = {"/CookiePrg2"})
public class CookiePrg2 extends HttpServlet {



 public void doGet(HttpServletRequest request, 
    HttpServletResponse response){
    try{
       response.setContentType("text/html");
       PrintWriter pwriter = response.getWriter();
 
       
       Cookie c[]=request.getCookies(); 
       
       pwriter.print("<h1>Pssword:-----</h> "+c[1].getValue()); 
       
       pwriter.print("Password: "+c[2].getValue());
 
       pwriter.close();
    }catch(Exception exp){
       System.out.println(exp);
     }
  }
}


