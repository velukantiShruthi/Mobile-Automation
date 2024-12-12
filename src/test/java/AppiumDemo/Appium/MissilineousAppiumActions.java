package AppiumDemo.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class MissilineousAppiumActions extends BaseTest{

	@Test
	public void Miscellanous() throws URISyntaxException, MalformedURLException{
		
		
		
		
		
		//code
		//xpath, id, acccessibilityId, classname, androidUIAutomator
		//AppiumBy - extra accessibilityId, androidUIAutomator
		
		/*
		 //adb shell dumpsys window | grep -E 'mCurrentFocus'  - MAC
		// adb shell dumpsys window | find "mCurrentFocus"  - Windows

		//App Package & App Activity
		
		Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
		driver.startActivity(activity);
		startActivity changed to javascriptexecutor
		 */
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		//set wifi name
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		
		//Landscape
		DeviceRotation landscape = new DeviceRotation(0,0,90);
		driver.rotate(landscape);
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
		//App copy and paste clipboard
		driver.setClipboardText("WifiName");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		//driver.pressKey(new KeyEvent(AndroidKey.ENTER));

		
		
		
		
		
		
	}
}