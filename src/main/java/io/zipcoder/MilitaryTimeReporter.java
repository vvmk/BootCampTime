package io.zipcoder;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * project: InterviewProblem5
 * package: io.zipcoder
 * author: https://github.com/vvmk
 * date: 4/15/18
 */
public class MilitaryTimeReporter {
    private static final String READ_FORMAT = "hh:mmaa";
    private static final String WRITE_FORMAT = "HH:mm";

    public MilitaryTimeReporter() {}

    public static String reportTime(String timeString) throws ParseException {
        Date raw = parseTime(timeString);
        String formattedTime = formatToMilitaryTime(raw);
        return wordifyMilitaryTime(formattedTime);
    }

    private static Date parseTime(String time) throws ParseException {
            DateFormat df = new SimpleDateFormat(READ_FORMAT);
            return df.parse(time);
    }

    protected static String formatToMilitaryTime(Date raw) {
        DateFormat df = new SimpleDateFormat(WRITE_FORMAT);
        return df.format(raw);
    }

    private static String wordifyMilitaryTime(String time) {
        return null;
    }
}
