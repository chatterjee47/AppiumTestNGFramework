package TestCase;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import BaseClass.AdroidSetup;
import io.appium.java_client.AppiumBy;

public class ValidateForm extends AdroidSetup {
	
	@Test
	public void FillForm_ErrorValidation() throws InterruptedException, MalformedURLException
	{
		AdroidSetup.setUp();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		String toastMessage = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		AssertJUnit.assertEquals(toastMessage,"Please your name");		
	}
}
