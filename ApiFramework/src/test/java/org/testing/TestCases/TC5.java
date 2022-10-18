package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC5 
{
	@Test
	public void TestCase3() throws IOException
	 {
		Properties pr=LoadPropertiesFile.propertiesfile("../ApiFramework/URI.properties");
		 HttpMethods http=new HttpMethods(pr);
		 Response res=http.deleteRequest("Uri2", TC1.ResponseIDValue);
		 
		 System.out.println("--------Test Case 5--------");
		 System.out.println("Status code is "+res.statusCode() );
		 System.out.println("TC3 result" +res.asString());
	        
	 }
}
