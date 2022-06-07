package students.Gulistan;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class lab09 {

    WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
    }
    @AfterMethod
    public void closing() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
    String currentWindow = driver.getWindowHandle();
    List<String> windows = new ArrayList<>();



    }

