
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Greet")
public class Greet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) {
		try {
			res.sendRedirect("/SecondWebApp/greeting.html");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
