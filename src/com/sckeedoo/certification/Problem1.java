package com.sckeedoo.certification;

public class Problem1 {
    int n = 30;
    int k = 5;
    int input = 60;
    /*
        Given two numbers N and K. Print all the numbers smaller than N that are divisible by K.
     */
    public static void main(String[] args) {
        Problem1 Number = new Problem1();
        System.out.println("Number is ");
        if(Number.checkMethod(Number.n, Number.k, Number.input))
            System.out.println(" good ");
        else System.out.println(" wrong ");
    }

    public static  boolean checkMethod(int n, int k, int input) {
        return (input > n) && (input % k == 0) ? true : false;
    }
}
