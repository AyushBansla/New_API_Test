package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.jsonParsing;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2
{
	@Test
	 public void TestCase2() throws IOException
	 {
		 Properties pr=LoadPropertiesFile.propertiesfile("../ApiFramework/URI.properties");
		 HttpMethods http=new HttpMethods(pr);
		 Response res=http.getallmethod("Uri2");
		 
		 System.out.println("TC2 result" +res.asString());
	        System.out.println("Status code is "+res.statusCode() );
	        
	        jsonParsing.jsonparseAllid(res.asString(), "id");
	 }
	 
}
