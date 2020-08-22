package com.company;

public class Printer {

    private int tonerLevel = 100;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int numberOfPagesPrinted, boolean isDuplexPrinter) {
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillToner(int fillToner){
        if((tonerLevel + fillToner > 100)){
            this.tonerLevel = 100;
        }else{
            this.tonerLevel += fillToner;
        }
    }

    public int printPages(int pagesPrinted){
        int printedpages = 0;
        if(isDuplexPrinter){
            printedpages = (pagesPrinted/2)+(pagesPrinted % 2);
            numberOfPagesPrinted += ((pagesPrinted/2)+(pagesPrinted % 2));
            tonerLevel -= printedpages*2;
            return  printedpages;
        }else{
            printedpages = pagesPrinted;
            numberOfPagesPrinted += pagesPrinted;
            tonerLevel -= printedpages;
            return printedpages;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
