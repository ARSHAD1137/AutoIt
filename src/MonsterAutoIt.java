import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class MonsterAutoIt
{
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "X:\\Selenium jar and drivers\\drivers\\ChromeDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.monsterindia.com/seeker/registration");
        driver.findElement(By.xpath("//span[contains(text(),'Choose CV')]")).click();
        Thread.sleep(3000);

        Runtime.getRuntime().exec("C:\\Users\\Arshad\\Desktop\\Custom Batch QA\\AutoIt\\MonsterUpload.exe");
        driver.quit();
    }
}
