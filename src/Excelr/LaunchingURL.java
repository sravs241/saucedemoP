package Excelr;

import org.testng.annotations.Test;

import utils.BaseClass;

public class LaunchingURL extends BaseClass {

	@Test
	public void launchbrowser() {
		String url = "https://www.saucedemo.com/";
		driver.get(url);
	}

}
