/**
 * @author sumit
 * Parses and evaluates expressions using a grammar-based interpretation model.
 */

package com.design.patterns.behavioral.interpreter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterpreterDemo {

    final static Logger log = LoggerFactory.getLogger(InterpreterDemo.class);

    public static void main(String[] args) {
        Format format = new Format();
        format.setFormat("MM-DD-YYYY");
        format.setDate(new Date());
        List<AbstractFormat> formatOrderList = getFormatOrder(format);
        log.info("Input : {} : {}", format.getFormat(), new Date());
        for (AbstractFormat abstractFormat : formatOrderList) {
            abstractFormat.execute(format);
            log.info("Output : {}", format.getFormat());
        }
    }

    private static ArrayList getFormatOrder(Format format) {
        ArrayList formatOrderList = new ArrayList();
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