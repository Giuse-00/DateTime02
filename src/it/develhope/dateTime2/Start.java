package it.develhope.dateTime2;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Start {

    public static void main(String[] args) {

        LocalDateTime time = LocalDateTime.now();

        DateTimeFormatter t = DateTimeFormatter.ofPattern("dd-MMMM-yy HH:mm");

        System.out.println("Formatted time = " + time.format(t));

        ZonedDateTime newOne = ZonedDateTime.now();

        DateTimeFormatter x = DateTimeFormatter.ISO_ZONED_DATE_TIME;

        System.out.println("ISO Zoned Date Time = " + newOne.format(x));
    }
}
