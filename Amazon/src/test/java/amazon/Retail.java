package amazon;

import CommonApi.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import java.util.List;
/**
 * Created by Kalkidan on 9/1/2015.
 */
public class Retail extends Base {
   @Test
   public void home() throws InterruptedException {
      typeByCss("#twotabsearchtextbox","All Departments");
      sleepFor(2);
      clearInputBox("#twotabsearchtextbox");
      typeByCssThenEnter("#twotabsearchtextbox", "books");
      sleepFor(2);
      clearInputBox("#twotabsearchtextbox");
      sleepFor(2);
      typeByCss("#twotabsearchtextbox", "All Departments");

      }


}
