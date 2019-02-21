package mobiletesing;

import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
 
public class StartApplication1 {				/*Customer app*///ZipGo Customer App will Open
	
// create global variable

private static AndroidDriver driver;


@Test
public void android() throws MalformedURLException, InterruptedException{
	System.out.println("ZipGo Customer App: Launched");
 
//public static void main(String[] args) throws MalformedURLException, InterruptedException 
//{
 
 
 // Create object of DesiredCapabilities class                             
 
DesiredCapabilities capabilities = new DesiredCapabilities();
 
 
 
// Optional
 
capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
 
 
// Specify the device name (any name)
 
capabilities.setCapability("deviceName", "emulator-5554");
 
 
// Platform version
 
//capabilities.setCapability("platformVersion", "6.0.0");
capabilities.setCapability("platformVersion", "4.4.2");
 
// platform name
 
capabilities.setCapability("platformName", "Android");
 
 
// specify the application package that we copied from appium  

System.out.println("Appium: pass");
 
capabilities.setCapability("appActivity","com.zipgo.customer"); //ZipGo Customer App will Open
//capabilities.setCapability("appPackage", "com.zipgo.bus");
//capabilities.setCapability("appPackage", "io.selendroid.testapp");
//capabilities.setCapability("appPackage", "com.whatsapp");


//com.zipgo.bus
System.out.println("App: pass");
 
 
// specify the application activity that we copied from appium                   
 
//capabilities.setCapability("appActivity", ".HomeScreenActivity");
//capabilities.setCapability("appActivity", "com.zipgo.bus.activities.StartingActivity");
//capabilities.setCapability("appActivity", "com.whatsapp.Main");
capabilities.setCapability("appActivity", "com.zipgo.customer.activities.TransactionsActivity"); 





//com.zipgo.bus.activities.StartingActivity
 System.out.println("select app: pass");
 
// Start android driver I used 4727 port by default it will be 4723
 
driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
 
 
 System.out.println("App launched: pass");
// Specify the implicit wait of 5 second
 
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 
 System.out.println("ok");
 
// Enter the text in textbox
 
 //driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']")).sendKeys("Prashant Selenium Appium");

//driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']")).sendKeys("Prashant Selenium Appium");
//io.selendroid.testapp:id/my_text_field
 //com.zipgo.bus:id/username
 
 System.out.println("6");
// click on registration button  
                                   
//driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();
//io.selendroid.testapp:id/startUserRegistration
//com.whatsapp:id/eula_accept
//driver.findElement(By.id("com.whatsapp:id/eula_accept")).click();

 
 System.out.println("condition accepted: pass");
 
// Wait for 10 second
 
Thread.sleep(10000);
 
//driver.findElement(By.xpath("//android.widget.EditText[@content='registration_phone']")).sendKeys("8892651530");

//com.whatsapp:id/registration_phone
 
 System.out.println("ok");
// close the application
 driver.quit();
 
 System.out.println("Done");

 
 
 
                }

}
