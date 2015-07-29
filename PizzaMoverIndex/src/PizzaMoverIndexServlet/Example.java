package PizzaMoverIndexServlet;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;



@Generated("org.jsonschema2pojo")
public class Example {

	@Expose
	private Region region;
	@Expose
	private Integer total;
	@Expose
	private List<Business> businesses = new ArrayList<Business>();

	/**
	* 
	* @return
	* The region
	*/
	public Region getRegion() {
	return region;
	}

	/**
	* 
	* @param region
	* The region
	*/
	public void setRegion(Region region) {
	this.region = region;
	}

	/**
	* 
	* @return
	* The total
	*/
	public Integer getTotal() {
	return total;
	}

	/**
	* 
	* @param total
	* The total
	*/
	public void setTotal(Integer total) {
	this.total = total;
	}

	/**
	* 
	* @return
	* The businesses
	*/
	public List<Business> getBusinesses() {
	return businesses;
	}

	/**
	* 
	* @param businesses
	* The businesses
	*/
	public void setBusinesses(List<Business> businesses) {
	this.businesses = businesses;
	}

}
