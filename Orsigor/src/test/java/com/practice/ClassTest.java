package com.practice;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassTest {
	
	@Test
	public void clssTest() {
		
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println("BROWSER is "+BROWSER+"\t"+"URL is "+URL);
		
		Reporter.log("test1", true);
		Reporter.log("test2", true);
		Reporter.log("test3", true);
		Reporter.log("test4", true);

		Reporter.log("changes in sunb branch", true);

		Reporter.log("changing using github edit", true);
		Reporter.log("pushing code to orsigor", true);
		Reporter.log("testing for poll SCM", true);

	}

}
