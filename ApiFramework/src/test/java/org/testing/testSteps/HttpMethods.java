package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class HttpMethods 


//for fetching URI value from properties file
// we need properties object
//with help of consutructor we can assign the value

{
	Properties pr;
    public HttpMethods(Properties pr)
    {
	this.pr=pr;
    }

    public Response postmethod(String bodydata,String urikey)
    {
    	Response res=
    	given()
    	.contentType(ContentType.JSON)
    	.body(bodydata)
    	.when()
    	.post(pr.getProperty(urikey));
    	return res;
    	
    	
    	
    }
    
		public Response getmethod(String urikey,String id)
		{
			String Uri=pr.getProperty(urikey)+"/"+id;
			Response res=given()
			.contentType(ContentType.JSON)
			.when()
			.get(Uri);
			return res;
		}
		
		
		public Response getallmethod(String urikey)
		{
			Response res=given()
			.contentType(ContentType.JSON)
			.when()
			.get(pr.getProperty(urikey));
			
			
		return res;
		}
    	
		public Response UpdateRecord(String bodydata,String urikey,String idValue)
		{
			String uri=pr.getProperty(urikey)+"/"+idValue;
			Response res=given() 
			.contentType(ContentType.JSON)
			.body(bodydata)
			.when()
			.put(uri);
			
		    return res;
		}
		public Response getusernamemethod(String urikey)
		{
			Response res=given()
			.contentType(ContentType.JSON)
			.when()
			.get(urikey);
		return res;
		}
		
		public Response deleteRequest(String urikey,String id)
		{
			String Uri=pr.getProperty(urikey)+"/"+id;
			Response res=given()
			.contentType(ContentType.JSON)
			.when()
			.delete(Uri);
			return res;
		}
    	
    }

