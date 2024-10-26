package HandlingWebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCRMTable {
	public static void CrmTable() {
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://localhost:5173/");
		cd.manage().window().maximize();
		cd.findElement(By.xpath("//input[@id='username']")).sendKeys("pr@12");
		cd.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
		cd.findElement(By.xpath("//button[text()='Login']")).click();
		JavascriptExecutor js=(JavascriptExecutor)cd;
		js.executeScript("window.scrollBy(0,300)","");
		int rows=cd.findElements(By.tagName("tr")).size();
		for (int i = 1; i < rows; i++) {
			String name=cd.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
			for (int j = 1; j <8 ; j++) {
				if(name.equalsIgnoreCase("priyanka Kapadi")) {
					String email=cd.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.println("Email Id :"+email);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		CrmTable();
	}
}
