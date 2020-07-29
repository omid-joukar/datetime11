import java.time.YearMonth;
import java.util.Calendar;

/**
 * Created by KPS on 7/29/2020.
 */
public class Main {
    public static void main(String []args){
        Calendar cal = Calendar.getInstance();
        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println();
        System.out.println("Number of days of the current month : " + days);
        System.out.println();
    }
}
