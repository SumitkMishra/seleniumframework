package Product;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createanddeleteproduct {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="F:\\chromedriver/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream fis=new FileInputStream("./src/test/resources/property_file.properties.txt");
		Properties pro=new Properties();
		pro.load(fis);
		String url=pro.getProperty("url");
		String pwd=pro.getProperty("password");
		String usn=pro.getProperty("username");
		
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(usn);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
		
		Random rom=new Random();
		int rum = rom.nextInt(1000);
		
		FileInputStream fip=new FileInputStream("./src/test/resources/Excelfeb.xlsx");
        Workbook wb=WorkbookFactory.create(fip);
        Sheet sheetname = wb.getSheet("Product");
        Row rowname = sheetname.getRow(0);
        Cell cellname = rowname.getCell(0);
        String productname = cellname.getStringCellValue()+rum;
      
        driver.findElement(By.name("productname")).sendKeys(productname);
        driver.findElement(By.name("button")).click();
         Thread.sleep(5000);
         driver.findElement(By.name("Delete")).click();
         Alert a1 = driver.switchTo().alert(); 
         System.out.println(a1.getText());
         a1.accept();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
         driver.findElement(By.linkText("Sign Out")).click();
	}

}
