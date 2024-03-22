package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleB {

	public static void main(String[] args) {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		
		driver.manage().window().fullscreen();
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.close();
		
		//driver.quit();
	}

}
