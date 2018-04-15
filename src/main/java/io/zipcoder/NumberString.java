package io.zipcoder;

/**
 * project: InterviewProblem5
 * package: io.zipcoder
 * author: https://github.com/vvmk
 * date: 4/15/18
 */
public enum NumberString {
    ZERO(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    ELEVEN(11),
    TWELVE(12),
    THIRTEEN(13),
    FOURTEEN(14),
    FIFTEEN(15),
    SIXTEEN(16),
    SEVENTEEN(17),
    EIGHTEEN(18),
    NINETEEN(19),
    TWENTY(20),
    THIRTY(30),
    FORTY(40),
    FIFTY(50);

    private Integer digit;

    NumberString(Integer digit) {
        this.digit = digit;
    }

    public static String getStringForDigit(Integer match) throws RuntimeException {
        for (NumberString ns : NumberString.values()) {
            if (ns.digit.equals(match))
                return ns.toString() + " ";
        }
        throw new RuntimeException("error finding string for : " + match);
    }
}
