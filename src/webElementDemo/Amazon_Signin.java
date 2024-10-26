package webElementDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Signin {
public static void main(String[] args) {
	ChromeDriver d= new ChromeDriver();
	d.get("https://www.amazon.in");
	d.manage().window().maximize();
	d.findElement(By.xpath("(//span[@id='nav-link-accountList-nav-line-1'])[1]")).click();
	d.findElement(By.xpath("(//input[@id='ap_email'])[1]")).sendKeys("9765989522");
	d.findElement(By.id("continue")).click();
}
}
