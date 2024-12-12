package AppiumDemo.Appium;

import org.openqa.selenium.By;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumBy;

public class ScrollDemo extends BaseTest{

	@Test
	public void ScrollDemoTest() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();;
		
		//if element is known prior
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		
		//if not
		scrollToEnd();
		
		
	}
	
}
