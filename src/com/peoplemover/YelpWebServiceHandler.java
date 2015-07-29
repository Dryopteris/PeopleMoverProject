package com.peoplemover;

import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.scribe.builder.ServiceBuilder;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

public class YelpWebServiceHandler {
	
//	OAuthService service = new ServiceBuilder().provider(DummyServlet.class).apiKey(CONSUMER_KEY).apiSecret(CONSUMER_SECRET).build();
//	Token accessToken = new Token("wKXleYnSD0RH_qhj-myKey-UG", "myKey");
//	OAuthRequest request = new OAuthRequest(Verb.GET, "http://api.yelp.com/v2/search/?location=" + DummyServlet.stationAddress);
//	request.addQuerystringParameter("location", "Waterfront, Boston, MA");
//	request.addQuerystringParameter("category", category);
//	service.signRequest(accessToken, request);
//	Response response = request.send();
//	String rawData = response.getBody();
	
	URL googlePlaces = new URL("https://maps.googleapis.com/maps/api/place/nearbysearch/json?query=pizza&keyword=pizza&location=" + DummyServlet.stationAddress + "&radius=300&key=AIzaSyAxC5yolZSd5G-UiQc70px_8cX0T09mqNs");
	
}
