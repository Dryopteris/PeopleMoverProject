package PizzaMoverIndexServlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

//import mover.infrastructure.yelp.Business;

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
		
		String station = request.getParameter("station"); 
		String attraction = request.getParameter("attraction"); 
		
		String consumerKey = "SAf85hZyboz0zMDa5xxCHw";
	    String consumerSecret = "Er4NtvE4tYQfDvr7pOKJ2Ke1TJI";
	    String token = "qxxl_X9feCJC6HyPRTjxuBsoded68s1o";
	    String tokenSecret = "TWK0s5zjs7ZKxKsL0nftz_rut-Q";

	    Yelp yelp = new Yelp(consumerKey, consumerSecret, token, tokenSecret);
	    String response1 = yelp.search("strip club", 42.335709, -83.049888);
		 
	    Business business = new Business(); 
	    Type listType = new TypeToken<List<Business>>(){}.getType(); 
	    
	    
		//Eventually this will go in a method
	    
	    Gson gson = new Gson();
		Region business2 = gson.fromJson(response1,Region.class);
		//business2.getLocation();
		try {
			JSONObject obj = new JSONObject(response1);
			System.out.println(obj);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//	request.setAttribute("finalString", business2.get);
		
		request.setAttribute("response1", response1);
		//request.setAttribute("word", word);
		request.setAttribute("station", station);
		request.setAttribute("attraction", attraction);
		getServletContext().getRequestDispatcher("/Results.jsp").forward(request, response);
	}

}
