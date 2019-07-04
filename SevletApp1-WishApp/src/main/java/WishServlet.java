import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WishServlet extends HttpServlet {
     @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	 PrintWriter pw=null;
    	//get PrintWriter object
    	 pw=res.getWriter();
    	 // set content type
    	 res.setContentType("text/html");
    	 //write wish message
    	 pw.print("Wlcome to Servlet");
    	 //close pw
    	 pw.close();
    }
     /*     @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	doGet(req, res);
    } */
}
