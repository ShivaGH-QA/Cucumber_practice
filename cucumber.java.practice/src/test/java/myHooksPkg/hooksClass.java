package myHooksPkg;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooksClass {
	
	@Before(order=1)
	public void setup_browser() {
		System.out.println("this is setup opening browser");
	}
	
	
	  @Before(order=2) public void launch_url() {
	  System.out.println("this is for launching url"); }
	  
	  @After(order=2) public void close() {
	  System.out.println("this is for closing broser"); }
	  
	  @After(order=1) public void logout() {
	  System.out.println("logout from application"); }
	 
	 
}
