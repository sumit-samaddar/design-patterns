package com.sam.design.patterns.behavioral.interpreter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class InterpreterDesignPattern {

    public static void main(String[] args) {

        //System.out.println("Please select the Date Format: 'MM-DD-YYYY' or 'YYYY-MM-DD' or 'DD-MM-YYYY' ");
        //Scanner scanner = new Scanner(System.in);
        //String inputDate = scanner.next();

        Format format = new Format();
        format.setFormat("MM-DD-YYYY");
        format.setDate(new Date());

        List<AbstractFormat> formatOrderList = getFormatOrder(format);

        System.out.println("Input : " + format.getFormat() + " : " + new Date());

        for (AbstractFormat abstractFormat : formatOrderList) {
            abstractFormat.execute(format);
            System.out.println(abstractFormat.getClass().getName() + " Executed:" + format.getFormat());

        }

        System.out.println("Output : " + format.getFormat());
    }

    private static ArrayList getFormatOrder(Format format) {
        ArrayList formatOrderList = new
                ArrayList();
        String[] strArray = format.getFormat().split("-");
        for (String string : strArray) {
            if (string.equalsIgnoreCase("MM")) {
                formatOrderList.add(new MonthFormat());
            } else if (string.equalsIgnoreCase("DD")) {
                formatOrderList.add(new DayFormat());
            } else {
                formatOrderList.add(new YearFormat());
            }

        }
        return formatOrderList;
    }

}