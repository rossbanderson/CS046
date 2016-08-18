package xyz.rossanderson.cs046.sallyride;
// BlueJ project: dayOfTheWeek
// Video: Day of the Week

public class WhatDayWillItBe
{
    public static void dayOfWeek(Day finalDay)
    {
        // Please do not change the name of this variable
        // We may change this value when we run your program
        // It will always be a date >= January 1, 1900
//        Day finalDay = new Day(1989, 7, 1);
        Day startDay = new Day(1900,1,1);

        // System.out.print(startDay);
        int numberOfDays = finalDay.daysFrom(startDay);

        int weekday = ((numberOfDays)+1)%7;

        // January 1, 1900 was a Monday
        // Compute the number of days from that day until the birthday
        // Compute the weekday: 0 - Sunday, 1 - Monday, ..., 6 - Saturday

        System.out.print("Weekday: ");
        System.out.println(weekday);
    }
}
