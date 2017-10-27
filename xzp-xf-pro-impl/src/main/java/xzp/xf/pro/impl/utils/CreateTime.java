package xzp.xf.pro.impl.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CreateTime {
	
		private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		private static Date date = new Date();
	
		public static String getYes(){
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.DAY_OF_MONTH, -1);
			String yes = simpleDateFormat.format(calendar.getTime());
			return yes;
		}
		
		public static String getNow(){
			String now = simpleDateFormat.format(date);
			return now;
		}
}
