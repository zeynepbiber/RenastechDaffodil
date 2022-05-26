package code.day04_LCssSelectorAndImplicitywait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_getText_getAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement gmailButton=driver.findElement(By.linkText("Gmail"));
        System.out.println("Gmail button text is ="+gmailButton.getText());
        System.out.println("Gmail button href attribute ="+gmailButton.getAttribute("href"));
    }
}
