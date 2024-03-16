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
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginCart {
    
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
    
    @Test(priority =1)
    public void validLoginTest() throws InterruptedException {
        String[] validEmails = {"arundinesh.inv8@gmail.com", "dinesh.pitchaimani@gmail.com"};
        String[] validPasswords = {"Asdf678", "Qwes345@"};

        for (int i = 0; i < validEmails.length; i++) {
            performLogin(validEmails[i], validPasswords[i]);
            Thread.sleep(5000);
        }
    }
    
    @Test(priority =2)
    public void invalidLoginTest() throws InterruptedException {
        
        String[] invalidEmails = {"d%#$#^f@gmail.com", "sh$#%%##*&@gmail.com"};
        String[] invalidPasswords = {"12", "253562s"};

        for (int i = 0; i < invalidEmails.length; i++) {
             performInvalidLogin(invalidEmails[i], invalidPasswords[i]);
            Thread.sleep(5000);
        }
    }

    private void performLogin(String email, String password) throws InterruptedException {
        WebElement loginButton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/a[1]/p[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(loginButton).perform();
        actions.click().perform();

        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);

        // Click the login button
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/button[1]")).click();
        Thread.sleep(5000);
        
     // logout button click
        driver.findElement(By.xpath("//p[@class='chakra-text css-128nlh6']")).click();
    }
    
    private void performInvalidLogin(String email, String password) throws InterruptedException {
    	
    	
        WebElement loginButton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/a[1]/p[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(loginButton).perform();
        actions.click().perform();

        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);

        // Click the login button
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/button[1]")).click();
        Thread.sleep(5000);
        
        // handle the alert dialog box
        try {
            Alert alert = driver.switchTo().alert();
            alert.dismiss(); 
        } catch (NoAlertPresentException e) {
            
        }

        Thread.sleep(7000);
        
        driver.navigate().back();
        Thread.sleep(7000);
        

       

        
        
        
        
		
    }
    
    
    
   
	@AfterTest
    public void tearDown() {
    	
            driver.quit();
        
    }
    
    
    
}




