package test;


	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v114.log.Log;

	@Test
	public class Base{
		
	    protected WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        DevTools devTools = ((HasDevTools) driver).getDevTools();
	        devTools.createSession();
	        
	        // Enable browser logs
	        devTools.send(Log.enable());
	        driver.manage().window().maximize();
	        driver.get("https://www.rnsequity.com/");
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	    
	   
	}


