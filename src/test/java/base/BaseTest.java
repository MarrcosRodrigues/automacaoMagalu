package base;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {
	
	protected static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		driver = new EdgeDriver();
		driver.manage().window().setPosition(new Point(600,200));
		driver.manage().window().setSize(new Dimension(1200, 800));
		driver.get("https://www.magazineluiza.com.br/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
