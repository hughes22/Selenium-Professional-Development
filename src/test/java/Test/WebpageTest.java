package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebpageTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello rahul,");
		Thread.sleep(2000);
		//System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		//driver.findElement(By.linkText("Forgot your password?")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.cssSelector(".logout-btn")).click();
		  
		//String originalWindow = driver.getWindowHandle();
		//driver.switchTo().window(originalWindow);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.switchTo().newWindow(WindowType.TAB);
		//File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(srcFile, new File("./image1.png"));
		//Thread.sleep(2000);
		
		
		/*WebElement element = driver.findElement(By.cssSelector(".lnXdpd"));
		File srcFile1 = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile1, new File("./image2.png"));
		*/
		
		driver.close();
		//driver.quit();
	}
 }
 
