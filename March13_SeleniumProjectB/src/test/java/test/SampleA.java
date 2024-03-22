package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleA {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Vani");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Keerthana");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("ATP");
		
		Select dropDownSkill = new Select(driver.findElement(By.xpath("//select[@ng-model='Skill']")));
		dropDownSkill.selectByIndex(5);
		
		Select dropDownYear = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
		dropDownYear.selectByValue("2003");
		
		Select dropDownMonth = new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
		dropDownMonth.selectByVisibleText("March");
		

	}

}
