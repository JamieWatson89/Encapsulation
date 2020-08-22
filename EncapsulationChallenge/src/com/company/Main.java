package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(0,false);

       int printPages = printer.printPages(5);
        System.out.println("Number of pages printred is " +printPages +
                " Toner level " + printer.getTonerLevel() + "%" );

        printPages = printer.printPages(10);

        System.out.println("Number of pages printed is : " + printPages +
                " and printer count is " + printer.getNumberOfPagesPrinted());



        System.out.println("Toner level  is " + printer.getTonerLevel()+"%");

        }
}
