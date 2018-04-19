package com.sckeedoo.certification;

public class Problem2 {
    /*
         Write a Java method to count all vowels in a string.
         Method should take a String as argument, and return an Integer;
     */
    public  static int vowels = 0;
    public  static String myString = "For God so loved the world that he gave his one and only Son, that whoever believes in him shall not perish but have eternal life.";
    public  static String criteria = "aeiouy";


    public static void main(String[] args) {
        System.out.println(checkVowels(myString));
    }

    public static int checkVowels(String myString) {
        for(int i = 0; i < myString.length(); i++) {
            myString = myString.toLowerCase();
            char cur_symbol = myString.charAt(i);
            if (criteria.contains(String.valueOf(cur_symbol))){
                vowels++;
            }
        }
        return vowels;
    }
}
