package com.practice;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassTest {
	
	@Test
	public void clssTest() {
		Reporter.log("test1", true);
		Reporter.log("test2", true);
		Reporter.log("test3", true);
		Reporter.log("test4", true);
		Reporter.log("changes in sunb branch", true);
	}

}
