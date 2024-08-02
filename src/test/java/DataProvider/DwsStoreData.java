package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DwsStoreData {
	@DataProvider name = "data")
	
	public Object[][] sender(){
		Object[][] obj = new Object[2][2];
		obj[0][0]="Suraj";
		obj[0][1]="Kunal";
		obj[1][0]="Prasad";
		obj[1][1]="Rishabh";
		
		return obj;
	} 
	@Test(dataProvider = "data")
	
	public void reciver(String data1,String data2) {
		System.out.println(data1);
		System.out.println(data2);
	}

}
