package mavenTest;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class browsers {

    private static final String ACCESS_KEY = "eyJ4cC51Ijo4OCwieHAucCI6MiwieHAubSI6Ik1BIiwiYWxnIjoiSFMyNTYifQ.eyJleHAiOjE4NDg5MDEzNjQsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.R6eC0SQ6VEppgkUIcf7RMGG4ZpSBZzl2fedjrvQON0E";
    private WebDriver driver;
    private URL url;
    private DesiredCapabilities dc = new DesiredCapabilities();

    @Parameters({"browser"})
    @BeforeMethod
    public void setUp(@Optional("chrome") String browser) throws Exception {
        url = new URL("https://sales.experitest.com/wd/hub");
        dc.setCapability(CapabilityType.BROWSER_NAME, browser);
//        dc.setCapability(CapabilityType.BROWSER_VERSION, "70");
        dc.setCapability("accessKey", ACCESS_KEY);
        dc.setCapability("testName", browser+" selenium test");
        driver = new RemoteWebDriver(url, dc);
    }


    @Test(groups = {"seetest"})
    public void testExperitest() throws InterruptedException {
        for(int i=0;i<5;i++){
            driver.get("https://www.google.com");
            new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
            WebElement searchBar = driver.findElement(By.name("q"));
            searchBar.click();
            searchBar.sendKeys("Experitest");
            searchBar.sendKeys(Keys.ENTER);
            Thread.sleep(10000);
            driver.get("https://en.wikipedia.org/wiki/Special:Random");
            Thread.sleep(10000);
            
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}