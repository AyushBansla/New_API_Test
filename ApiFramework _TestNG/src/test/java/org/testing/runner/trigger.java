package org.testing.runner;

import java.io.IOException;

import org.testing.TestCases.TC1;
import org.testing.TestCases.TC2;
import org.testing.TestCases.TC3;


public class trigger 
{
     public static void main(String[]args) throws IOException
     {
    	 TC1 tc1=new TC1();
    	 tc1.TestCase1();
    	 
    	 TC2 tc2=new TC2();
    	 tc2.TestCase2();
    	 
    	 TC3 tc3=new TC3();
    	 tc3.TestCase3();
     }
}
