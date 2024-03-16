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

public class Getting_GreenProduct_Title {
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
    public void Green_Getting_Title() throws InterruptedException {
        List<WebElement> titles = driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul//a"));

        for (int i = 0; i < 7 && i < titles.size(); i++) {
            WebElement title = titles.get(i);
            String productDetails = title.getText();
            System.out.println("Product details: " + productDetails);
        }

        Thread.sleep(5000);

        for (int i = 0; i < 7; i++) {
            WebElement right_click = driver.findElement(By.xpath("//div[contains(@class,'css-1d9rhbz')]//button[contains(@aria-label,'Go to next slide')]"));
            right_click.click();
            Thread.sleep(2000);
        }

        titles = driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/ul//a"));

        for (int i = 7; i < 14 && i < titles.size(); i++) {
            WebElement title = titles.get(i);
            String productDetails = title.getText();
            System.out.println("Product details: " + productDetails);
        }

        Thread.sleep(5000);
        
        
        System.out.println("------ Green_Getting_Title COMPLETED ---------");
    }
    
    
    
    @AfterMethod
	@AfterTest
    public void tearDown() {
    	
            driver.quit();
        
    }
    
    
}