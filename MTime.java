
import java.util.Scanner;

public class MTime 
{
int Hours;
int Minutes;
int Seconds;
Scanner myObj = new Scanner(System.in);
MTime()
{
	Hours=0;
	Minutes=0;
	Seconds=0;
}
MTime(int h,int m,int s)
{
	h=Hours;
	m=Minutes;
	s=Seconds;
}
void SetTime()
{
	System.out.println("Enter Hour: ");	
	Hours=myObj.nextInt();
	if(Hours>=0&&Hours<24)
	{
	System.out.println("Enter Minutes: ");
	Minutes=myObj.nextInt();
	  if(Minutes>=0&&Minutes<=59)
	  {
	System.out.println("Enter Seconds: ");
	Seconds=myObj.nextInt();
	   if(Seconds>=0&&Seconds<=59)
	   {
		System.out.print("Current Time:  ");
		System.out.println(+Hours+":"+Minutes+":"+Seconds);
	   }else
		{
		System.out.println("Please Enter in 24 Hour Format:  ");
	    SetTime();
		}
	   } else
		{
		System.out.println("Please Enter in 24 Hour Format:  ");
	    SetTime();
		}
	}else
		{
		System.out.println("Please Enter in 24 Hour Format:  ");
	    SetTime();
		}
}
void FormatTime1()//Displays Time in 12 Hour Format
{
	if(Hours>=12&&Hours<=24)
	{
		Hours=Hours-12;
	}
	else if(Hours>24)//if after Add_hours hours is > 24
	{
		Hours=Hours-24;
	}
	System.out.print("Time in 12 Hour Format:  ");
	System.out.println(+Hours+":"+Minutes+":"+Seconds+" am ");
}
void FormatTime2()//Displays Time in 24 Hour Format
{
System.out.print("Time in 24 Hour Format: ");
if(Hours>=24) //if after Add_hours hours is >=24
{
	Hours=Hours-24;
}
System.out.println(+Hours+":"+Minutes+":"+Seconds);
}

MTime Add_hours(int h)
{
MTime M=new MTime();
Hours=Hours+h;
System.out.print("Time After Adding Hours:  ");
System.out.println(+Hours+":"+Minutes+":"+Seconds);
return M;
}
MTime Add_mins(int m)
{
MTime M=new MTime();	
Minutes=Minutes+m; 
if(Minutes>59) //if sum is >= than 60
{
	Hours++;
	Minutes=Minutes-60;
}
System.out.print("Time After Adding Minutes:   ");
System.out.println(+Hours+":"+Minutes+":"+Seconds);
return M;
}

boolean equals(MTime t)
{
if(Hours==t.Hours)
{
	if(Minutes==t.Minutes)
	{
		if(Seconds==t.Seconds)
		{
			return true;
		}
		else
			return false;
	}
	else 
		return false;
}
else 
	return false;
}
}
