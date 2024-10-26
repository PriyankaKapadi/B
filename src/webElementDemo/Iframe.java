package webElementDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) {
		ChromeDriver cd = new ChromeDriver();
		cd.get("file:///E:/FrameDemo.html");
		cd.switchTo().frame("frame_1");
		cd.findElement(By.xpath("//input[@name='fname']")).sendKeys("Priyanka");
		cd.switchTo().frame("frame-2");
		cd.findElement(By.xpath("//input[@name='lname']")).sendKeys("Kapadi");
		cd.switchTo().parentFrame();
		cd.findElement(By.xpath("//button[@name='ok-btn']")).click();
		
	}
}
