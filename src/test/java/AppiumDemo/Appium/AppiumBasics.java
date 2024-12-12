package AppiumDemo.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics extends BaseTest{

	@Test
	public void WifiSettingsName() throws URISyntaxException, MalformedURLException{
		
		//code
		//xpath, id, acccessibilityId, classname, androidUIAutomator
		//AppiumBy - extra accessibilityId, androidUIAutomator
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		//set wifi name
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
		driver.findElement(By.id("android:id/edit")).sendKeys("WifiName");
		
		
	}
}