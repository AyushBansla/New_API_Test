package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;
import org.testing.testSteps.HttpMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.Randomdata;
import org.testing.utilities.json;
import org.testing.utilities.jsonParsing;
import org.testing.utilities.jsonVariable;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class TC1 
{
	 public static String ResponseIDValue;
	 
	 @Test
    public void TestCase1() throws IOException
    {    	
    	//for Chaining
    	////making properties object and giving filepath as input and it will read the properties from properties method
    	
    	String bodyData=json.LoadJsonFile("../ApiFramework/src/test/java/org/testing/resources/inputpayload.json"); 
    	
    	Properties pr=LoadPropertiesFile.propertiesfile("../ApiFramework/URI.properties");
    	
    	String Randomid=Randomdata.random();
    	bodyData=jsonVariable.jsonvariablereplacement(bodyData, "id" , Randomid);
    
    	HttpMethods http=new HttpMethods(pr);
    	Response res=http.postmethod(bodyData, "Uri2");
    	ResponseIDValue=jsonParsing.jsonparse(res.asString(), "id");
    	
    	 System.out.println("TC1 result" +res.asString());
         System.out.println("Status code is "+res.statusCode() );
    }
}
