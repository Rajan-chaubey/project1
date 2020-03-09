package com.cognizant.truyum.util;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class DateUtil {
	public static Date convertToDate(String s)
	{
		SimpleDateFormat simpleDateFormat =new  SimpleDateFormat("dd/mm/yyyy");
	
	Date date1;
	try
	{
		date1=simpleDateFormat.parse(s);
		return date1;
		
	}catch(ParseException e)
	{
		e.printStackTrace();
	}
	return null;
}

}
