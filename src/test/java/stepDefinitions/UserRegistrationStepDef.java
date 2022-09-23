package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class UserRegistrationStepDef {

	@Given("User is registation page")
	public void user_is_registation_page() {
		System.out.println("user navigates on registration page");
	}

	/* the second step definition meant that the data comes in the form of 
	 * DataTable and this (.DataTable) comes from cucumber library*/
	/* inside parameter we see (io.cucumber.datatable.DataTable dataTable) 
	 * you can delete the (io.cucumber.datatable.) part and keep 
	 * ( DataTable dataTable) it will still work.*/
	// you can change (dataTable) to any name you want
	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
		// import DataTable from io.cucumber.datatable
		// here we want to do multiple registrations and the data come from our feature file
		// copy/write (dataTable) then type (.) and select (asList():List<List<String>>-DataTable)
		// inside the list parameter passying String type of list.
		// hover the asList method it says <Object> List<List<Object>>, it mean we are returning List of bojects
		// so we store {dataTable.asLists(String.class);} inside List of String type
		// import List from Java.util
		List<List<String>> userList = dataTable.asLists(String.class);
	    // now here we are creating a foreach loop to traverse the "userList"
		for (List<String> e : userList) {
			System.out.println(e);
		}
	}

	@When("User enters following user details with columns")
	public void user_enters_following_user_details_with_columns(DataTable dataTable) {
		// copy/write (dataTable) then type (.) and select (asMaps():List<Map<String ,String>>-DataTable)
		// inside the list parameter passying Key of String type and Value of String type.
		// hover the asList method it says <Object> List<Map<Object , Object>>, it mean we are returning Map of bojects
		// so we store {dataTable.asLists(String.class);} inside List of String type
		// import List from Java.util
		List <Map<String, String>> userList = dataTable.asMaps(String.class, String.class);
	    // now here we are creating a foreach loop to traverse the "userMap"	
		System.out.println(userList);
		
			System.out.println(userList.get(0).get("firstname"));
			System.out.println(userList.get(0).get("lastname"));
			System.out.println(userList.get(0).get("email"));
			System.out.println(userList.get(0).get("phone"));
			System.out.println(userList.get(0).get("city"));

		
		for (Map<String, String> map : userList) {
			System.out.println(map.get("firstname"));
			System.out.println(map.get("lastname"));
			System.out.println(map.get("email"));
			System.out.println(map.get("phone"));
			System.out.println(map.get("city"));

		}
	}
	@Then("User registration should be successful")
	public void user_registration_should_be_successful() {
	  System.out.println("user registration should be successful");
	}
}
