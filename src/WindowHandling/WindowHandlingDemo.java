package WindowHandling;

import java.util.LinkedHashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {
	public static void main(String[] args) {
		ChromeDriver cd = new ChromeDriver();
		cd.get("file:///E:/HandlingMultipleWindows.html");
		cd.findElement(By.xpath("//button[text()='Try it']")).click();
		String parentWindow = cd.getWindowHandle();
		System.out.println(parentWindow);
		LinkedHashSet<String> H = (LinkedHashSet<String>) cd.getWindowHandles();
		H.remove(parentWindow);
		for (String handle : H) {
			cd.switchTo().window(handle);
			String url = cd.getCurrentUrl();
			System.out.println(url);
			if (url.contains("First")) {
				cd.findElement(By.xpath("//button[text()='Click Me']")).click();
			}
			if (url.contains("Second")) {
				cd.findElement(By.xpath("//button[text()='Click Me']")).click();
			}
			if (url.contains("Third")) {
				cd.findElement(By.xpath("//button[text()='Click Me']")).click();
			}
			if (url.contains("Fourth")) {
				cd.findElement(By.xpath("//button[text()='Click Me']")).click();
			}

		}
	}
}
