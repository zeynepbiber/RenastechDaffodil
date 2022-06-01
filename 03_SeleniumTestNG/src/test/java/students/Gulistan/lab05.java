package students.Gulistan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Go to Amazon
//enter Desk in search box
//Then search for desks
//(Use this task with TestNG framework)
public class lab05 {

    @Test()
    public void TC1(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.ca/");

       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("desks");
       driver.findElement(By.id("nav-search-submit-button")).click();

    }

}
