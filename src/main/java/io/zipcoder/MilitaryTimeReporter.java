package io.zipcoder;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

/**
 * project: InterviewProblem5
 * package: io.zipcoder
 * author: https://github.com/vvmk
 * date: 4/15/18
 */
public class MilitaryTimeReporter {
    private static final String READ_FORMAT = "hh:mmaa";
    private static final String WRITE_FORMAT = "HH:mm";

    public MilitaryTimeReporter() {
    }

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

    protected static String wordifyMilitaryTime(String time) {
        StringBuilder sb = new StringBuilder();

        String[] results = Pattern.compile("(\\d{2})")
                .matcher(time)
                .results()
                .map(MatchResult::group)
                .toArray(String[]::new);

        sb.append(wordify(results[0]));
        sb.append("HUNDRED ");
        sb.append(wordify(results[1]));
        sb.append("HOURS");

        return sb.toString();
    }

    protected static String wordify(String numberString) {
        StringBuilder sb = new StringBuilder();

        Integer tens = Integer.parseInt(numberString.substring(0, 1));
        Integer ones = Integer.parseInt(numberString.substring(1));

        try {
            if (tens == 0) {
                sb.append(NumberString.getStringForDigit(tens));
                sb.append(NumberString.getStringForDigit(ones));
            } else if (tens == 1 || ones == 0) {
                sb.append(NumberString.getStringForDigit(Integer.parseInt(numberString)));
            } else {
                sb.append(NumberString.getStringForDigit(tens * 10));
                sb.append(NumberString.getStringForDigit(ones));
            }
            return sb.toString();
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
            return " [" + numberString + "]";
        }
    }
}
