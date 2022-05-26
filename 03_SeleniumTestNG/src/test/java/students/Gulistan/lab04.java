package students.Gulistan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class lab04 {
    //1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
//4. Click to checkbox3
//5. Verify checkbox3 is selected

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();
        int flag = 0;
      //  WebElement checkBox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
       List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
        //checkBox = {cb1,cb2,cb3}
       for(int i=0; i < checkBox.size(); i++){

           if (!checkBox.get(i).isSelected())
               flag++;
       }

       if (flag == 3)
           System.out.println("All checkboxes are not selected!");

       //click to checkbox3
        WebElement checkbox = driver.findElement(By.id("vfb-6-2"));
        checkbox.click();

       if(checkbox.isSelected()) {
           System.out.println("Checkbox3 is selected");
       }else{
           System.out.println("Checkbox3 is not selected");
       }

    }
}
