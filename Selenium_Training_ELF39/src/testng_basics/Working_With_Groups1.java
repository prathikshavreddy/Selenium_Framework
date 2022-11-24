package testng_basics;

import org.testng.annotations.Test;

public class Working_With_Groups1 {
	@Test
	public void Logout() {
		System.out.println("executing logout tc");
	}
	
	@Test(groups = "SmokeTest")
	public void Register() {
		System.out.println("executing register tc");
	}
	
	@Test(groups = "SmokeTest")
	public void Login() {
		System.out.println("executing login tc");
	}
	
	
	@Test
	public void Search() {
		System.out.println("executing search tc");
	}
}
