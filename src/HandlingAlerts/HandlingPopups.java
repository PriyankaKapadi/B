package HandlingAlerts;

import org.checkerframework.checker.units.qual.cd;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingPopups {
	public static void main(String[] args) {
		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--disable-notifications");
		ChromeDriver cd = new ChromeDriver(obj);
		cd.get("https://www.justdial.com/");
		
	}
}
