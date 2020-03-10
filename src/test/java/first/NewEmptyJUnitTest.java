/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import framework.Configuration;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class NewEmptyJUnitTest {
    
    @Test
    public void checkLoginPageTitle() throws IOException {
        Configuration.init();
        System.setProperty("webdriver.chrome.driver", Configuration.chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://bvtest.school.cubes.rs/login");
        
        String expectedTitle = "Brze vesti admin";
        String actualTitle = driver.getTitle();
        
        assertEquals(expectedTitle, actualTitle);
        driver.quit();
    }
    
    @Test
    public void checkLoginPageUrl() throws IOException {
        Configuration.init();
        System.setProperty("webdriver.chrome.driver", Configuration.chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://bvtest.school.cubes.rs/login");
        
        String expectedUrl = "http://bvtest.school.cubes.rs/login";
        String actualUrl = driver.getCurrentUrl();
        
        assertEquals(expectedUrl, actualUrl);
        driver.quit();
    }
    
    @Test
    public void testLogin() throws IOException {
        Configuration.init();
        System.setProperty("webdriver.chrome.driver", Configuration.chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://bvtest.school.cubes.rs/login");
        
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys(Configuration.validEmail);
        
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(Configuration.validPassword);
        
        WebElement loginButton = driver.findElement(By.className("btn-primary"));
        loginButton.click();
        
        assertEquals("http://bvtest.school.cubes.rs/admin", driver.getCurrentUrl());
        
        driver.quit();
    }
    
    
    
}
