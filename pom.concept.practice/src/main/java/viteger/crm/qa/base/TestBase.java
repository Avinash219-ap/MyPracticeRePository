package viteger.crm.qa.base;



import java.io.FileInputStream;


import java.util.Properties;

import org.openqa.selenium.WebDriver;







public class TestBase {

	 
		public String getPropertyKeyValue(String key) throws Throwable
		{
			FileInputStream file=new FileInputStream("/pom.concept.practice/src/main/java/viteger/crm/qa/configuration/commondata.properties");
			Properties p=new Properties();
			p.load(file);
			return p.getProperty(key);
		}
		

      public void loadBrowser(WebDriver driver) {
    	  driver.get("url");
      }
      
               
}	

	

	

