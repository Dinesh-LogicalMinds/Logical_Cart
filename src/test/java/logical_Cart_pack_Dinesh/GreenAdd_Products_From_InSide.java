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

public class GreenAdd_Products_From_InSide {
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

        driver.findElement(By.name("email")).sendKeys("Jeevan@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Asdfg@344");

        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/button[1]")).click();
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)");

        Thread.sleep(7000);
    }
    
    
    @Test(priority = 2)
   	public void Greens_addProducts_Test_1_Inside() throws InterruptedException {
    	System.out.println("------ addProductsTest_1 Started ---------");
   		
           
       	 
       	 
       	
       	
       	// Curry Leaves -1
       	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]/div[1]/div[1]/p[1]")).click();
       	Thread.sleep(3000);          
       	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/button/div/p")).click();
       	Thread.sleep(3000);
       	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
       	Thread.sleep(3000);
       	// Getting text from the specified xpath
       	String text1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]")).getText();
       	System.out.println("Text from specified xpath: " + text1);
       	 Thread.sleep(2000);
       	 driver.navigate().back();
       	 driver.navigate().back();
       	 
       	 
       // Drum stick Leaves -2
   	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[2]/a/div/div/div/p[1]")).click();
   	    Thread.sleep(3000);
   	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/button/div/p")).click();
   	    Thread.sleep(3000);
   	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    // Getting text from the specified xpath
   	    String text2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]")).getText();
   	    System.out.println("Text from specified xpath: " + text2);
   	    Thread.sleep(2000);
   	    driver.navigate().back();
   	    driver.navigate().back();
   	    
   	    
   	 // Garlic -3
       	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[3]/a/div/div/div/p[1]")).click();
       	Thread.sleep(3000); 
       	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/button/div/p")).click();
   	    Thread.sleep(3000);
   	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(5000);
   	    // Getting text from the specified xpath
   	    String text3 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]")).getText();
   	    System.out.println("Text from specified xpath: " + text3);
   	    Thread.sleep(2000);
   	    driver.navigate().back();
   	    driver.navigate().back();
   	    
   	    
   	 // Ginger -4 
       	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[4]/a/div/div/div/p[1]")).click();
       	Thread.sleep(3000);          
       	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/button/div/p")).click();
   	    Thread.sleep(3000);
   	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    // Getting text from the specified xpath
   	    String text4 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]")).getText();
   	    System.out.println("Text from specified xpath: " + text4);
   	    Thread.sleep(2000);
   	    driver.navigate().back();
   	    driver.navigate().back();
       	
       	// Gon_gura Leaves -5
       	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[5]/a/div/div/div/p[1]")).click();
       	Thread.sleep(3000);          
       	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/button/div/p")).click();
   	    Thread.sleep(3000);
   	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    // Getting text from the specified xpath
   	    String text5 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]")).getText();
   	    System.out.println("Text from specified xpath: " + text5);
   	    Thread.sleep(2000);
   	    driver.navigate().back();
   	    driver.navigate().back();
       	
       	
       	// Green Peas -6
       	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[6]/a/div/div/div/p[1]")).click();
       	Thread.sleep(3000);
       	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/button/div/p")).click();
   	    Thread.sleep(3000);
   	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    // Getting text from the specified xpath
   	    String text6 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]")).getText();
   	    System.out.println("Text from specified xpath: " + text6);
   	    Thread.sleep(2000);
   	    driver.navigate().back();
   	    driver.navigate().back();
       	
       	
       	
       	// Lemon -7
       	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[7]/a/div/div/div/p[1]")).click();
       	Thread.sleep(3000);
       	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/button/div/p")).click();
   	    Thread.sleep(3000);
   	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    // Getting text from the specified xpath
   	    String text7 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]")).getText();
   	    System.out.println("Text from specified xpath: " + text7);
   	    Thread.sleep(2000);
   	    driver.navigate().back();
   	    driver.navigate().back();
   	    
       	
   	 
  	
   	    
   	 // Mint Leaves-8
   	    clickRightButtonMultipleTimes(7);
       	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[8]/a/div/div/div/p[1]")).click();
       	Thread.sleep(3000);    
       	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/button/div/p")).click();
   	    Thread.sleep(3000);
   	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    // Getting text from the specified xpath
   	    String text8 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]")).getText();
   	    System.out.println("Text from specified xpath: " + text8);
   	    Thread.sleep(2000);
   	    driver.navigate().back();
   	    driver.navigate().back();
   	    
       	// Mushroom Button -9
   	 clickRightButtonMultipleTimes(7);
       	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[9]/a/div/div/div/p[1]")).click();
       	Thread.sleep(3000);          
       	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/button/div/p")).click();
   	    Thread.sleep(3000);
   	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    // Getting text from the specified x_path
   	    String text9 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]")).getText();
   	    System.out.println("Text from specified xpath: " + text9);
   	    Thread.sleep(2000);
   	    driver.navigate().back();
   	    driver.navigate().back();
       	
       	// Onion -10
   	 clickRightButtonMultipleTimes(7);
       	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[10]/a/div/div/div/p[1]")).click();
       	Thread.sleep(3000);          
       	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/button/div/p")).click();
   	    Thread.sleep(3000);
   	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    // Getting text from the specified xpath
   	    String text10 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]")).getText();
   	    System.out.println("Text from specified xpath: " + text10);
   	    Thread.sleep(2000);
   	    driver.navigate().back();
   	    driver.navigate().back();
       	
       	// Red Spinach -11
   	 clickRightButtonMultipleTimes(7);
       	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[11]/a/div/div/div/p[1]")).click();
       	Thread.sleep(3000);          
       	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/button/div/p")).click();
   	    Thread.sleep(3000);
   	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    // Getting text from the specified xpath
   	    String text11 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]")).getText();
   	    System.out.println("Text from specified xpath: " + text11);
   	    Thread.sleep(2000);
   	    driver.navigate().back();
   	    driver.navigate().back();
       	
       	// Tender Coconut -12
   	 clickRightButtonMultipleTimes(7);
       	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[12]/a/div/div/div/p[1]")).click();
       	Thread.sleep(3000);          
       	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/button/div/p")).click();
   	    Thread.sleep(3000);
   	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    // Getting text from the specified xpath
   	    String text12 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]")).getText();
   	    System.out.println("Text from specified xpath: " + text12);
   	    Thread.sleep(2000);
   	    driver.navigate().back();
   	    driver.navigate().back();
       	
       	// Tomato -13
   	 clickRightButtonMultipleTimes(7);
       	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[13]/a/div/div/div/p[1]")).click();
       	Thread.sleep(3000);          
       	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/button/div/p")).click();
   	    Thread.sleep(3000);
   	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    // Getting text from the specified xpath
   	    String text13 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]")).getText();
   	    System.out.println("Text from specified xpath: " + text13);
   	    Thread.sleep(2000);
   	    driver.navigate().back();
   	    driver.navigate().back();
   	    
       	
       	
       	
       	// Bri_njal -14
   	 clickRightButtonMultipleTimes(7);
       	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul/li[14]/a/div/div/div/p[1]")).click();
       	Thread.sleep(3000);          
       	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/button/div/p")).click();
   	    Thread.sleep(3000);
   	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/button[3]/p")).click();
   	    Thread.sleep(3000);
   	    // Getting text from the specified xpath
   	    String text14 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]")).getText();
   	    System.out.println("Text from specified xpath: " + text14);
   	    Thread.sleep(2000);
   	    driver.navigate().back();
   	    driver.navigate().back();
        	
   	    	 
   	    System.out.println("----- COMPLETED -----");
   	 System.out.println("------ addProductsTest_1 Completed ---------");
   	 Thread.sleep(2000);
        	 
   
       	
      }
    
    
	private void clickRightButtonMultipleTimes(int count) throws InterruptedException {
        for (int i = 0; i < count; i++) {
            WebElement right_click = driver.findElement(By.xpath("//div[contains(@class,'css-1d9rhbz')]//button[contains(@aria-label,'Go to next slide')]"));
            right_click.click();
            Thread.sleep(4000);
        }
	}
    
    
    
	@AfterTest
    public void tearDown() {
    	
            driver.quit();
        
    }
     
    
    
    
    
}
    
