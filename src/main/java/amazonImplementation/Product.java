package amazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {

	// Step4: inside the this class we are going to define some private implemetation variables.
	private String productName;
	private int price;
	
	/* Step5: create the constructor of Product class --> right click anywhere in this page --> select Source
	 *  --> select Generate Constructor using Fields --> select All --> click on Generate*/
	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}
	// Step6: Generate Getter and Setter. -> r-click -> Source -> Generate Getter and Setter -> selectAll -> Generate
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setPriceAndProductName(int price, String productName) {
		this.price = price;
		this.productName = productName;
	}
	
	// Step7: here we are creating a list method to print a list of all products
	
	public List<String> GetProductList(){
		List<String> productList = new ArrayList<>();
		productList.add("Appe MacBook pro");
		productList.add("Appe MacBook Air");
		productList.add("Appe iPhone 12");
		return productList;
		
	// Step8: creating another implementaiton class called "Search"
	}
	
	
	
}
