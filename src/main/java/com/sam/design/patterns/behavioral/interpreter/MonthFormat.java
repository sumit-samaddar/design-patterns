package com.sam.design.patterns.behavioral.interpreter;

import java.util.Date;

public class MonthFormat extends AbstractFormat {

    @Override
    public void execute(Format format) {
        String format1 = format.getFormat();
        Date date = format.getDate();
        Integer month = new Integer(date.getMonth() + 1);
        String tempFormat = format1.replaceAll("MM", month.toString());
        format.setFormat(tempFormat);
    }
}