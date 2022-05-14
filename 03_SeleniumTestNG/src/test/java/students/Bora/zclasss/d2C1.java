package students.Bora.zclasss;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class d2C1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        String expectedTitle="Smile";
        driver.navigate().to("https://www.amazon.com/");
        if(driver.getTitle().contains(expectedTitle)){
            System.out.println("verification passed");
        }
        else {
            System.out.println("verification failed");
        }
        driver.findElement(By.name("q"));


    }
}
