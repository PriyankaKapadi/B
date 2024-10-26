package webElementDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondFrame {
	public static void main(String[] args) {
		ChromeDriver cd = new ChromeDriver();
		cd.get("file:///E:/SecondFrame.html");
		cd.findElement(By.xpath("//input[@name='lname']")).sendKeys("Kapadi");
	}
}
