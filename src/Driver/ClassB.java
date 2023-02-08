package Driver;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClassB extends ClassC{
	public static void main (String[] args) throws Throwable{
	launch("https://www.flipkart.com");
	

	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone mobile");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	Thread.sleep(3000);
	String s1 ="//div[@class='B_NuCI']";
	String s2 ="//div[@class='1YokD2 _2GoDe3']";
	
	List<WebElement> mob = driver.findElements(By.xpath(s1));
	List<WebElement> pri = driver.findElements(By.xpath(s2));
	for(int i=0;i<mob.size();i++) {
		System.out.println(mob.get(i).getText()+"="+pri.get(i).getText());
	}
	 
}

	private static void maximize() {
		// TODO Auto-generated method stub
		
	}

		
	}

