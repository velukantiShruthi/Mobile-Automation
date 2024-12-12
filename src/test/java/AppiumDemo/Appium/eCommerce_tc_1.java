package AppiumDemo.Appium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.functions.ExpectedCondition;

public class eCommerce_tc_1 extends BaseTest{

	@Test
	public void fillForm() {
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.androidsample.generalstore:id/nameField']")).sendKeys("Shruthi");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		
		//Toast error message
		//android.widget.Toast - default path
		//String toastMsg=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		//Assert.assertEquals(toastMsg, "Please enter your name");
		
		
		//Shop products
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"))"));
		int prodCount=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		
		for(int i=0;i<prodCount;i++) {
			String prodName=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			if(prodName.equals("Jordan 6 Rings"))
				driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
			
		}
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
		String cardpageProduct=driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
		Assert.assertEquals(cardpageProduct, "Jordan 6 Rings");
		
	}
}
