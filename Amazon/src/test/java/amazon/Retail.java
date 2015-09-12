package amazon;

import CommonApi.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by Kalkidan on 9/1/2015.
 */
public class Retail extends Base {
   @Test
   public void home(){
      //typeByCss("#twotabsearchtextbox","books");
      typeByCssThenEnter("#twotabsearchtextbox","books");
   }
}
