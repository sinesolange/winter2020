package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
public static void main (String[] args) {
	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sosos\\Desktop\\eclipsewspace\\LaunchBrowser\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
}
}
