package General_utility;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class webdriver_Utility {
	public void switchwindow(WebDriver driver,String Partialwintext) {
		 Set<String> allid = driver.getWindowHandles();
	        Iterator<String> it = allid.iterator();
	        while(it.hasNext()) {
	        	String wid = it.next();
	        	driver.switchTo().window(wid);
	        	String title = driver.getTitle();
	        	if(title.contains(Partialwintext)) {
	        		break;
	        	}
	}


	}
	public void movetoelement(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
}
