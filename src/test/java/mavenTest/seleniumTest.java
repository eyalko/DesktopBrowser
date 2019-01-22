//package mavenTest;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.BrowserType;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Optional;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
////import com.experitest.manager.api.ManagerFileType;
////import com.experitest.manager.api.ManagerPublisher;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.ios.IOSDriver;
//
//import java.io.File;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.logging.Level;
//
//
//public class seleniumTest {
//	private final String accessKey = "eyJ4cC51Ijo4OCwieHAucCI6MiwieHAubSI6Ik1BIiwiYWxnIjoiSFMyNTYifQ.eyJleHAiOjE4MzcwNjY4NTMsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.KSvwS-72DOrM9DTUfaJskQZzdA2zREAqW7lYk1J4lO0";
//	private final String userAccessKey = "eyJ4cC51Ijo5OCwieHAucCI6MiwieHAubSI6Ik1UVXlORFkwTWpBMk9EUTRNZyIsImFsZyI6IkhTMjU2In0.eyJleHAiOjE4NDAwMDI3MDcsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.KMhmDXcY3TqN-F6SvJf677ZWfLqHTkUNXenDSxGo3VA";
//	private final String LocalAccessKey = "eyJ4cC51IjoxLCJ4cC5wIjoyLCJ4cC5tIjoiTVRVek1EQTNOakV6TXpJNE5nIiwiYWxnIjoiSFMyNTYifQ.eyJleHAiOjE4NDg1NTcyMzIsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.ytfYQsHEBfCnWQWGMjovghkoAD3gtzDOsNkR6AdHMMU";
//	private final String USAccessKey = "eyJ4cC51IjoxMDkwMDYsInhwLnAiOjExNjc0MSwieHAubSI6Ik1UVXlNelU1T1RjME5ESXhNQSIsImFsZyI6IkhTMjU2In0.eyJleHAiOjE4NDI5NTQyNTksImlzcyI6ImNvbS5leHBlcml0ZXN0In0.RQsFaEY1na_YbKSrQN_l97hxxJXxd5EHEKfO_TFn1B0";
//	
//	protected URL url;
//	protected WebDriver driver;
//	protected DesiredCapabilities dc = new DesiredCapabilities();
//
//	@Parameters({"browser"})
//	@BeforeMethod
//	public void setUp(@Optional("firefox") String browser) {
//		try {
//			url = new URL("https://:"+accessKey+ "@sales.experitest.com/wd/hub");
////			url = new URL("http://:"+LocalAccessKey+ "@localhost:9090/wd/hub");
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		dc.setCapability(CapabilityType.PLATFORM, Platform.WIN10);
//		dc.setCapability("testName", browser+" Test");
//		dc.setCapability("generateReport", true);
//		dc.setCapability("Selenium", "EyalProject");
////		dc.setCapability(new File("C:\\Users\\eyal.kopelevich\\Downloads\\test.txt"), ManagerFileType.text);
//		dc.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
//
//		switch (browser) {
//		case "android": driver = new AndroidDriver<WebElement>(url,dc);
//						break;
//        case "ios": driver = new IOSDriver<WebElement>(url,dc);
//						break;
//        default: 		dc.setCapability(CapabilityType.BROWSER_NAME, browser);
////						dc.setCapability(CapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
////						dc.setCapability(CapabilityType.VERSION, "56.0.1");
//						driver = new RemoteWebDriver(url, dc);
//		}
//		System.out.println(browser);
//			
////		((RemoteWebDriver) driver).setLogLevel(Level.INFO);
//		
//		
//	}
//
//	@Parameters({"browser"})
//	@Test
//	public void test(@Optional("firefox") String browser) throws InterruptedException {
//		
//		driver.get("https://www.google.com");
//        Thread.sleep(8000);
//        WebElement searchBar = driver.findElement(By.xpath("//*[@name='q']"));
//        searchBar.click();
//        Thread.sleep(5000);
//        searchBar.sendKeys("Jerusalem wiki");
//        searchBar.submit();
//        Thread.sleep(5000);
//        String url;
//        
//        switch (browser) {
//	        case "android": url = "//*[@text='https://en.m.wikipedia.org']";
//	        	break;
//	        case "ios": url = "//*[@text='https://en.m.wikipedia.org']";
//	        	break;
//	        default: url = "//*[@href=\"https://en.wikipedia.org/wiki/Jerusalem\"]";
//        }
//        
//        driver.findElement(By.xpath(url)).click();
//        Thread.sleep(5000);
////        driver.findElement(By.xpath("//*[contains(text(), 'History of Jerusalem')]")).click();
////        Thread.sleep(5000);
//        driver.getCurrentUrl();
//        driver.getTitle();
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	
//	
//	@AfterMethod
//	public void tearDown(){
//		driver.quit();
//	}
//
//
//
////	protected void setAK() {
////		try {
////			url = new URL("http://:" + accessKey + "@192.168.2.91:80/wd/hub");
////			if (SECURE)
////				url = new URL("https://:" + accessKey + "@192.168.2.91:80/wd/hub");
////		} catch (MalformedURLException e) {
////			e.printStackTrace();
////		}
////	}
//}
