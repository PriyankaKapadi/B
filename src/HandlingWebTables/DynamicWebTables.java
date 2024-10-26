package HandlingWebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTables {
	
	public static void dynamicTables() {
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		int rows=cd.findElements(By.tagName("tr")).size();
		//int col=cd.findElements(By.tagName("td")).size();
		System.out.println(rows);
		for(int i=1;i<rows;i++) {
			for (int j=1;j<6;j++){
				String data=cd.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
				
				System.out.print(data+"\t\t");	
			}
			System.out.println();
		}
		
	}
public static void main(String[] args) {
	DynamicWebTables d=new DynamicWebTables();
	d.dynamicTables();
}
}
