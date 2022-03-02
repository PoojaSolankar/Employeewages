package com.Bridgelabz;
import java.lang.Math.*;

public class Employee 
{

	public static void main(String[] args)
	{
<<<<<<< Updated upstream
      System.out.println("Welcome");
 
      int max = 4;
      int min = 0;
      int range = max - min +0;
      int fulldayhour=8;
      int workingHour=0;
      int employeewageperHour=20;
      for (int i=0; i<4; i++);
      {
    	  int rand = (int)(Math.random() * range) + min;
    	  System.out.println(rand);
    	  
    	      switch(rand) 
    	        {
    	  
    	           case 0: System.out.println("Emploee is absent");
    	                    workingHour=0;
                            System.out.println("wokingHour is" +workingHour);
    	                    break;
    	  
    	           case 1: System.out.println("Employee is present");
    	                    workingHour=8;
    	                    employeewageperHour=20;		
    	                    System.out.println("wokingHour is : " +workingHour);
    	                    System.out.println("employeewageperHour is : " +employeewageperHour);
    	                    break;
    	                    
    	           case 2: System.out.println("Employee is working as part time");
                            workingHour=8;
                             System.out.println("wokingHour is : " +workingHour);
                              break;
                              
    	           default:  System.out.println("end of the case");
    	                     break;
    	       }
      }
   
	}
=======
		
	  int workingHours;
      int Employeewag;
      System.out.println("Welcome to Employee Wages");
        
     int randomVal = (int)Math.floor(Math.random()*10) %3;
      
     System.out.println("Random value:"+randomVal);
   
     if(randomVal ==1) 
     {
    	 
           System.out.println("Employee is Present");
           workingHours=8;
           System.out.println("Working hours :"+workingHours);
           Employeewag=workingHours*WAGE_PER_HOURS;
           System.out.println("Employeewag is :"+Employeewag);
     }
     else if(randomVal==2)
     {
    	 System.out.println("Employee Working as Part Time");
    	 workingHours=4;
         System.out.println("Working hours :"+workingHours);
         Employeewag=workingHours*WAGE_PER_HOURS;
         System.out.println("Employeewag is :"+Employeewag);
     }
     else {
           System.out.println("Employee is Absent");
           workingHours=0;
           System.out.println("Working hours :"+workingHours);
     
     
     }
   }
>>>>>>> Stashed changes
}
