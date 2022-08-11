package day33_ArrayList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DateTimePractice {

    public static void main(String[] args) {


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E, hh:mm a, MMMM/dd/yyyy");
        LocalDateTime d1 = LocalDateTime.of(2020, 11, 24, 13, 0);
        System.out.println(d1.format(dtf).replaceFirst("PM","pm"));

        System.out.println("===========================");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-dd, EEEE");

        LocalDate[] days = new LocalDate[10];

        for (int i = 0; i <= days.length-1; i++){
            days[i] = LocalDate.now().plusDays(i+1);

        }

        System.out.println(Arrays.toString(days));

        for (LocalDate each : days){
            System.out.println(each.format(df));
        }

        System.out.println("============================");

        String[] friends = {"Polina", "Serhii", "Aziz", "Halzat", "Abdujilil", "Ayse"};
        LocalDate[] dOfB = {
                LocalDate.of(1991,9,25),
                LocalDate.of(1990,11,23),
                LocalDate.of(1995,02,10),
                LocalDate.of(2000,03,15),
                LocalDate.of(2005,04,20),
                LocalDate.of(2010,05,25)
        };

        String nameOfOlder = friends[0];
        LocalDate older = dOfB[0];

        String nameOfYoungest =friends[0];
        LocalDate younger = dOfB[0];

        for (int i = 0; i <= dOfB.length-1; i++){

            if (dOfB[i].isBefore(older) ){
                older = dOfB[i];
                nameOfOlder = friends[i];
            }

            if ( dOfB[i].isBefore(younger)){
                younger = dOfB[i];
                nameOfYoungest =friends[i];

            }

        }

        System.out.println(nameOfOlder+" : "+older);
        System.out.println(nameOfYoungest+" : "+younger);






    }



}
