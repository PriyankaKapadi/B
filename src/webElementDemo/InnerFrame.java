package webElementDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrame {
	public static void main(String[] args) {
		ChromeDriver cd = new ChromeDriver();
		cd.get("file:///E:/innerdom.html");
		cd.manage().window().maximize();
		cd.findElement(By.xpath("//input[@name='fname']")).sendKeys("Vidisha");
		cd.switchTo().frame("frame-2");
		cd.findElement(By.xpath("//input[@name='lname']")).sendKeys("Kapadi");
		cd.switchTo().parentFrame();
		cd.findElement(By.xpath("//button[@name='ok-btn']")).click();
	}
}
