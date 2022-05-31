package students.HalilCetin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab04 {
    //1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
//4. Click to checkbox3
//5. Verify checkbox3 is selected
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver  driver=new ChromeDriver();
        //open Chrome Browser
        driver.navigate();
        //go to https://demo.guru99.com/test/radio.html
        driver.navigate().to("https://demo.guru99.com/test/radio.html");
        // Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)

    }

}
