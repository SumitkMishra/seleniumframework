package Practice;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		//String key="webdriver.chrome.driver";
		//String value="F:\\chromedriver\\chromedriver.exe";
		//System.setProperty(key, value);
		//WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		
		//fetching data from property file
		FileInputStream fist=new FileInputStream("./src/test/resources/property_file.properties.txt");
		Properties pis=new Properties();
		pis.load(fist);
		String url=pis.getProperty("url");
		String usn=pis.getProperty("username");
		String pwd=pis.getProperty("password");
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(usn);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();
		
          //fetching data from excel
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
		FileInputStream file=new FileInputStream("./src/test/resources/Excelfeb.xlsx");
		Workbook book=WorkbookFactory.create(file);
		Sheet sheetname=book.getSheet("organisation");
		Row Rownum=sheetname.getRow(0);
		Cell cellnum = Rownum.getCell(0);
		String orgname = cellnum.getStringCellValue();
		driver.findElement(By.name("accountname")).sendKeys(orgname);
	}

	private static Object chromedriver() {
		// TODO Auto-generated method stub
		return null;
	}

}
