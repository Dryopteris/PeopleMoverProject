package PizzaMoverIndexServlet;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONException;
import org.json.JSONObject;

//import javax.json.*;

public class TestClass {

	public String returnJsonString() {

		JSONObject jsonObject = null;
		try {
			URL wiki = new URL(
					"http://en.wikipedia.org/w/api.php?action=query&prop=extracts&format=json&exintro=&titles=pizza");
			URLConnection yc = wiki.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
			String inputLine;
			StringBuilder jsonResult = new StringBuilder();
			while ((inputLine = in.readLine()) != null) {
				jsonResult.append(inputLine);
			}
			jsonObject = new JSONObject(jsonResult.toString());
			System.out.println(jsonResult.toString());
		}

		catch (MalformedURLException e) {
			System.out.println("MalformedURL");

		} catch (JSONException q) {
			q.printStackTrace();
		}

		catch (IOException x) {
			x.printStackTrace();
		}
		return jsonObject.toString();
	}
}
