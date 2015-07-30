package src.PizzaMoverIndexServlet;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class JsonObjectArray {
	public static void main(String[] args) throws IOException, JSONException{
		JSONObject jsonObj = new JSONObject(URLJSONString.parseJSON());
		JSONArray jsonMainArr = jsonObj.getJSONArray("results");
		for (int i = 0; i < jsonMainArr.length(); i++) {  // **line 2**
		     JSONObject childJSONObject = jsonMainArr.getJSONObject(i);
		     String name = childJSONObject.getString("name");
		     String address = childJSONObject.getString("formatted_address");
		     System.out.println(name + "" + address);
		     
		}
	
	}

}
