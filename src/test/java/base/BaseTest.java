package base;

import framework.Configuration;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseTest {
    
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    
    public BaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws IOException {
        Configuration.init();
        System.setProperty("webdriver.chrome.driver", Configuration.chromeDriverPath);
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
        driver.get(Configuration.adminLoginUrl);
    }
    
    @AfterClass
    public static void tearDownClass() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
}
