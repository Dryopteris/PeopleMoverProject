package PizzaMoverIndexServlet;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.scribe.builder.ServiceBuilder;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

public class Yelp {
	
	OAuthService service;
	Token accessToken; 
	
	public Yelp(String consumerKey, String consumerSecret, String token, String tokenSecret) {
	    this.service = new ServiceBuilder().provider(YelpApi2.class).apiKey(consumerKey).apiSecret(consumerSecret).build();
	    this.accessToken = new Token(token, tokenSecret);
	  }
	
	public String search(String term, double latitude, double longitude) {
	    OAuthRequest request = new OAuthRequest(Verb.GET, "http://api.yelp.com/v2/search");
	    //String str = Double.toString(radius_filter);
	    request.addQuerystringParameter("term", term);
	    request.addQuerystringParameter("ll", latitude + "," + longitude);
	    //request.addQuerystringParameter("radius_filter",str);
	    this.service.signRequest(this.accessToken, request);
	    Response response = request.send();
	    return response.getBody();
	  }
}
