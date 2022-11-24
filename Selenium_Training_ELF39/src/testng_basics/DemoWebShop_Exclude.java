package testng_basics;

import org.testng.annotations.Test;

public class DemoWebShop_Exclude {
	@Test
	public void Logout() {
		System.out.println("executing logout tc");
	}
	
	@Test
	public void Register() {
		System.out.println("executing register tc");
	}
	
	@Test
	public void Login() {
		System.out.println("executing login tc");
	}
	
	@Test
	public void Wishlist() {
		System.out.println("executing wishlist tc");
	}
	
	@Test
	
	public void Search() {
		System.out.println("executing search tc");
	}
}
