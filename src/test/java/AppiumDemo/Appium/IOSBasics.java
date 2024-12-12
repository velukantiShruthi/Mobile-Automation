package AppiumDemo.Appium;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class IOSBasics extends IOSBaseTest{
	
	@Test
	public void IOSBasicsTest() {
		driver.findElement(AppiumBy.accessibilityId("Alert Views")).click();
		
	}

}
