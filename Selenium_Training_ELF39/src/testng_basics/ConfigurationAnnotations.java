package testng_basics;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
	@BeforeMethod
	public void beforemethod() {
		System.out.println("executing before method");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("executing after method");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("executing before class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("executing after class");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("executing before test");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("executing after test");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("executing before suite");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("executing after suite");
	}
	
	//before executing this method,we will get "executing before test","welcome to testyantra","executing after test"
	@Test
	public void Testyantra() {
		System.out.println("welcome to testyantra");
	}
	
	//before executing this method,we will get "executing before test","welcome to infosys","executing after test"
	@Test
	public void Infosys() {
		System.out.println("welcome to infosys");
	}
	
	
}
