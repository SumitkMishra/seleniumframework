package Organisation;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import General_utility.BaseClass;
import General_utility.excel_utility;
import POM_Repo.Home_page;
import POM_Repo.OrganizationCreatepage;
public class createorganisation extends BaseClass {
@Test(retryAnalyzer=General_utility.RetryAnalyser.class)
	public  void Createorganisation() throws Throwable {
		// TODO Auto-generated method stub
/* Property_utility plib=new Property_utility();
	String url = plib.getkeyvalue("url");
	String usn = plib.getkeyvalue("username");
	String pwd = plib.getkeyvalue("password");*/
		//launching browser
		/*String key="webdriver.chrome.driver";
		String value="F:\\chromedriver\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();*/
		//random class to avoid duplicate
		Random rom=new Random();
		int ran = rom.nextInt();
		
		//fetching data from property file
		//FileInputStream fist=new FileInputStream("./src/test/resources/property_file.properties.txt");
		/*Properties pis=new Properties();
		pis.load(fist);
		String url=pis.getProperty("url");
		String usn=pis.getProperty("username");
		String pwd=pis.getProperty("password");*/
		
		//Login to Vtiger application
	/*	driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(usn);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();*/
		
         //click on organisation link
		Home_page home=new Home_page(driver);
		home.clickorganisation();
		//Assert.assertEquals(false, true);
		//driver.findElement(By.linkText("Organizations")).click();
		//click on img
		OrganizationCreatepage orc=new OrganizationCreatepage(driver);
		orc.clickonorganization();
		//driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
		excel_utility ex=new excel_utility();
		String orgname = ex.getexcelsheet("organisation", 0, 0)+ran;
		
		//fetching data from excel
		/*FileInputStream file=new FileInputStream("./src/test/resources/Excelfeb.xlsx");
		Workbook book=WorkbookFactory.create(file);
		Sheet sheetname=book.getSheet("organisation");
		Row Rownum=sheetname.getRow(0);
		Cell cellnum = Rownum.getCell(0);
		String orgname = cellnum.getStringCellValue()+ran;*/
		//add excel data
		orc.organizationname(orgname);
		//driver.findElement(By.name("accountname")).sendKeys(orgname);
		//save
		orc.save();
		//driver.findElement(By.name("button")).click();
		//Logout
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(text.contains(orgname)) {
			System.out.println("pass");
		}
		else { 
			System.out.println("fail");
		}
		//driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
		//driver.findElement(By.linkText("Sign Out")).click();
		//home.logout(driver);
	}

}
