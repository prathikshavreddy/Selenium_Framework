package testng_basics;

import org.testng.annotations.Test;

public class HelperMethods_DemoWebShop {
	
	@Test(dependsOnMethods = "Wishlist")
	public void Logout() {
		System.out.println("executing logout tc");
	}
	
	@Test
	public void Register() {
		System.out.println("executing register tc");
	}
	
	@Test(dependsOnMethods = "Register")
	public void Login() {
		System.out.println("executing login tc");
	}
	
	@Test(dependsOnMethods = "Search")
	public void Wishlist() {
		System.out.println("executing wishlist tc");
	}
	
	//@Test(dependsOnMethods = {"Register","Login"})
	@Test(dependsOnMethods = "Register")
	public void Search() {
		System.out.println("executing search tc");
	}
		
}
