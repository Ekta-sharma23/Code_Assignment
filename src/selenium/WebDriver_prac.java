package selenium;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class WebDriver_prac {
	
public static void main(String[] args) {
		
	
	//Google Chrome
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ektar\\eclipse-workspace\\Practice\\src\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//Microsoft Edge
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\ektar\\git\\Code_Assignment\\edgedriver\\msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver();
		
		//Launch the URL
		driver.get("https://www.google.com/");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Minimize the Browser
		driver.manage().window().minimize();
		
		//Set Browser dimensions like 300 widths and 500 height (same as mobile)
		Dimension dem = new Dimension(300,500);
		driver.manage().window().setSize(dem);
		
		//print TitleOfBrowser
		System.out.println("Tittle of page:- " + driver.getTitle());
		
		//print Current URL of Browser
		System.out.println("Current URL:-" + driver.getCurrentUrl());
		
		//print Source Code of Browser
		System.out.println ("Page Source" + driver.getPageSource());
		
		//Close Browser
	     driver.close();
		
		//quit Browser
		driver.quit();
		
}
}
