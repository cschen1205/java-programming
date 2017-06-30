package com.github.cschen1205.jp.chap05;

/**
 * Created by memeanalytics on 30/6/17.
 * Given a (decimal - e g  3 72) number that is passed in as a string, print the binary representation
 * If the number can not be represented accurately in binary, print “ERROR”
 */
public class Q02 {
    public static String printBinary(String n) {
        int intPart = Integer.parseInt(n.substring(n.indexOf(".")));
        double decPart = Double.parseDouble(n.substring(n.indexOf("."), n.length()));

        String int_string = "";
        while(intPart > 0){
            int r = intPart % 2;
            intPart /= 2;
            int_string =r + int_string;
        }
        String dec_string = "";
        while(decPart > 0) {
            if(dec_string.length() > 32) return "ERROR";
            if(decPart == 1) {
                dec_string = dec_string + (int)decPart;
            }
            decPart *= 2;
            if(decPart >= 1) {
                dec_string = dec_string + 1;
                decPart -= 1;
            } else {
                dec_string = dec_string + 0;
            }
        }

        return int_string + "." + dec_string;
    }
}
