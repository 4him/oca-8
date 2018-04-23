package com.sckeedoo.certification;

public class BonusPoint {
    /*
         Write a Java method to find out if a number N is tekwill-super-number.
         A tekwill-super-number is a number which contains all the even digits
         Example :
         Input: 20466861
         Output: true
         explanation: this number contains 0, 2,4,6 and 8 in it's representation

         Input: 1234568
         output false
         explanation: it does not have 0 in it's represetnation


         Method should take a Integer as argument, and return a boolean;
         Note that you can't convert the number into a String. you must use math operators, ex: /, %, +

         Solution that was suggested by Luca
     */
    static int a = 209898654;

    public static void main(String[] args) {
        int result = 0;
        while (a != 0) {
            if((a & 1) == 0) { /* this will make logical * multiplication based on 2 numbers. Ex: 100 and 001 as
             result we will have 0. This means that we have a = 100 (bin) and 4 (decimal) is divided by 2 without any
              remains. Other case we get 1.*/
                result |= (1 << (a % 10));
                /* this makes logical + add to result var. And in right we have logical operation that shifts to left
                 1 with number of what remains after dividing a to 10.
                Example if we have  4  after dividing - result we will have  from 0 = 10000 - 1 was shifted with 4
                zeros in binary.
                In this operation result still int and not binary*/
            }
            a/=10; // divide to 10 to move on next digit.
        }
        System.out.println(result == 341);
        // 341 is decimal representation of 101010101 -
        // Explanation:
        // if we got 8 we will shift 1 with 8 zeros - 100000000
        // if we got 6 we will shift 1 with 6 zeros - 101000000
        // if we got 4 we will shift 1 with 4 zeros - 101010000
        // if we got 2 we will shift 1 with 2 zeros - 101010100
        // last one 0 will shift 1 with 0 position - 101010101
        // in this way you are not care about how many times digits 8 or other is in your number. Algorithm will shift
        // once again with 8 zeros.


    }
}
