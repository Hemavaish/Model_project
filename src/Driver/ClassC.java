package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassC {
	static WebDriver driver;
	public static void launch(String url) {
		System.setProperty("weddriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\selenium\\src\\chrome\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.get(url);
}

}
