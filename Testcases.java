package frame;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Testcases extends capabilities5{
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void ride() throws IOException, InterruptedException {
		System.out.println("shivam");
	}
	
	@Test
	public void	login() throws IOException, InterruptedException {
		service=startserver();
		driver=capabilities3(deviceName,appActivity,appPackage,platformName,chromeDriver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"ENGLISH\")")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/textView_selectedCountry")).click();
		Thread.sleep(2000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"+91"+ "\"))").click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/edtMobileNumber")).sendKeys("9044442439");
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imgNext")).click();
		Thread.sleep(6000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imgNext\r\n"+ "")).click();
		driver.findElements(By.xpath("//*[@text='']")).get(0).click();
	}

}
