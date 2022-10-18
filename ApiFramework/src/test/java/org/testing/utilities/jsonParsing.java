package org.testing.utilities;

import java.util.Random;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonParsing 
{
	//we call this method in TC1 
	 public static String jsonparse(String response,String keyName)
	 {
		 JSONObject ob=new JSONObject(response); 
		 return ob.getString(keyName);
	 }
	 public static void jsonparseAllid(String response,String keyName)
	 {
		 JSONArray js=new JSONArray(response);
		 int l=js.length();
		 
		 for (int i=0;i<l;i++) 
		 {
			 JSONObject ob=js.getJSONObject(i);
			 System.out.println("Id value is" +ob.getString(keyName));
		 }
	 }
	 
	 public static void jsonparseAllkey(String response,String keyName)
	 {
		 JSONArray js=new JSONArray(response);
		 int l=js.length();
		 
		 for (int i=0;i<l;i++) 
		 {
			 JSONObject ob=js.getJSONObject(i);
			 System.out.println(ob.get(keyName));
		 }
	 }
	 
	 public static String JsonParseOnlineAPI(String ResponseData, String Keyname)
		{
			JSONObject ob=new JSONObject(ResponseData);
			JSONArray array=ob.getJSONArray("data");
			int L=array.length();
			for(int i=0;i<L;i++)
			{
				JSONObject obinner=array.getJSONObject(i);
				System.out.println("Id value is : "+obinner.get(Keyname)) ;
			}
			Random random = new Random();
		    int rndmValue= random.nextInt(L - 1) + 1;
			JSONObject obinner=array.getJSONObject(rndmValue);
			String id= obinner.get(Keyname).toString();
			return id;
			
		}
}
