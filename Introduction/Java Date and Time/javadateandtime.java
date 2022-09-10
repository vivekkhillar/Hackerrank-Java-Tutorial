import static java.lang.System.out;
import java.time.LocalDate;

import java.util.Scanner;

public class javadateandtime {

public static void main(String[] args) {
    Scanner cal = new Scanner(System.in);
    int month = cal.nextInt();
    int day = cal.nextInt();
    int year = cal.nextInt();
    LocalDate date = LocalDate.of(year, month, day);
    out.println(date.getDayOfWeek());
}
}