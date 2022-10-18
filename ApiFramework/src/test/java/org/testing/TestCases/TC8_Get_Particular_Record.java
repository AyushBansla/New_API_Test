package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;
import org.testing.testSteps.HttpMethods;
import org.testing.utilities.LoadPropertiesFile;
import io.restassured.response.Response;

public class TC8_Get_Particular_Record 
{

	public void TC8_GetParticularRecdOnlnAPI() throws IOException
	{
		Properties pr=LoadPropertiesFile.propertiesfile("../ApiFramework/URI.properties");
		HttpMethods http=new HttpMethods(pr);
		Response rs= http.getmethod("QA_URI_API_SINGLE", TC7_Get_Online.idValue);
		System.out.println("*********************Test Case 8*****************************");
		System.out.println("Response code is: "+rs.statusCode());
		System.out.println("Response data is: "+rs.asString());
	}
}
