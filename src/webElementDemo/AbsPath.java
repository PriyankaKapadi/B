package webElementDemo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbsPath {
public static void main(String[] args) {
	ChromeDriver cd=new ChromeDriver();
	cd.get("https://www.goibibo.com/");
	cd.manage().window().maximize();	
	WebDriverWait wait=new WebDriverWait(cd, Duration.ofSeconds(60));
	wait.withMessage("Element didn't appear in Maximum Timeout");
	wait.ignoring(ElementClickInterceptedException.class,NoSuchElementException.class);
	cd.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
	cd.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();
	cd.findElement(By.xpath("//p[@class='sc-12foipm-6 erPfRs']")).click();
	cd.findElement(By.xpath("//div[@class='sc-12foipm-24 bDSkOK']/descendant::input")).sendKeys("Mumbai");
	WebElement e=cd.findElement(By.xpath("//div[@class='sc-12foipm-24 bDSkOK']/descendant::input"));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='sc-12foipm-32 jVTqNw']/p[2]")));
	cd.findElement(By.xpath("//div[@class='sc-12foipm-32 jVTqNw']/p[2]")).click();
	cd.findElement(By.xpath("//div[@class='sc-12foipm-25 fbAAhv']/descendant::input")).sendKeys("Pune");
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='sc-12foipm-32 jVTqNw']/p[2]")));
	cd.findElement(By.xpath("//div[@class='sc-12foipm-32 jVTqNw']/p[2]")).click();
	cd.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow']")).click();
	cd.findElement(By.xpath("//div[@class='DayPicker-Day']")).click();
	cd.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow fswDownArrowTraveller']")).click();
	cd.findElement(By.xpath("//div[@class='sc-12foipm-47 pZQPB'][2]/descendant::div/span[3]")).click();
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='button-group-custom clearfix']/child::button[1]")));
	//cd.findElement(By.xpath("//div[@class='button-group-custom clearfix']/child::button[1]")).click();
	JavascriptExecutor js=(JavascriptExecutor)cd;
	js.executeScript("window.scrollBy(0,250)","");
	
	cd.findElement(By.xpath("//li[text()='business']")).click();
	cd.findElement(By.xpath("//a[@class='sc-12foipm-64 jkgFUQ']")).click();
	cd.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
}
}
