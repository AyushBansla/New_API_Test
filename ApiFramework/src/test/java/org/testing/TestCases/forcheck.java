package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.json;
import org.testing.utilities.jsonVariable;

import io.restassured.response.Response;

public class forcheck 
{
	public static void main(String[]args) throws IOException
	{
		 TC1 tc1=new TC1();
	   	 tc1.TestCase1();
		 
		 Properties pr=LoadPropertiesFile.propertiesfile("../ApiFramework/URI.properties");
		 String bodydata=json.LoadJsonFile("../ApiFramework/src/test/java/org/testing/resources/bodydataforUpdate.json"); 
		 
		 bodydata=jsonVariable.jsonvariablereplacement(bodydata, "id" , TC1.ResponseIDValue);
		 HttpMethods http=new HttpMethods(pr);
		 Response res=http.getmethod("Uri2", TC1.ResponseIDValue);
	    	
		 System.out.println("--------Test Case 4--------");
		 System.out.println("Status code is "+res.statusCode() );
		 System.out.println("TC4 result" +res.asString());
	}
}
