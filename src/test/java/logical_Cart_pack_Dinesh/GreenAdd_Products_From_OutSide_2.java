package logical_Cart_pack_Dinesh;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GreenAdd_Products_From_OutSide_2 {
public static WebDriver driver;
    
@BeforeTest
public void basic() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    String url = "https://cart.logicalmindsitsolutions.com/";
    driver.get(url);
}

@Test(priority = 1)
public void Login() throws InterruptedException {
    WebElement loginButton = driver.findElement(By.xpath("//body//div[@id='root']//div[@class='css-0']//div[@class='css-0']//button[1]"));
    Actions actions = new Actions(driver);
    actions.moveToElement(loginButton).click().perform();

    driver.findElement(By.name("email")).sendKeys("Kumar@gmail.com");
    driver.findElement(By.name("password")).sendKeys("Azxc56");

    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/button[1]")).click();
    Thread.sleep(3000);

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 1000)");

    Thread.sleep(7000);
}


    
    
    
 @Test(priority = 2)
 	public void Greens_addProductsTest_OutSide_2() throws InterruptedException {
	 
	 System.out.println("------ addProductsTest_OutSide_2 Started ---------");
 		
     	
     	
     	// Curry Leaves -1
	 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[1]/a/div/div/div/div/button")).click();
	  	Thread.sleep(5000);
     	 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
  	    Thread.sleep(3000);
  	   driver.navigate().back();
    	
  	    
     	// Drum_stick Leaves -2
  	 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[2]/a/div/div/div/div/button")).click();
   	Thread.sleep(3000);
     	 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    
   	    driver.navigate().back();
     	
     	// Garlic -3
   	 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[3]/a/div/div/div/div/button")).click();
   	Thread.sleep(3000);
     	 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    driver.navigate().back();
     	
     	// Ginger -4 
   	 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[4]/a/div/div/div/div/button")).click();
   	Thread.sleep(3000);
     	 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    driver.navigate().back();
   	    
   	    
     	// Gon_gura Leaves -5
   	 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[5]/a/div/div/div/div/button")).click();
   	Thread.sleep(3000);
     	 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    driver.navigate().back();
     	
     	// Green Peas -6
   	 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[6]/a/div/div/div/div/button")).click();
   	Thread.sleep(3000);
     	 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	   driver.navigate().back();
     	
     	
     	// Lemon -7
   	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[7]/a/div/div/div/div/button")).click();
  	Thread.sleep(3000);
     	 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    driver.navigate().back();
   	    
     	
     	
     	// Mint Leaves-8
   	 clickRightButtonMultipleTimes(7);
 	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[8]/a/div/div/div/div/button")).click();
  	Thread.sleep(2000);
     	 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	   driver.navigate().back();
     	
     	
     	// Mushroom Button -9
   	clickRightButtonMultipleTimes(7);
   	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[9]/a/div/div/div/div/button")).click();
  	Thread.sleep(5000);
     	 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    driver.navigate().back();
     	
     	// Tomato -10
   	 clickRightButtonMultipleTimes(7);
   	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[10]/a/div/div/div/div/button")).click();
  	Thread.sleep(3000);
     	 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	   driver.navigate().back();
   	    
     	// Tender Coconut -11
   	clickRightButtonMultipleTimes(7);
   	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[11]/a/div/div/div/div/button")).click();
  	Thread.sleep(3000);
     	 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    driver.navigate().back();
     	
     	//  Red Spinach-12
   	 clickRightButtonMultipleTimes(7);
   	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[12]/a/div/div/div/div/button")).click();
  	Thread.sleep(3000);
     	 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    driver.navigate().back();
     	
     	// Onion -13
   	 clickRightButtonMultipleTimes(7);
   	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[13]/a/div/div/div/div/button")).click();
  	Thread.sleep(3000);
     	 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    driver.navigate().back();
     	
     	// Bri_njal -14
   	 clickRightButtonMultipleTimes(7);
   	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[14]/a/div/div/div/div/button")).click();
  	Thread.sleep(3000);
     	 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	 driver.navigate().back();
   	    
   	 WebElement Cart_Button = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p"));
     Cart_Button.click();
	    Thread.sleep(3000);
   	    
   	    
   	  // Getting text from the specified x path
   	    String text28 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]")).getText();
   	    System.out.println("Text from specified xpath: " + text28);
   	    Thread.sleep(5000);
        driver.navigate().back();
     	
   	    
   	 
	    
	    
	    
	    
	    System.out.println("------ addProductsTest_OutSide_2 COMPLETED ---------");
	    Thread.sleep(8000);
     	
     	
    }
 
 
 private void clickRightButtonMultipleTimes(int count) throws InterruptedException {
     for (int i = 0; i < count; i++) {
         WebElement right_click = driver.findElement(By.xpath("//div[contains(@class,'css-1d9rhbz')]//button[contains(@aria-label,'Go to next slide')]"));
         right_click.click();
         Thread.sleep(2000);
     }
	}
 
 
 
@AfterTest
 public void tearDown() {
 	
         driver.quit();
     
 }
 
 
 
}

























