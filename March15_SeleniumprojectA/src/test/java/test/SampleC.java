package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleC {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		String title = driver.getTitle();
		
		if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
			System.out.println("User landed in current application");
		}
		else
		{
			System.out.println("User landed in incorrect application");
		}
		
	}
}