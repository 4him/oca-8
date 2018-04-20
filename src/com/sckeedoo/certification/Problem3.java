package com.sckeedoo.certification;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Problem3 {
    static int date = 87089709;
    /*
        Write a Java program to convert minutes into a number of years and days.
        Test Data
        Input the number of minutes: 3456789
        Expected Output :
        3456789 minutes is approximately 6 years and 210 days
     */
    public static void main(String[] args) {
        int days = (date % (60*24*365))/(60*24);
        int years =  date / (60*24*365);

        System.out.println(date+" minutes is approximately "+years+" years and " + days + " days ");
    }
}
