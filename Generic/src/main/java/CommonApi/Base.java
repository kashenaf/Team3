package CommonApi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Kalkidan on 9/1/2015.
 */
public class Base {

   public WebDriver driver=null;

   @Parameters({"url"})

   @BeforeMethod
   public void setUp(@Optional("http://www.cnn.com")String url){
      driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
      driver.navigate().to(url);
      driver.manage().window().maximize();
   }
   @AfterMethod
   public void cleanUp(){
      driver.quit();
   }
   public void clickByCss(String locator){
      driver.findElement(By.cssSelector(locator)).click();
   }
   public void clickByXpath(String locator){
      driver.findElement(By.xpath(locator)).click();
   }
   public void typeByCss(String locator, String value){
      driver.findElement(By.cssSelector(locator)).sendKeys(value);
   }
   public void typeByCssThenEnter(String locator, String value){
      driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
   }
   public void typeByXpath(String locator){
      driver.findElement(By.xpath(locator)).click();
   }
   public void clickbyId(String locator){
      driver.findElement(By.id(locator)).click();
   }
   public void clickByName(String locator){
      driver.findElement(By.id(locator)).click();
   }
   public void navigateBack(){
      driver.navigate().back();
   }
   public void navigateForward(){
      driver.navigate().forward();
   }
   public String getText(String locator){
      String st=driver.findElement(By.cssSelector(locator)).getText();
      return st;
   }
   public String getTextById(String locator){
      String st=driver.findElement(By.id(locator)).getText();
      return st;
   }
   public String getTextByName(String locator){
      String st=driver.findElement(By.name(locator)).getText();
      return st;
   }
   public WebElement getTextBycss(String locator){
      WebElement element = driver.findElement(By.cssSelector(locator));
      return element;
   }
   public WebElement getTextBycssXpath(String locator){
      WebElement element = driver.findElement(By.xpath(locator));
      return element;
   }
}
