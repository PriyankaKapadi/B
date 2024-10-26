package HandlingWebTables;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {
	public static void staWebTable() {
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		int rows = cd.findElements(By.tagName("tr")).size();
		for (int i = 1; i < rows; i++) {
			String salary = cd.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[5]")).getText();
			for (int j = 1; j <= 6; j++) {
				if (Integer.parseInt(salary)<=10000) {
					String data=cd.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.print(data+"\t");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		staWebTable();
	}
}
