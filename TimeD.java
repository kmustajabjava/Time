import java.util.Scanner;
public class TimeD 
{
	public static void main(String[] args)
	{
    int choice;
    Scanner myObj = new Scanner(System.in);
    MTime M1=new MTime();
    MTime M2=new MTime();
    
    do
	   {
		   System.out.println("Enter 1 to Set Time");
		   System.out.println("Enter 2 Display Time in 24 hour Format");
		   System.out.println("Enter 3 Display Time in 12 hour Format");
		   System.out.println("Enter 4 To Add Hours in the Time Entered");
		   System.out.println("Enter 5 To Add Minutes in the Time Entered");
		   System.out.println("Enter 6 To Find If Two times are Equal Or Not");
		   System.out.println("Enter 0 for exit");
		   choice=myObj.nextInt();
		   if(choice==1)
		   {
			   M1.SetTime();
		   }
		   else if(choice==2)
		   {
			   M1.FormatTime2();
		   }
		   else if(choice==3)
		   {
			   M1.FormatTime1();
		   }
		    else if(choice==4)
		   {
		    	System.out.println("Enter Hours You Want To Add in: ");
		    	int h=myObj.nextInt();	
			    M1.Add_hours(h);
		   }
		    else if(choice==5)
			   {
		    	  System.out.println("Enter Minutes You Want To Add in: ");
				  int m=myObj.nextInt();
				  M1.Add_mins(m);
			   }
		    else if(choice==6)
			   {
		    	System.out.println("Enter Time1: ");
		    	  M1.SetTime();
		    	System.out.println("Enter Time2: ");
		    	  M2.SetTime();
		    	  if(M1.equals(M2))
		    	  {
		    		  System.out.println("Times Are Equal");  
		    	  }
		    	  else
		    		  System.out.println("Times Are NOT Equal");    
			   }
		   else if(choice==0)
		   {
		           System.out.println("Thank You For Using Our Program");
		   }
		   else 
		   {
		           System.out.println("Enter The Right Choice");
		   }	   
		   
	   }while(choice!=0);
}
}
