package PizzaMoverIndexServlet;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Region {
	@Expose
	private Span span;
	@Expose
	private Center center;

	/**
	* 
	* @return
	* The span
	*/
	public Span getSpan() {
	return span;
	}

	/**
	* 
	* @param span
	* The span
	*/
	public void setSpan(Span span) {
	this.span = span;
	}

	/**
	* 
	* @return
	* The center
	*/
	public Center getCenter() {
	return center;
	}

	/**
	* 
	* @param center
	* The center
	*/
	public void setCenter(Center center) {
	this.center = center;
	}

}
