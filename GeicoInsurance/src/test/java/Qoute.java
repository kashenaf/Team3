import CommonApi.Base;
import org.testng.annotations.Test;

/**
 * Created by Kalkidan on 9/21/2015.
 */
public class Qoute extends Base {
   @Test

   public void aquote(){
      clickByCss("#insurancetype");
      typeByCss("#zip", "22310");
      clickByCss("#submitButton");
      clickByXpath(".//*[@id='CustomerForm:fqUnmarriedDriver:1']");
      clickByXpath(".//*[@id='CustomerForm:continueBtn']");
      clickByXpath(".//*[@id='VehicleForm:year']/option[text() = '2014']");//Can we make a method for this line
      clickByXpath(".//*[@id='VehicleForm:make']/option[text() = 'kyser']");
      clickByXpath(".//*[@id='DriverForm:gender:0']");
      clickByXpath(".//*[@id='DriverForm:fulltimeStudent:1']");
      clickByXpath(".//*[@id='DriverForm:addNo']");
   }
}
