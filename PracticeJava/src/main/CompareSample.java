package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompareSample {
//    public static final Pattern FORMAT_PATTERN = Pattern.compile("([0-9]{1,5},?){1,5}$");
    public static final Pattern FORMAT_PATTERN = Pattern.compile("([0-9]{1,5})(,+([0-9]{1,5})){0,4}");
    public static void main(String[] args) {

//        printMach("aaaaab");
        printMach("1");
        printMach("1,2,3,4,5");
        printMach("1,2,3,4,5,6");
        printMach("12345");
        printMach("123456");
        printMach("12345,");
        printMach("12345,12345");
        printMach("12345,12345,12345,12345,12345");
        printMach("12345,12345,12345,12345,12345,12345");
        printMach("123456,12345,12345,12345,12345,12345");
    }

    private static void printMach(String data) {
        Matcher matcher = FORMAT_PATTERN.matcher(data);

        System.out.println(data + " : " + matcher.matches());

    }
}
