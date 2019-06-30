import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class Solution {
    public static String getDay(String day, String month, String year) {
        String days[] = {"", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month)-1;
        int d = Integer.parseInt(day)-1;
        
        Calendar cal = new GregorianCalendar(y,m,d);
        
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        
        return days[dayOfWeek];
    }