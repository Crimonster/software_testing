package lab2;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {
//	   @Test 
//	   public void test() { 
//	       // Instantiate a webDriver implementation 
//	       WebDriver webdriver = new FirefoxDriver(); 
//	   } 

	public static void main(String args[]) {
		String firefoxdriver = "geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", firefoxdriver);
		WebDriver driver = new FirefoxDriver();

		String baseUrl = "http://103.120.226.190/selenium-demo/git-repo";
		driver.get(baseUrl);
		
		// π”√POI∂¡»°xlsx
		ExcelPoiReaderUtils POI = new ExcelPoiReaderUtils();
		String filePath =  System.getProperty("user.dir") + "/data/Selenium+Lab2020.xlsx";
		String[] columns = {"user","passward"};
		List data = POI.readExcel(filePath, columns);
		
		for(int i=0; i<data.size(); ++i) {
			Map dataRow = (Map)data.get(i);
			
			WebElement userName = driver.findElement(By.name("user_number"));
			userName.sendKeys(dataRow.get("user").toString());
			WebElement passName = driver.findElement(By.name("password"));
			passName.sendKeys(dataRow.get("passward").toString());
			
			WebElement submitName = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[3]/input"));
			submitName.click();
			
			WebElement address = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[5]/code"));
			if(address.getText().equals(dataRow.get("passward").toString())) {
				System.out.println("Success!");
			}else {
				System.out.println("Failed!");
				System.out.println(address.getText());
			}
		}
		
		
		
	}

}
