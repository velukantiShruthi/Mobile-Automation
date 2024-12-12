package AppiumDemo.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class MobileBrowserBaseTest {
	

	public static AndroidDriver driver;
	public static AppiumDriverLocalService service;
	
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException, URISyntaxException{
		service= new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("Mobile");
		//options.setApp("//Users//shruthivelukanti//eclipse-workspace//Appium//src//test//java//resources//ApiDemos-debug.apk");
		
		//options.setChromedriverExecutable("//Users//shruthivelukanti//eclipse-workspace//Appium//src//test//java//resources//chromedriver-mac-arm64_v124.0.6367.207");
		options.setCapability("browserName", "Chrome");
		
		//Create object of platform using android or IOS with server and capabilities arguments
		driver=new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}

	public Double getFormattedAmount(String amount)
	{
		Double price = Double.parseDouble(amount.substring(1));
		return price;
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();	
		service.stop();	
	}

}
