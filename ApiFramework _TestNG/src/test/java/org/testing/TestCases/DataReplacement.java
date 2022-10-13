package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.VariableReplacement;
import org.testing.utilities.json;


import io.restassured.response.Response;

public class DataReplacement 
{
	    public void Replace_through_Scanner() throws IOException
	    {    	
	    	
	    	Properties pr=LoadPropertiesFile.propertiesfile("../ApiFramework/URI.properties");
	    	String bodyData=json.LoadJsonFile("../ApiFramework/src/test/java/org/testing/resources/Scanner.json"); 
	    	 System.out.println("Please Enter Frist Name");
	    	Scanner s=new Scanner(System.in);
	    	String firstname=s.next();
	    	System.out.println("Please Enter Designation");
	    	String designation=s.next();
	    	System.out.println("Please Enter Last name");
	    	String lastname=s.next();
	    	
	    	 Random r=new Random();
	   	     Integer idvalue=r.nextInt();
	   	  
	    	bodyData=VariableReplacement.assignValue(bodyData, "firstname", firstname);
	    	bodyData=VariableReplacement.assignValue(bodyData, "id", idvalue.toString());
	    	bodyData=VariableReplacement.assignValue(bodyData, "designation", designation);
	    	bodyData=VariableReplacement.assignValue(bodyData, "lastname", lastname);
	    	
	    	HttpMethods http=new HttpMethods(pr);
	    	Response res=http.postmethod(bodyData, "Uri2");
	    	
	    	 System.out.println("TC1 result" +res.asString());
	         System.out.println("Status code is "+res.statusCode() );
	    }
}
