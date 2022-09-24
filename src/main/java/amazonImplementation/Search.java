package amazonImplementation;

public class Search {

	//Step9: create a method called "displayProduct" passin the object of Product class in the constructor
	
public String displayProduct(Product product) {
	if(product.GetProductList().contains(product.getProductName())){
		return product.getProductName();
	}
	return null;

	/*Step10: TestRuuner.java class -> under src/test/java create a package called "runner" then under this
	 * package create a class called "TestRunner"*/ 
	
}
public void MyCoffeeShop() {
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("***************************");
	System.out.println("*****************************");
	System.out.println("***********************************");
}
public void MyTeaShop() {
	System.out.println();
	System.out.println("99999999999999999999999");
	System.out.println("888888888888888888888888");
	System.out.println("99999999999999999999999");
	System.out.println("888888888888888888888888");

}
}
