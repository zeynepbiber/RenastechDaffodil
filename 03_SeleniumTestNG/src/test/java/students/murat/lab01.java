package students.murat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab01 {

/*
        ## Task 1
        Go to https://www.etsy.com/
        Maximize
        Minimize

 */


        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();


            driver.manage().window().maximize();
            driver.manage().window().minimize();

        /*
        ## Task 2
        Go to "https://www.amazon.com/"
        get title and print out

         */

            System.out.println("****************");

            driver.get("https://www.amazon.com/");
            String title = driver.getTitle();
            System.out.println("Title of current page is = " + title);
        }
    }


