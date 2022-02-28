package com.Bridgelabz;
import java.lang.Math.*;

public class Employee 
{

	public static void main(String[] args)
	{
      System.out.println("Welcome");
 
      int max = 2;
      int min = 0;
      int range = max - min +0;
      
      for (int i=0; i<=10; i++);
      {
    	  int rand = (int)(Math.random() * range) + min;
    	  System.out.println(rand);
    	  
    	      switch(rand) 
    	        {
    	  
    	           case 0: System.out.println("Emploee is absent");
    	                    break;
    	  
    	           case 1: System.out.println("Employee is present");
    	                    break;
    	  
    	           default:  System.out.println("end of the case");
    	                     break;
    	       }
      }
   
	}
}
