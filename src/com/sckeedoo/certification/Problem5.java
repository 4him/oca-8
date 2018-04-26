package com.sckeedoo.certification;

import sun.tools.java.BinaryClass;

public class Problem5 {
    static int a = 31;
    /*
        Given a number N, find if it's prime or not (Google what prime number means, in case you don't know)
     */
    public static void main(String[] arg) {

        while(a != 0){
            if((a & 1) != 0) { // if division on 2 not equals 0
                a/=10;
            }else{
                System.out.println("This is not prime number");
                return;
            }
        }
        System.out.println("This is prime number");
    }
}
