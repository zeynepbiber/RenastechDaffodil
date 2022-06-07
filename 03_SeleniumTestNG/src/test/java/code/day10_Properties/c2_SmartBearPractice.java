package code.day10_Properties;
import code.base.TestBase;
import code.utilities.PropertiesReadingUtil;
import code.utilities.SmartBearUtils;
import org.testng.annotations.Test;

public class c2_SmartBearPractice extends TestBase {
    //inheritance

    //open chrome browser
    //go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //click on box which belongs "charles Dodgeson"
    //click on delete button
    //verify if charles deleted from the list

    @Test
    public void TC1_CharlesDeleteVerification(){
        //go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        SmartBearUtils.loginForSmartBear(driver);

    }
}
