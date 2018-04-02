package mavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class seleniumTest {
	private static final long TIMEOUT = 2000;
	private final String accessKey = "eyJ4cC51Ijo4OCwieHAucCI6MiwieHAubSI6Ik1BIiwiYWxnIjoiSFMyNTYifQ.eyJleHAiOjE4MzcwNjY4NTMsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.KSvwS-72DOrM9DTUfaJskQZzdA2zREAqW7lYk1J4lO0";
	private boolean SECURE = false;

	protected URL url;
	protected WebDriver driver;
	protected DesiredCapabilities dc = new DesiredCapabilities();

	@Parameters({"browser"})
	@BeforeMethod
	public void setUp(@Optional("chrome") String browser) {
		try {
			url = new URL("https://:"+accessKey+ "@sales.experitest.com/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		dc.setCapability(CapabilityType.PLATFORM, Platform.WIN10);
		dc.setCapability("testName", browser+" Test");
		dc.setCapability("generateReport", true);
		dc.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
//		dc.setCapability(CapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
		dc.setCapability(CapabilityType.BROWSER_NAME, browser);
//		dc.setCapability(CapabilityType.BROWSER_VERSION, "56.0.1");
		driver = new RemoteWebDriver(url, dc);
		
		
	}

	@Test
	public void test() throws InterruptedException {
		
		driver.get("https://www.google.com");
        Thread.sleep(8000);
        WebElement searchBar = driver.findElement(By.id("lst-ib"));
        searchBar.click();
        Thread.sleep(5000);
        searchBar.sendKeys("Jerusalem wiki");
        searchBar.sendKeys(Keys.RETURN);
//        driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@href=\"https://en.wikipedia.org/wiki/Jerusalem\"]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[contains(text(), 'History of Jerusalem')]")).click();
        Thread.sleep(5000);
        driver.getCurrentUrl();
        driver.getTitle();
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//	    driver.findElement(By.xpath("//*[@name='username']")).sendKeys("eyal.kopelevich");
//	    driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Experitest2012");
//	    driver.findElement(By.xpath("//*[@name='login']")).click();
//	    driver.findElement(By.xpath("//*[@href='#/launchpad']")).click();
//	    driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[4]")).click();
//	    int i = 0;
//	    while (i < 20) {
//	        driver.findElement(By.xpath("//*[@class='icon icon-smartphone']")).click();
//	        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[4]")).click();
//	        i++;
//	    }
		driver.quit();
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}



//	protected void setAK() {
//		try {
//			url = new URL("http://:" + accessKey + "@192.168.2.91:80/wd/hub");
//			if (SECURE)
//				url = new URL("https://:" + accessKey + "@192.168.2.91:80/wd/hub");
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//	}
}
