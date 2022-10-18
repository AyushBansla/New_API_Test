package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;
import org.testing.testSteps.HttpMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.jsonParsing;
import io.restassured.response.Response;

public class TC7_Get_Online
{
	public static String idValue;
	public void TC7_AllRecords() throws IOException
	{
		Properties pr=LoadPropertiesFile.propertiesfile("../ApiFramework/URI.properties");
		HttpMethods http=new HttpMethods(pr);
		Response rs= http.getallmethod("QA_URI_API_ALL");
		System.out.println("*********************Test Case 7********************************");
		System.out.println("Response code is : "+ rs.statusCode());
		System.out.println("Response is: " + rs.asString());
		idValue= jsonParsing.JsonParseOnlineAPI(rs.asString(), "id");
		System.out.println("idValue is: "+ idValue);		
	}
}
