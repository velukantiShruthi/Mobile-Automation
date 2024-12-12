package AppiumDemo.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumBy;

public class LongPressGesture extends BaseTest{

	@Test
	public void LongPress() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();;
		driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		
		WebElement ele=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		//Longpress
		longPressAction(ele);
		String menuText=driver.findElement(By.id("android:id/title")).getText();
		Assert.assertEquals("Sample menu", menuText);
		
		Thread.sleep(2000);
	}
	
}
