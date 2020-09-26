package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    //import selenium webdriver
    private WebDriver driver;

    //import chrome driver
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //Get url
        driver.get("https://monosnap.com/");
        //page wait for complete loading
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Maximize page
        driver.manage().window().maximize();
        //get page title
        System.out.println(driver.getTitle());
        //locate sign in form
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[1]/div/div[2]/div[3]/span")).click();
        //locate username field
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[4]/input[1]")).sendKeys("beccabe18testify@yahoo.com");
        //locate password field
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[4]/input[2]")).sendKeys("testersis2334#");
        //click on sign in button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click();

        Thread.sleep(10000);

        //close the browser after test
        driver.quit();
    }

    //initiate the test run command
    public static void main(String args[]) throws InterruptedException {
        LoginTests tests = new LoginTests();
        tests.setUp();
    }
}
