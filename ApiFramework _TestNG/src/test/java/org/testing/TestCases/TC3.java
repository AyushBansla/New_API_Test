package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.LoadPropertiesFile;

import io.restassured.response.Response;

public class TC3 
{
	public void TestCase3() throws IOException
	 {
		Properties pr=LoadPropertiesFile.propertiesfile("../ApiFramework/URI.properties");
		 HttpMethods http=new HttpMethods(pr);
		 Response res=http.getmethod("Uri2", TC1.ResponseIDValue);
		 
		 System.out.println("--------Test Case 3--------");
		 System.out.println("Status code is "+res.statusCode() );
		 System.out.println("TC3 result" +res.asString());
	        
	 }
}
