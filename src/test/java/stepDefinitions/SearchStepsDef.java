package stepDefinitions;

import org.junit.Assert;

import amazonImplementation.Product;
import amazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepsDef {

	// Step2: we are creating a class variable 
	Product product; // for this we need to create a implementation class called "Product"
	Search search; // for this we need to create a implementation class called "Search"
    @Given("I have a search field on Amazon Page")
    public void i_have_a_search_field_on_amazon_page() {
    	System.out.println("Step1: I am on search page");
    }

    @When("I search for a product with name {string} and price {int}")
    public void i_search_for_a_product_with_name_and_price(String productName, Integer price)  {
    	System.out.println("Step2: Search the product with name: "+ productName + "price: " +price);

    // Step3: creating an object of Product Variable and pass our ProductName and Price.
    	
    	product = new Product(productName, price); // import from amazonImplemenation
    /* in order to implement our class variable and variable object with need to create a package call 
     * "amazonImplementation" and an implementation class called "Product" under src/main/java*/
    }

    @Then("Product with name {string} should be displayed")
    public void product_with_name_should_be_displayed(String productName) {
    	System.out.println("Step3: product " + productName + "is displayed");
    	search = new Search();
    	String name = search.displayProduct(product);
    	System.out.println("searched product is: " + name);
    	Assert.assertEquals(product.getProductName(), name);
    }
    
    @Then("Order id is {int} and user name is {string}")
    public void order_id_is_and_user_name_is(Integer int1, String string) {
       
    }
}
