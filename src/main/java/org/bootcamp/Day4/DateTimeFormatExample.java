package org.bootcamp.Day4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class DateTimeFormatExample {
    public static void main(String[] args) {

//        Intro to Locale :)
        Locale locale = new Locale("en", "UK");
        var dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        var timeFormat = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
        String date = dateFormat.format(new Date());
        String time = timeFormat.format(new Date());
        System.out.println("Time: " + time + " Date: " + date);

//        If we already know the usecase pattern for our date, then what Example
        String pattern = "dd-MM-yyyy";
        var myFormat = new SimpleDateFormat(pattern);
        String myCustomDate = myFormat.format(new Date());
        System.out.println(myCustomDate);

//        getDefault Example
        var defaultLocale = Locale.getDefault();
        var myDefaultFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, defaultLocale);
        String myDefaultDate = myDefaultFormat.format(new Date());
        System.out.println("My Default Date: " + myDefaultDate);

//        Parsing Example
        var dateParseExample = LocalDate.parse("2024-02-23");
        System.out.println("Parsed Date: " + dateParseExample);
    }
}
