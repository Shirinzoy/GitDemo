package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.*;

public class BillingStepDef {
	double billingAmount;
	double taxAmount;
	double finalAmount;
	
	@Given("usr is on billing page")
	public void usr_is_on_billing_page() {
	 
	}

	@When("usr enters billing amount {string}")
	public void usr_enters_billing_amount(String billingAmount) {
		// her we convert String to Double value
		this.billingAmount = Double.parseDouble(billingAmount);
	}

	@When("user enters tax amount {string}")
	public void user_enters_tax_amount(String taxAmount) {
		this.taxAmount = Double.parseDouble(taxAmount);
	}

	@When("user clicks on calculate button")
	public void user_clicks_on_calculate_button() {

	}

	@Then("it gives the final amount {string}")
	public void it_gives_the_final_amount(String expectedFinalAmount) {
		this.finalAmount = this.billingAmount + this.taxAmount;
		System.out.println("expect final amount: " + Double.parseDouble(expectedFinalAmount));
		System.out.println("actual final amount: " + this.finalAmount);
		
		Assert.assertTrue(this.finalAmount == Double.parseDouble(expectedFinalAmount));
	}

}
