package DateClassConcepts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {

		Date dt= new Date();
		
	   SimpleDateFormat sdf= new SimpleDateFormat("mm/dd/yyyy");
	   SimpleDateFormat sd= new SimpleDateFormat("mm/dd/yyyy  hh:mm:ss");
	   
	   
		System.out.println(sdf.format(dt));
		System.out.println(dt.toString());
		System.out.println(sd.format(dt));
	}

}
