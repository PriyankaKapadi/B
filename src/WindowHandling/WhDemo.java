package WindowHandling;

import java.util.LinkedHashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhDemo {
	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		cd.get("file:///E:/HandlingMultipleWindows.html");
		cd.findElement(By.xpath("//button[text()='Try it']")).click();
		String ParentWin=cd.getWindowHandle();
		LinkedHashSet<String> H=(LinkedHashSet<String>)cd.getWindowHandles();
		H.remove(ParentWin);
		for (String handle : H) {
			cd.switchTo().window(handle);
			String url=cd.getCurrentUrl();
			if(url.contains("First")) {
				cd.findElement(By.xpath("//button[text()='Click Me']")).click();
			}
			
		}
	}
}
