/**
 * Interpreter Pattern Demo
 *
 * Intent: Define a grammar for a simple language and provide an interpreter that processes
 * sentences (expressions) in that language.
 *
 * How it works here:
 *   - The "language" is a date format string like "MM-DD-YYYY".
 *   - Format is the context object: it holds the format string and the Date to be formatted.
 *   - AbstractFormat is the abstract expression; MonthFormat, DayFormat, YearFormat are terminal
 *     expressions — each knows how to replace its token (MM, DD, YYYY) with the actual date part.
 *   - getFormatOrder() parses the format string by splitting on "-" and maps each token to the
 *     corresponding expression object — this builds the list of interpreters in the right order.
 *   - Each expression's execute(format) replaces its token in-place on the format string inside
 *     the context object, so each log line shows the string progressively replaced.
 *
 * Example: "MM-DD-YYYY" → "08-DD-YYYY" → "08-28-YYYY" → "08-28-2026"
 *
 * @author sumit
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
        // Context: holds the format template and the date to interpolate into it
        Format format = new Format();
        format.setFormat("MM-DD-YYYY");
        format.setDate(new Date());

        // Parse the format string into an ordered list of expression objects
        List<AbstractFormat> formatOrderList = getFormatOrder(format);

        log.info("Input : {} : {}", format.getFormat(), new Date());

        // Each expression replaces its own token in the context string
        for (AbstractFormat abstractFormat : formatOrderList) {
            abstractFormat.execute(format);
            log.info("Output : {}", format.getFormat()); // shows partial replacement after each step
        }
    }

    // Maps each token in the format string to its corresponding terminal expression
    private static ArrayList getFormatOrder(Format format) {
        ArrayList formatOrderList = new ArrayList();
        String[] strArray = format.getFormat().split("-");
        for (String string : strArray) {
            if (string.equalsIgnoreCase("MM")) {
                formatOrderList.add(new MonthFormat());
            } else if (string.equalsIgnoreCase("DD")) {
                formatOrderList.add(new DayFormat());
            } else {
                formatOrderList.add(new YearFormat()); // covers "YYYY" and any unrecognised token
            }
        }
        return formatOrderList;
    }

}