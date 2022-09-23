//package myHooks;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//
//public class AmazonHooks {
//
//	// Step 10. create two simple methods with @Before. 
//	// here once you type @Bef --> then press Ctrl+Space and choose @Berfore with io.Cucumber.java.Before
//	@Before (order=1)
//	public void setup_browser() {
//		System.out.println("launch amazon application");
//	}
//	
//	@Before (order=2)
//	public void setup_url() {
//		System.out.println("launch amazon application");
//	}
//	
//	@After (order=2)
//	public void tearDown_close() { // import from io.Cucumber library
//		System.out.println("close the browser");
//	}
//	
//	@After (order=1)
//	public void tearDown_logout() { // import from io.Cucumber library
//		System.out.println("close the browser");
//	}
//	// Step 11. go back to "SearchStepsDef" class.
//}
