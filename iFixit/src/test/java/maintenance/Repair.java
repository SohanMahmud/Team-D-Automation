package maintenance;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by soren on 8/29/2016.
 */
public class Repair extends Base {

    @Test
    public void AccountLogin() throws InterruptedException {

    //login: teampnt2016@gmail.com ---- password: automation
        clickByXpath(".//*[@id='home-page-top']/div/div[1]/a[2]");
        typeByCss("#email","teampnt2016@gmail.com");
        sleepFor(1);
        typeByCss("#password","automation");
        sleepFor(1);
        clickByCss("#loginBtn");
        sleepFor(3);



    }
}
