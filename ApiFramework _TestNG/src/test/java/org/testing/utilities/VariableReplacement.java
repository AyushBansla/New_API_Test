package org.testing.utilities;

import java.util.regex.Pattern;

public class VariableReplacement 
{
   public static String assignValue(String data,String variableName,String variableValue)
   {
	   data=data.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
	   return data;
   }
}
