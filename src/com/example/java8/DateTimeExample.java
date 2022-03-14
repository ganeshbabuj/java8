package com.example.java8;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;
import java.util.List;

public class DateTimeExample {

    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2021, 11, 20);
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalDate lastWeek = LocalDate.now().minus(1, ChronoUnit.WEEKS);

        LocalDateTime now = LocalDateTime.now();
        now.plusDays(5).plusHours(5);

        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
        System.out.println(zonedDateTime);

        LocalDate startDate = LocalDate.of(2021,11,10);
        LocalDate endDate = LocalDate.now();
        Period period = Period.between(startDate, endDate);
        System.out.println("Period: " + period);

        // NOT total days.
        long daysOfPeriod = Period.between(startDate, endDate).get(ChronoUnit.DAYS);
        System.out.println(daysOfPeriod);
        System.out.println(period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");

        // Total days
        long betweenDays = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println(betweenDays + " total days");

        System.out.println("\n=================\n");

        LocalDateTime startDateTime = LocalDateTime.of(2021,11,10,5,20, 30);
        LocalDateTime endDateTime = LocalDateTime.now();
        long duration = Duration.between(startDateTime, endDateTime).getSeconds();
        System.out.println(duration + " seconds");

        // Current epoch nano seconds
        Instant instant = Instant.now();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
        LocalDateTime firstDayOfMonth = localDateTime.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfMonth);



    }
}
