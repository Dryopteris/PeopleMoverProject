package src.PizzaMoverIndexServlet;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONException;

public class URLJSONString {
	public static String parseJSON() throws IOException, JSONException{
		StringBuilder jsonResult = null;
		try {
			URL google = new URL(
					"https://maps.googleapis.com/maps/api/place/textsearch/json?query=pizza+in+Detroit&key=AIzaSyAxC5yolZSd5G-UiQc70px_8cX0T09mqNs");
			URLConnection yc = google.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(
					yc.getInputStream()));
			String inputLine;
			jsonResult = new StringBuilder();
			while ((inputLine = in.readLine()) != null) {
				jsonResult.append(inputLine);
			}
		} catch (MalformedURLException e) {
			System.out.println("MalformedURL");
		}
		return jsonResult.toString();
	}
}

