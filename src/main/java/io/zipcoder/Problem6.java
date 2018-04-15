package io.zipcoder;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.singletonList;

public class Problem6 {
    public static void main(String[] args) {
        String one = "5:22pm";
        List<String> inputList = singletonList(one);
        List<String> resultList = new ArrayList<String>();

        while (inputList.iterator().hasNext()) {
            String next = inputList.iterator().next();
            StringBuilder sb = new StringBuilder();

            try {
                sb.append(MilitaryTimeReporter.reportTime(next));
            } catch (ParseException pe) {
                sb.append(pe.getMessage());
            }

            sb.append("\n");
            resultList.add(sb.toString());
        }

        resultList.forEach(System.out::println);
    }
}
