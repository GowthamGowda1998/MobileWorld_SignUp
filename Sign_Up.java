package Mobile_World.Mobile_World;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Sign_Up {
	WebDriver driver = null;
  @Test
  public void testcase1() {
	  driver.findElement(By.xpath("//button[@type='submit']")).click(); 
  }
  

  @Test
  public void testcase2( ) {
	  
	 WebElement ele = driver.findElement(By.xpath("//a[text()='Sign up']"));
	 if(ele.isDisplayed()) {
		 System.out.println("Regestration Form should be displayed");
	 }
	 else {
		 System.out.println("Regestration Form should not be displayed");
	 }
  }
  
  @Test
  public void testcase3( ) {
	  driver.findElement(By.xpath("//a[text()='Sign up']")).click();
  }
  
  @Test
  public void testcase4() {
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Gowtham");
  }
  
  @Test
  public void testcase5() {
	  driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Gowda");
  }
  
  
 @Test
 public void testcase6() {
	 driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("gowtham123@gmail.com");
 }
 
 @Test
 public void testcase7() {
	 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Abcd1234");	 
 }
 
 @Test
 public void testcase8( ) throws InterruptedException {
	 driver.findElement(By.xpath("//input[@type='date']")).sendKeys("12/15/2022");
	 driver.findElement(By.xpath("//div[@class='col-md-2']//input[@name='gender']")).click();
	 driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9686391047");
	 driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("How are You?");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Thread.sleep(3000);
	 Alert a1 = driver.switchTo().alert();
	 a1.accept();
 }
 
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\gowtham.gowda\\eclipse-workspace\\Mobile_World\\servers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  Thread.sleep(3000);
	  driver.get("https://qualicoach.org/mwapp/index.html");
  }
 

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(5000);
	 driver.quit();
  }

}
