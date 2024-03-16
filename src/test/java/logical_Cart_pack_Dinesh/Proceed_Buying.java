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

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Proceed_Buying {
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
public void Proceed_Buy_Valid_Data11() throws InterruptedException,TimeoutException {
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		    .withTimeout(Duration.ofSeconds(10));

    System.out.println("------- Proceed_Buy_Valid_Data  Started -------");

    // Click on the "goat Tripe" button
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[2]/div[2]/div/ul/li[3]/a/div/div/div/div/button")).click();
    Thread.sleep(5000);

    WebElement Cart_Button1 = driver.findElement(By.xpath("//button[@class='chakra-button css-1jjywr9']//*[name()='svg']"));
    Cart_Button1.click();
    Thread.sleep(5000);

    // Check if the cart is empty or not //*[@id="root"]/div/div[2]/div/div[2]/div[1]
    List<WebElement> cartItems = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]"));
    if (cartItems.size() == 0) {
        // Cart is empty
        System.out.println("Cart is empty.");
        WebElement buyButton = driver.findElement(By.xpath("//p[@class='chakra-text css-1tpj6an']"));
        buyButton.click();
        // Wait for the popup message to appear
        By popupMessageLocator = By.xpath("//div[@id='toast-21-description']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(popupMessageLocator));
        // Get the text of the popup message
        WebElement popupMessageElement = driver.findElement(popupMessageLocator);
        String popupMessageText = popupMessageElement.getText();
        System.out.println("Popup Message: " + popupMessageText);
    } else {
        // Cart contains items, proceed to buy
        // Click on the "Buy" button 
        WebElement buyButton = driver.findElement(By.xpath("//p[@class='chakra-text css-1tpj6an']"));
        buyButton.click();

        // Wait for the "Proceed to Buy" button to be clickable
        try {
            WebElement proceedToBuyButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/section[1]")));
            proceedToBuyButton.click();
            // Get the text of the "Proceed to Buy" button
            String proceedToBuyButtonText = proceedToBuyButton.getText();
            System.out.println("Text of the 'Proceed to Buy' button: " + proceedToBuyButtonText);
        } catch (Exception e) {
            // Handle the case where the element is not found within the specified wait time
            System.out.println("Proceed to Buy button not found within the specified wait time.");
            e.printStackTrace();
        }
    }

}
    
    
   
    
    
    
    
    
    
    
   
	@AfterTest
    public void tearDown() {
    	
            driver.quit();
        
    }
}































