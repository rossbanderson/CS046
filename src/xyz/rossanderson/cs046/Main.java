package xyz.rossanderson.cs046;

import xyz.rossanderson.cs046.Alice.Book;
import xyz.rossanderson.cs046.sallyride.Day;
import xyz.rossanderson.cs046.sallyride.WhatDayWillItBe;

public class Main {

    public static void main(String[] args) {
//        mainCreditCard();
//        mainSallyRide();

    private static void mainSallyRide()
    {
        WhatDayWillItBe.dayOfWeek(new Day(1955, 1, 19));
    }
    private static void mainCreditCard()
    {
        CreditCard myCard = new CreditCard();
        System.out.println(myCard.getBalance());
        myCard.purchase(20);
        System.out.println(myCard.getBalance());
        myCard.payment(5);
        System.out.println(myCard.getBalance());
        CreditCard otherCard = new CreditCard(1000);
        System.out.println(otherCard.getBalance());
        CreditCard thirdCard = new CreditCard("Visa", 500);
        System.out.println(thirdCard.getBalance());
        System.out.println(thirdCard.getName());
    }
}
