
package ex2;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class DateUtils {
	
	
	/**
	 * Constructor
	 */
	private DateUtils(){
		
	}

	/**
	 * Methods
	 * @param date
	 * @return the date in string
	 */
	public static String format(Date date){
		if(date==null){
			return null;
		}
		return (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")).format(date);
	}
	
	/**
	 * Methods
	 * @param date
	 * @return the date in date with new format
	 * @throws ParseException
	 */
	public static Date parse(Date date) throws ParseException{
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return f.parse(format(date));
	}
}
