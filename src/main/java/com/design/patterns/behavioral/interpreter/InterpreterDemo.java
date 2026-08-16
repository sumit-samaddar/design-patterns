package com.design.patterns.behavioral.interpreter;

import com.design.patterns.behavioral.state.DeliveredState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterpreterPattern {

    final static Logger log = LoggerFactory.getLogger(DeliveredState.class);

    public static void main(String[] args) {

        //System.out.println("Please select the Date Format: 'MM-DD-YYYY' or 'YYYY-MM-DD' or 'DD-MM-YYYY' ");
        //Scanner scanner = new Scanner(System.in);
        //String inputDate = scanner.next();

        Format format = new Format();
        format.setFormat("MM-DD-YYYY");
        format.setDate(new Date());

        List<AbstractFormat> formatOrderList = getFormatOrder(format);

        log.info("Input : " + format.getFormat() + " : " + new Date());

        for (AbstractFormat abstractFormat : formatOrderList) {
            abstractFormat.execute(format);
            log.info(abstractFormat.getClass().getName() + " Executed:" + format.getFormat());
        }
        log.info("Output : " + format.getFormat());
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