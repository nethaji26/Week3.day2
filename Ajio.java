package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();		
		
		//Create a map to store  preferences 
		Map<String, Object> prefs = new HashMap<String, Object>();

		//add key and value to map as follow to switch off browser notification
		//Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);

		//Create an instance of ChromeOptions 
		ChromeOptions options = new ChromeOptions();

		// set ExperimentalOption - prefs 
		options.setExperimentalOption("prefs", prefs);

		//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();		
		WebElement element = driver.findElement(By.xpath("//input[@role='combobox']"));
		element.sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();//checking men check box
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click(); //checking fashion bags checkbox
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();// to get count of search results
		System.out.println(text);
		//WebElement Bagnames = driver.findElement(By.id("products"));
		List<WebElement>Listofbagnames = driver.findElements(By.id("products"));
		for (WebElement bagnamess : Listofbagnames) {
			
			String text2 = bagnamess.getText();
			System.out.println(text2);
			
		}
		
		List<WebElement> brandnames = driver.findElements(By.xpath("(//ul[@class='rilrtl-list '])[4]"));
		for (WebElement bn : brandnames) {
			String text3 = bn.getText();
			System.out.println(" The brand names are " +text3);
			
			
		}
		
		
		
		
		
		

	}

}
