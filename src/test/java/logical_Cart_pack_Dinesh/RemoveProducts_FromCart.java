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

public class RemoveProducts_FromCart {
public static WebDriver driver;
    
    @BeforeTest
    public void basic() throws InterruptedException {
    	//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        //driver = new ChromeDriver();
    	
    	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
        driver = new FirefoxDriver();


        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String url = "https://cart.logicalmindsitsolutions.com/";
        driver.get(url);
    }

    @Test(priority = 1)
    public void Login() throws InterruptedException {
        WebElement loginButton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/a[1]/p[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(loginButton).click().perform();

        driver.findElement(By.name("email")).sendKeys("Kumar@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Azxc56");

        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/button[1]")).click();
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 800)");

        Thread.sleep(7000);
    }

    
    @Test(priority = 2)
	public void RemoveProducts_From_Cart() throws InterruptedException {
	 
	 System.out.println("------ RemoveProducts_FromCart STARTED ---------");
	 
	 
	 
	 WebElement Cart_Button = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p"));
     Cart_Button.click();
	    Thread.sleep(10000);
	 
	  // Removing Particular Product
	 
	
	 
	 
	 
	 WebElement GreenPeas = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div/div[6]/div/div[2]/button"));
	 GreenPeas.click();
	 GreenPeas.click();
	 GreenPeas.click();
     Thread.sleep(4000);
     
     WebElement Mushroom_Button = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div/div[8]/div/div[2]/button"));
     Mushroom_Button.click();
     Mushroom_Button.click();
     Mushroom_Button.click();
     Thread.sleep(4000);
     
   
      WebElement Tender_Coconut  = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div/div[9]/div/div[2]/button"));
      Tender_Coconut.click();     
      Tender_Coconut.click();
      Tender_Coconut.click();
	  Thread.sleep(4000);
	
	  
      driver.navigate().back();
     Thread.sleep(4000);
     
     WebElement Cart_Button1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p"));
     Cart_Button1.click();
	    Thread.sleep(5000);
	    
	    
	    
	    
	  // Getting text from the specified x path
	    String text28 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]")).getText();
	    System.out.println("Text from specified xpath: " + text28);
	    Thread.sleep(7000);

	    driver.navigate().back();
     
	 System.out.println("------ RemoveProducts_FromCart COMPLETED ---------");
   	 Thread.sleep(8000);
     	
	 
	 
 }
    
    
    
    
	@AfterTest
    public void tearDown() {
    	
            driver.quit();
        
    }
    
    
}
