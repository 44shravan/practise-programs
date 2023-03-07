package ppd.practise1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		
Date endDate = Date.from(Instant.now());

System.out.println(endDate);
		
		Date startDate = DateUtils.addHours(endDate, -24);
		System.out.println(startDate);
		
		String[] s= {"Shravan.Kumar@globalaes.com"};
		System.out.println(s[0]);
		
		Date endDate1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("14-09-2021 07:23:03");
		
		System.out.println(endDate1);
		
		String s2 ="msk@gmail.com";
		
		String[] s3= s2.split(",");
		System.out.println(s3[0]);
		
	}
	
}
