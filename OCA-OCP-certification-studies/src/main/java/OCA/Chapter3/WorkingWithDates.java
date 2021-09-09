package OCA.Chapter3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/*
* Page 139, working with dates and times.
* */
public class WorkingWithDates {

    //ways of creating  Date
    LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
    LocalDate date2 = LocalDate.of(2015, 01, 20);

    private static void performAnimalEnricment(LocalDate start, LocalDate end, Period period){
        LocalDate upTo = start;
        while(upTo.isBefore(end)){
            System.out.println("give new toy: " +upTo);
            upTo = upTo.plus(period);
        }
    }

    public void walk2(){return;}
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1);
        performAnimalEnricment(start,end,period);


        // Paring dates and Times..

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2015", f);

        LocalTime time = LocalTime.parse("11:22");
        System.out.println(date);
        System.out.println(time);
    }



}
