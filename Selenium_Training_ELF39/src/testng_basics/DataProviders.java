package testng_basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	@DataProvider(name="Testdata")
	public Object[][] testdata() {
		Object[][] data=new Object[1][2];//creating an object
		data[0][0]="prathi";
		data[0][1]="reddy";
		return data;
	}
		
	@Test(dataProvider="TestData")
	public void testdatademo(String firstname,String lastname) {
		System.out.println(firstname);
		System.out.println(lastname);
	}
}
