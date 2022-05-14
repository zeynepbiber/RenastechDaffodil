package students.Bora.zclasss;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//TASK: Google search
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write “orange” in search box
//4- Click google search button
//5- Verify title:
//Expected: Title should start with “orange” word
//6-navigate back
//7-write banana in search box
//8-verify title contains banana.
public class d2C3_completeEdition {
 public static void main(String[] args) throws InterruptedException {

     WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys("orange");
        Thread.sleep(4000);
        WebElement searchButton=driver.findElement(By.name("btnK"));
        searchButton.click();

        String expectedTitle="orange";
        String actualTitle=driver.getTitle();
        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification has passed");
        }
        else {
            System.out.println("Title verification has failed");
        }
     System.out.println("actualTitle = " + actualTitle);

        driver.navigate().back();

        WebElement searchBox2= driver.findElement(By.name("q"));
         searchBox2.sendKeys("banana");
        WebElement searchButton2= driver.findElement(By.name("btnK"));
     searchButton2.click();
    String expectedTitle2="banana";
    String actualTitle2=driver.getTitle();
    if (actualTitle2.contains(expectedTitle2)){
        System.out.println("Title verification 2 has passed");
    }
    else {
        System.out.println("Title verification 2 has failed");
    }
     System.out.println("actualTitle2 = " + actualTitle2);


 }

}
