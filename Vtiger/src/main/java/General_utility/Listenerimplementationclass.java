package General_utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

@SuppressWarnings("deprecation")
public class Listenerimplementationclass implements ITestListener {

	public void onTestFailure(ITestResult result) {
		String testdata = result.getMethod().getMethodName();
		System.out.println("....execute....");
		
		EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.sdriver);
		File src=edriver.getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(src,new File("./screenshot"+testdata+".png"));
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	

    }
}
