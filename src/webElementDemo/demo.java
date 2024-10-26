package webElementDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) {
		ChromeDriver D = new ChromeDriver();
		
		D.get("https://www.amazon.in");
		D.manage().window().maximize();
		D.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple iPhone 16");
		D.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).submit();
		D.findElement(By.linkText("Apple iPhone 16 (128 GB) - Pink")).click();
		D.findElement(By.xpath("//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']")).click();
		
	}
}
