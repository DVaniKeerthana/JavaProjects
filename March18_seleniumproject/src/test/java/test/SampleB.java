package test;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class SampleB {
		
	
		public static void main(String[] args) throws InterruptedException{
		
		                WebDriver driver;
						driver = new ChromeDriver();
						driver.get("https://demo.automationtesting.in/Alerts.html");
						driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
						
						
						driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
						
						driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
						
						System.out.println(driver.switchTo().alert().getText());
						Thread.sleep(4000);
						
						driver.switchTo().alert().dismiss();
						
		}
	}
