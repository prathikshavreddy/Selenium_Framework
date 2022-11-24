package testng_basics;

import org.testng.annotations.Test;

public class Working_With_Groups2 {
	@Test
	public void Wishlist() {
		System.out.println("executing wishlist tc");
	}
	
	@Test(groups = "SmokeTest")
	public void AddToCart() {
		System.out.println("executing add to cart tc");
	}
	
	@Test
	public void AdvanceSearch() {
		System.out.println("executing advance search tc");
	}
	
}
