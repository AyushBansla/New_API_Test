package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;
import org.json.JSONObject;
import org.testing.testSteps.HttpMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.json;
import io.restassured.response.Response;

public class TC6_Online 
{
	public int idValue;
	public void TC6_PostReqOnlineAPI() throws IOException
	{
		Properties pr=LoadPropertiesFile.propertiesfile("../ApiFramework/URI.properties");
		HttpMethods http=new HttpMethods(pr);
		String bodyData=json.LoadJsonFile("../ApiFramework/src/test/java/org/testing/resources/Online_Input_Payload.json"); 
		Response rs= http.postmethod(bodyData, "QA_URI_API_ONLINE");
		System.out.println("*************************Test Case 6 *************************");
		System.out.println("Response code is: " + rs.statusCode());
		System.out.println("Response is: "+ rs.asString());
		JSONObject ob=new JSONObject(rs.asString());
//		System.out.println("Object value is: "+ ob.toString());
		JSONObject inner=ob.getJSONObject("data");
//		System.out.println("inner object is: "+inner.toString());
		idValue=inner.getInt("id");
		System.out.println("id value is: "+ idValue);
	}
}
