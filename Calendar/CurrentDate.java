
import java.util.Calendar;

public class CurrentDate {

    public static void main(String args[]) {
        Calendar cal = Calendar.getInstance();
        // System.out.print(cal);

        // System.out.println(cal.getTime());

        // int year=cal.get(Calendar.YEAR);
        // int month=cal.get(Calendar.MONTH)+1;
        // int day=cal.get(Calendar.DATE);

        // System.out.println(day+" "+month+" "+year);

        // Sunday - 1, Saturday - 7
        // int day=cal.get(Calendar.DAY_OF_WEEK);
        // System.out.println(day);

        int hour=cal.get(Calendar.HOUR_OF_DAY);
        int minute=cal.get(Calendar.MINUTE);
        int second=cal.get(Calendar.SECOND);

        System.out.println(hour+" : "+minute+" : "+second);



    }
}
