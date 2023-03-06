package Practice;

import org.testng.annotations.Test;

import General_utility.excel_utility;

public class DataProvider {
	@Test(dataProvider="getdata")
	public void readdata(String src,String dst) {
		System.out.println(src+"....."+dst);
	}
	@org.testng.annotations.DataProvider
public Object[][] getdata() throws Throwable{
	excel_utility e=new excel_utility();
	Object[][] value = e.readdata("Getdata");
	return value;
}
}
