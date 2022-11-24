package testng_basics;

import org.testng.annotations.Test;

public class HelperMethods_DemoWebShop_Priority {
	@Test(priority=5)
	public void Logout() {
		System.out.println("executing logout tc");
	}
	
	@Test(priority = 1)
	public void Register() {
		System.out.println("executing register tc");
	}
	
	@Test(priority = 2)
	public void Login() {
		System.out.println("executing login tc");
	}
	
	@Test(priority = 4)
	public void Wishlist() {
		System.out.println("executing wishlist tc");
	}
	
	//@Test(dependsOnMethods = {"Register","Login"})
	@Test(priority = 3)
	public void Search() {
		System.out.println("executing search tc");
	}
}
