package code.day01_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class c1_HelloSelenium {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //set up chrome driver
        WebDriverManager.chromedriver().setup();


<<<<<<< HEAD
            System.out.println("Hello World");
            //set up chrome driver
            WebDriverManager.chromedriver().setup();
=======

>>>>>>> 7d89d181a590510f98d0361a0ba12e4a33142326

                //create a driver instance
                WebDriver driver = new ChromeDriver();

                //navigate to chrome browser
                driver.get("https://www.etsy.com/");


                //navigate to chrome browser
                driver.get("https://www.etsy.com/");




    }
<<<<<<< HEAD


=======
}
>>>>>>> 7d89d181a590510f98d0361a0ba12e4a33142326

