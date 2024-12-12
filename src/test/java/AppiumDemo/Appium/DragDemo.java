package AppiumDemo.Appium;

import org.openqa.selenium.By;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumBy;

public class DragDemo extends BaseTest{

	@Test
	public void DragGesture() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();;
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement source=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		
		
		((JavascriptExecutor)driver).executeScript("mobile: dragGesture",
				ImmutableMap.of(
					"elementId",((RemoteWebElement)source).getId(),
					"endX",619,
					"endY",560
						));
		
	}
	
}
