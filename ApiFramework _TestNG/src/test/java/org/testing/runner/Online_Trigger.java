package org.testing.runner;

import java.io.IOException;

import org.testing.TestCases.TC6_Online;
import org.testing.TestCases.TC7_Get_Online;
import org.testing.TestCases.TC8_Get_Particular_Record;
import org.testing.TestCases.TC9_Updaterecord_Online;

public class Online_Trigger
{
	public static void main(String[]args) throws IOException, InterruptedException
    {
		 
		TC6_Online tc6=new TC6_Online();
  	    tc6.TC6_PostReqOnlineAPI();
  	    Thread.sleep(3000);
   	    TC7_Get_Online tc7=new TC7_Get_Online();
	    tc7.TC7_AllRecords();
	    Thread.sleep(3000);
	    TC8_Get_Particular_Record  tc8=new TC8_Get_Particular_Record ();
	    tc8.TC8_GetParticularRecdOnlnAPI();
	    Thread.sleep(3000);
	    TC9_Updaterecord_Online tc9=new TC9_Updaterecord_Online();
	    tc9.TC9_Updateparticular();
	
    }
}
