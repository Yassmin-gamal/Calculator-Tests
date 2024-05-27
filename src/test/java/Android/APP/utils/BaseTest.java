package Android.APP.utils;
 
 

 import Android.APP.Pages.CalculatorPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
	protected AndroidDriver<MobileElement> driver;
 
	protected CalculatorPage calculatorPage;
    
    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "SM A145F"); 
        caps.setCapability(MobileCapabilityType.UDID, "RK8W5048BXB");
        caps.setCapability( MobileCapabilityType.PLATFORM_VERSION, "13.0");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        
        caps.setCapability("appPackage","com.sec.android.app.popupcalculator");
	    caps.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
         
        System.out.println("System Started......");

        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
 
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Driver initialized: " + (driver != null));
        
         calculatorPage = new CalculatorPage(driver);
        System.out.println("CalculatorPage initialized: " + (calculatorPage != null));
        
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
