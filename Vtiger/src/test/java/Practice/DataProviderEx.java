package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
@Test(dataProvider="dataprovider_booktickets")
	public  void booktickets(String src,String des) {
System.out.println("book ticket from "+src+" to "+des+"");
	}
	@DataProvider
	public Object[][] dataprovider_booktickets()
	{
		Object[][] obj=new Object[5][2];
		
		obj[0][0]="bangalore";
		obj[0][1]="mysore";
		obj[1][0]="odisha";
		obj[1][1]="sambalpur";
		obj[2][0]="Madhya pradesh";
		obj[2][1]="bhopal";
		obj[3][0]="chattisgarh";
		obj[3][1]="raipur";
		obj[4][0]="delhi";
		obj[4][1]="mumbai";
		return obj;
	}

}
