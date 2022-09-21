package Testngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Dataprovider {

  @DataProvider(name="Search Provider")
  public static Object[][] getDataFromDataProvider() {
    return new Object[][] {
       { "admin", "1234" },
      
      
    };
  }
}
