package code.day11_actions;

import code.base.TestBase2;
import code.utilities.DriverUtil;
import code.utilities.PropertiesReadingUtil;
import org.testng.annotations.Test;

public class c1_driverUtilPractice extends TestBase2 {
    //go to google
    //search for hello
    //verify title contains hello

    @Test
    public void TC1(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("google_url"));
    }
}
