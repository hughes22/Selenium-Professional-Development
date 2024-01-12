package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aspnet {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demowf.aspnetawesome.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button[id='ContentPlaceHolder1_AllMealsSbm-awed'] div[class='o-cptn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id='ContentPlaceHolder1_AllMealsSbm-dropmenu'] li:nth-child(4)")).click();
		
		
		WebElement elementToHover = driver.findElement(By.cssSelector("body > div:nth-child(39) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(4) > i:nth-child(1)"));
		
		
        // Create an instance of the Actions class
        Actions actions = new Actions(driver);

        // Perform the hover action
        actions.moveToElement(elementToHover).perform();
        elementToHover.click();
		Thread.sleep(2000);
		
		System.out.println("this is a hover");
		System.out.println(driver.findElement(By.cssSelector("body > div:nth-child(39) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(4) > i:nth-child(1)")).getText());
		driver.findElement(By.cssSelector("[id=\"ContentPlaceHolder1_AllMealsSbm_s-dropmenu\"]>div.o-itsc>ul>li:nth-child(3)>div")).click();
		Thread.sleep(10000);
		driver.close();
		
		
	}
}
