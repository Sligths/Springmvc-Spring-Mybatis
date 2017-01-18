package com.tiobe.utill;

import java.text.DateFormat;
import java.util.Date;

/**
* Title: DateFormmat
* Description: 
* Team: SSflow
* @author Ss
* @date 2017年1月6日
*
*/
public class SimpleDateFormat{
	/**
	 * 时间格式转换
	 * @param date
	 * Date to yyyy-MM-dd HH:mm:ss
	 */
	public String DateToString(Date date){
		DateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}
	/**
	 * 时间格式转换
	 * @param date
	 * ate to yyyy-MM-dd
	 */
	public String DateToDay(Date date){
		DateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(date);
		
	}
	
}
