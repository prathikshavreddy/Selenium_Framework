package testng_basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders_2D_DataParameterisation {
	@DataProvider(name="Testdata")
	public Object[][] testdata() {
		Object[][] data=new Object[5][2];//creating an object
		data[0][0]="prathi";
		data[0][1]="reddy";
		
		data[1][0]="pavi";
		data[1][1]="reddy";
		
		data[2][0]="heena";
		data[2][1]="mehak";
		
		data[3][0]="ammu";
		data[3][1]="shastry";
		
		data[4][0]="chandu";
		data[4][1]="reddy";
		
		return data;
	}
		
	@Test(dataProvider="Testdata")
	public void testdatademo(String firstname,String lastname) {
		System.out.println(firstname);
		System.out.println(lastname);
	}
}
