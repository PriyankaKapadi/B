package webElementDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.amazon.in/");
		cd.manage().window().maximize();
		cd.findElement(By.xpath("//a[text()='Best Sellers']")).click();
		cd.findElement(By.xpath("//a[text()='Bags, Wallets and Luggage']")).click();
		cd.findElement(By.xpath("//div[@class='_cDEzb_p13n-sc-css-line-clamp-3_g3dy1']")).click();
		//cd.findElement(By.xpath("//p[text()='Checkin | 65 cm | Medium']")).click();
		JavascriptExecutor js=(JavascriptExecutor)cd;
		js.executeScript("window.scrollBy(0,100)","");
		
		cd.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		cd.findElement(By.xpath("//button[@id=\"a-autoid-3-announce\"]")).click();
		
	}
}
