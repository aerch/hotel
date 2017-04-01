package rf.erchenko;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by 1 on 08.10.2016.
 */
public class DateTimeUtils {
    private static final Date currentdate = new Date();

    public void DateTimeUtils() {

    }

    public static Date addDays(int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentdate);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
    }

    public static Date addDaysToDate(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
    }

    public static String addDateToStr(int days) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.YYYY");
        return dateFormat.format(addDays(days)).toString();
    }

    public static String addHeaderDateToStr(int days) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM");
        return dateFormat.format(addDays(days)).toString();
    }

}
