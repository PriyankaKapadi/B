package HandlingWebTables;

import java.util.Iterator;

import org.checkerframework.checker.units.qual.cd;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintWholeTable {
	public static void printTable() {
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://practice.expandtesting.com/dynamic-table#google_vignette");
		int rows=cd.findElements(By.xpath("//table/tbody/tr")).size();
		for (int i = 1; i <= rows; i++) {
			System.out.print(cd.findElement(By.xpath("//table/thead/tr/th["+i+"]")).getText()+"\t\t");
		}
		System.out.println();
		for (int i = 1; i <= rows; i++) {
			//System.out.print(cd.findElement(By.xpath("//table/thead/tr/th["+i+"]")).getText()+"\t");
			int cols=cd.findElements(By.xpath("//table/thead/tr/th")).size();
			for (int j = 1; j <=cols; j++) {
				String data=cd.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+"\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printTable();
	}
}
