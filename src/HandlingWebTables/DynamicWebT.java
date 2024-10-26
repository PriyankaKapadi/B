package HandlingWebTables;

import java.util.Iterator;

import org.checkerframework.checker.units.qual.cd;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebT {
	public static void DynWebTables() {
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://practice.expandtesting.com/dynamic-table");
		int rows=cd.findElements(By.xpath("//table/tbody/tr")).size();
		for (int i = 1; i <= rows; i++) {
			String name=cd.findElement(By.xpath("//table/tbody/tr["+i+"]/td")).getText();
			if(name.equalsIgnoreCase("chrome")) {
				int cols=cd.findElements(By.xpath("//table/thead/tr/th")).size();
				for (int j = 1; j <= cols; j++) {
					String colname=cd.findElement(By.xpath("//table/thead/tr/th["+j+"]")).getText();
					if(colname.equalsIgnoreCase("CPU")) {
						String data=cd.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
						System.out.print(data+"\t");
					}
				}
				
			}
		}
	}

	public static void main(String[] args) {
		DynWebTables();
	}
}
