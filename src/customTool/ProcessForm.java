package customTool;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.coyote.RequestGroupInfo;

/**
 * Servlet implementation class ProcessForm
 */
@WebServlet("/ProcessForm")
public class ProcessForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String pass = request.getParameter("pass");
		String message = "Failed to login. Incorrect username or password.\n";
		
		String nextPage ="/output.jsp";
		
		if(username.equals("dave@gmail.com")){
			if(pass.equals("password")){
				message = "You are a valid user!";
			}
		}
		
		request.setAttribute("message", message);
		
		request.getServletContext().getRequestDispatcher(nextPage).forward(request, response);
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
