package HandlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {
	public void handlingPromptAlert() {
		ChromeDriver cd = new ChromeDriver();
		cd.get("file:///E:/Prompt_Alert.html");
		cd.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert=cd.switchTo().alert();
		alert.sendKeys("Priyanka");
		alert.accept();
	}
	public void handlingConfirmationAlert() {
		ChromeDriver cd = new ChromeDriver();
		cd.get("file:///E:/Confirmation_Alert.html");
		cd.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert=cd.switchTo().alert();
		//alert.sendKeys("Priyanka");
		alert.dismiss();
	}
	public static void main(String[] args) {
		HandlingAlert H=new HandlingAlert();
		H.handlingConfirmationAlert();
	}
}
