package wtc;

import java.io.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
class fin
{
public static void main(String[] args)throws IOException
{
	Calendar cal = Calendar.getInstance(); // to get a calendar using the current time zone and locale of the system.
	int m1=0;
	int m=0;
	int h1=0;
	int inp=0;
	int hd=0;
	int md=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); //used to format a given date into Date/Time string
	Date date = new Date(); //Creates date object representing current date and time.
	System.out.println(dateFormat.format(date)); //formats a date into date/time string.
	String s_date = dateFormat.format(date); //storing in a string
	// The code just get the year alone in Integer
	String y=(s_date.substring(10)); //current year
	int h=Integer.parseInt(y.substring(1,3)); //hour
	m=Integer.parseInt(y.substring(4,6)); //minutes
	System.out.println("PRESS THE CORRESPONDING NUMBER BEFORE THE COUNTRY TO GET THE TIME,DATE AND THE CURRENT TIME :");
	System.out.println("1.JAPAN");
	System.out.println("2.CHINA");
	System.out.println("3.BANGLADESH");
	System.out.println("4.MALAYSIA");
	System.out.println("5.KOREA");
	System.out.println("6.THAILAND");
	inp=Integer.parseInt(br.readLine());
	switch(inp)
	{
		case 1:
		hd=3;
		md=30;
		break;
		case 2:
			hd=2;
			md=30;
			break;
		case 3:
			hd=0;
			md=30;
			break;
		case 4:
			hd=2;
			md=30;
			break;
		case 5:
			hd=3 ;
			md=30;
			break;
		case 6:
			hd=1;
			md=30;
			break;
	}
	if(h+hd>23)
	{	
		h1=(h+hd)-24;
	}
	else
	{
		h1=h+hd;
	}
	if(m>29)
	{
		m1=(m+md)-60;
		h1=h1+1;
		if(h1>=24)
		{
			h1=24-h1;
		}
	}
	else
	{
		m1=m+md;
	}
	if(h1>=0 && h1<h)
	{
		cal.add(Calendar.DAY_OF_MONTH, 1);
		Date tomorrow = cal.getTime();
		if(h1/10==0) //for adding a 0 before a single digit hour.
			System.out.println("0"+h1+":"+m1+" "+(dateFormat.format(tomorrow)));
		else
			System.out.println(h1+":"+m1+" "+(dateFormat.format(tomorrow)));
	}
	else
	{
		System.out.println(h1+":"+m1+" "+(dateFormat.format(date)));
	}
}	
}

