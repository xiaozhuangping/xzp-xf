package xzp.xf.pro.impl.utils;

import java.text.NumberFormat;

public class ZeroUtils {
    public static String returnAddedZero(int num, int length) {
        if (length == 0) {
            return String.valueOf(num);
        }
        NumberFormat nf = NumberFormat.getInstance();

        nf.setGroupingUsed(false);

        nf.setMaximumIntegerDigits(length);

        nf.setMinimumIntegerDigits(length);

        return nf.format(num);
    }

    public static String returnAddedZero(String str, int length) {
        if (length == 0) {
            return str;
        }
        while (str.length() < length) {
            str = "0" + str;
        }
        return str;
    }
    public static boolean isNumeric(String str){
	  for (int i = str.length();--i>=0;){   
	   if (!Character.isDigit(str.charAt(i))){
	    return false;
	   }
	  }
	  return true;
	 }
}
