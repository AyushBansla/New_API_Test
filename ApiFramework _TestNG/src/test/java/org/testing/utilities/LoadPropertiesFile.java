package org.testing.utilities;

import java.io.File;
//It is non void method
//we are taking file path because of input and if give path here then there is limitation
//

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LoadPropertiesFile
{
	//input------properties file location
	//output-----it will return object of properties class
     public static  Properties propertiesfile(String path) throws IOException
     {
    	 
    	 File f=new File(path);
    	 FileReader fr=new FileReader(f);
    	 Properties pr=new Properties();
    	 pr.load(fr);
		 return pr;
    	 
    	 
     }
}
