package io.zipcoder;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * project: InterviewProblem5
 * package: io.zipcoder
 * author: https://github.com/vvmk
 * date: 4/15/18
 */

class MilitaryTimeReporterTest {

    @Test
    void testFormatToMilitaryTimeAm() throws ParseException {
        Date input = new SimpleDateFormat("hh:mmaa").parse("5:34am");

        String expected = "05:34";
        String actual = MilitaryTimeReporter.formatToMilitaryTime(input);

        assertEquals(expected, actual);
    }

    @Test
    void testFormatToMilitaryTimePm() throws ParseException {
        Date input = new SimpleDateFormat("hh:mmaa").parse("5:34pm");


        String expected = "17:34";
        String actual = MilitaryTimeReporter.formatToMilitaryTime(input);

        assertEquals(expected, actual);
    }

    @Test
    void testWordifyMilitaryTimeAm() throws ParseException {
        String input = "05:34";

        String expected = "ZERO FIVE HUNDRED THIRTY FOUR HOURS";
        String actual = MilitaryTimeReporter.reportTime(input);

        assertEquals(expected, actual);
    }

    @Test
    void testWordifyMilitaryTimePm() throws ParseException {
        String input = "23:58";

        String expected = "TWENTY THREE HUNDRED FIFTY EIGHT HOURS";
        String actual = MilitaryTimeReporter.reportTime(input);

        assertEquals(expected, actual);
    }

    @Test
    void testWordifyMilitaryTimeTwelve() throws ParseException {
        String input = "12:47";

        String expected = "TWELVE HUNDRED FORTY SEVEN HOURS";
        String actual = MilitaryTimeReporter.reportTime(input);

        assertEquals(expected, actual);
    }
}