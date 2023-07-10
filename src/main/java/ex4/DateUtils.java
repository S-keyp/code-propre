package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static String format(Date date, String... options) {
		SimpleDateFormat formateur = new SimpleDateFormat();
		if(options.length > 0) {
			formateur.applyPattern(options[0]);
		}else{
			formateur.applyPattern("dd/MM/yyyy HH:mm:ss");
		}
		return formateur.format(date);
	}
}
