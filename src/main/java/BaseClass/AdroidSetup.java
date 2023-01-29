package BaseClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AdroidSetup {
	
	protected static WebDriver driver;

    
    public static void setUp() throws MalformedURLException, InterruptedException{
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("platformVersion", "4.4.2");
    capabilities.setCapability("platformName","Android");
    capabilities.setCapability("deviceName", "AndroidTest");
    capabilities.setCapability("apkPackage","com.androidsample.generalstore");
    capabilities.setCapability("apkActivity","com.androidsample.generalstore.MainActivity");
    
    driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    Thread.sleep(500);
    System.out.println("Application Opened Successfully");
    
         }
}
