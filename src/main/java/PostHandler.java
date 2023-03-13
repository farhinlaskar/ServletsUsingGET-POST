

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/PostHandler")
public class PostHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public PostHandler() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		out.println("Name=" + name + "<br>Address=" +address);
		out.println("</html></body>");
	}

}
