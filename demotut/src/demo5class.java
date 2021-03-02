

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class to create Http Servlet
public class demo5class extends HttpServlet {

   private String mymsg;

   public void init() throws ServletException {
      mymsg = "Hello dipti!";
   }

   public void doGet(HttpServletRequest request, 
      HttpServletResponse response)
      throws ServletException, IOException 
   {

      // Setting up the content type of webpage
      response.setContentType("text/html");

      // Writing message to the web page
      PrintWriter out = response.getWriter();
      out.println("<h1>" + mymsg + "</h1>");
   }

   public void destroy() {
      /* leaving empty for now this can be
       * used when we want to do something at the end
       * of Servlet life cycle
       */
   }
}