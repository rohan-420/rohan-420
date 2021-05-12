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
@WebServlet(urlPatterns = {"/CookiePrg"})
public class CookiePrg extends HttpServlet {

  


   public void doPost(HttpServletRequest request, 
      HttpServletResponse response) {
      try{
          response.setContentType("text/html");
          PrintWriter pwriter = response.getWriter();

          String name = request.getParameter("userName");
          String password = request.getParameter("userPassword");
          pwriter.print("Hello "+name);
          pwriter.print("   Your Password is: "+password);

          
          Cookie c1=new Cookie("userName",name);
          Cookie c2=new Cookie("userPassword",password);

        
          response.addCookie(c1);
          response.addCookie(c2);
          pwriter.print("<br><a href='CookiePrg2'>View Details</a>");
          pwriter.close();
   }catch(Exception exp){
       System.out.println(exp);
    }
  }
}

