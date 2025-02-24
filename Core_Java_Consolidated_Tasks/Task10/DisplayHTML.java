import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayHTML extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>HTML Content</title></head><body>");
        out.println("<h2>Welcome to My Servlet</h2>");
        out.println("<p>This is a simple servlet displaying an HTML file.</p>");
        out.println("</body></html>");
    }
}
