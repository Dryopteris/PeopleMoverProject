package PizzaMoverIndexServlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PizzaMoverIndexServlet
 */
@WebServlet("/PIZZAMOVERRESULTS")
public class PizzaMoverIndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PizzaMoverIndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//doGet(request, response);
		//HashMap<String, Object> map = new HashMap<String, Object>(); 
		String station = request.getParameter("station"); 
		String attraction = request.getParameter("attraction"); 
		
		String consumerKey = "SAf85hZyboz0zMDa5xxCHw";
	    String consumerSecret = "Er4NtvE4tYQfDvr7pOKJ2Ke1TJI";
	    String token = "qxxl_X9feCJC6HyPRTjxuBsoded68s1o";
	    String tokenSecret = "TWK0s5zjs7ZKxKsL0nftz_rut-Q";

	    Yelp yelp = new Yelp(consumerKey, consumerSecret, token, tokenSecret);
	    String response1 = yelp.search("burritos", 30.361471, -87.164326);
		 
		//TestClass c =new TestClass(); 
		//String word = c.returnJsonString();
		
		request.setAttribute("response1", response1);
		//request.setAttribute("word", word);
		request.setAttribute("station", station);
		request.setAttribute("attraction", attraction);
		getServletContext().getRequestDispatcher("/Results.jsp").forward(request, response);
	}

}
