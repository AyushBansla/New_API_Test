package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class json
{
	//purpose is to handle json file path
	//input------json file path
    public static String LoadJsonFile(String jsonfilepath) throws FileNotFoundException
    {
    	File f=new File(jsonfilepath);
    	FileReader fr=new FileReader(f);
    	JSONTokener j=new JSONTokener(fr);
    	JSONObject body=new JSONObject(j);
    	return body.toString();
    	
    }
}
