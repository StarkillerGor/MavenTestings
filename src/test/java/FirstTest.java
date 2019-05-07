import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void FirstTest()
    {
        System.setProperty("webdriver.chrome.driver" ,  "C:/chromedriver.exe");

WebDriver driver= new ChromeDriver();
driver.get("https://demo.opencart.com");

    }
}
