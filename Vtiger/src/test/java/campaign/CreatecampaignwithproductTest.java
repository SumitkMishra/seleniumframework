package campaign;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import General_utility.excel_utility;
import General_utility.webdriver_Utility;

public class CreatecampaignwithproductTest {
     @Test
	public void createcampaignwithproductTest() throws Throwable {
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
		
		excel_utility exe=new excel_utility();
		String productname = exe.getexcelsheet("Product", 0, 0)+rum;
		/*FileInputStream fip=new FileInputStream("./src/test/resources/Excelfeb.xlsx");
        Workbook wb=WorkbookFactory.create(fip);
        Sheet sheetname = wb.getSheet("Product");
        Row rowname = sheetname.getRow(0);
        Cell cellname = rowname.getCell(0); 
        String productname = cellname.getStringCellValue()+rum;*/
      
        driver.findElement(By.name("productname")).sendKeys(productname);
        driver.findElement(By.name("button")).click();
        WebElement more = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/menuDnArrow.gif\"]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(more).perform();
		WebElement campaign = driver.findElement(By.name("Campaigns"));
		campaign.click();
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
		Random rom1=new Random();
		int rum1 = rom1.nextInt(1000);
			
		FileInputStream fip1=new FileInputStream("./src/test/resources/Excelfeb.xlsx");
        Workbook wb1=WorkbookFactory.create(fip1);
        Sheet sheetname1 = wb1.getSheet("campaign");
        Row rowname1 = sheetname1.getRow(0);
        Cell cellname1 = rowname1.getCell(0);
        String campaignname = cellname1.getStringCellValue()+rum1;
        
        driver.findElement(By.name("campaignname")).sendKeys(campaignname);
        driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
        webdriver_Utility webu=new webdriver_Utility();
        webu.switchwindow(driver, "Products&action");
       /* Set<String> allid = driver.getWindowHandles();
        Iterator<String> it = allid.iterator();
        while(it.hasNext()) {
        	String wid = it.next();
        	driver.switchTo().window(wid);
        	String title = driver.getTitle();
        	if(title.contains("Products&action")) {
        		break;
        	}
        }*/
        driver.findElement(By.name("search_text")).sendKeys(productname);
        driver.findElement(By.name("search")).click();
        driver.findElement(By.xpath("//a[text()='"+productname+"']")).click();
        webu.switchwindow(driver,"Campaigns&action" );
       /* Set<String> allid1 = driver.getWindowHandles();
        Iterator<String> it1 = allid1.iterator();
        while(it1.hasNext()) {
        	String wid1 = it1.next();
        	driver.switchTo().window(wid1);
        	String title1 = driver.getTitle();
        	if(title1.contains("Campaigns&action")) {
        		break;
        	}
        }*/
        driver.findElement(By.name("button")).click();
        WebElement move = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
        Actions a=new Actions(driver);
        a.moveToElement(move).perform();
        driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
        driver.close();
        

	}

}
