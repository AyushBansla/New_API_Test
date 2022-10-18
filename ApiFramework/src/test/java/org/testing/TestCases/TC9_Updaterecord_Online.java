package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;
import org.testing.testSteps.HttpMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.json;
import io.restassured.response.Response;

public class TC9_Updaterecord_Online 
{
	public void TC9_Updateparticular() throws IOException
	{
		Properties pr=LoadPropertiesFile.propertiesfile("../ApiFramework/URI.properties");
		HttpMethods http=new HttpMethods(pr);
		String bodyData=json.LoadJsonFile("../ApiFramework/src/test/java/org/testing/resources/UpdateRequestOnlineAPI.json"); 
		Response rs= http.UpdateRecord(bodyData, "QA_URI_API_PUT", TC7_Get_Online.idValue);
		System.out.println("************************Test Case 9***********************************");
		System.out.println("Response code is: "+ rs.statusCode());
		System.out.println("Response is :" + rs.asString());
	}
}
