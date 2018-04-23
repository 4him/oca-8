package com.sckeedoo.certification;

import java.util.ArrayList;
import java.util.List;

public class Problem4 {
    /*
         Write a method that takes an array as parameter and returns another
         array without duplicate elements

         Input:
         {1,3,4,1,4,5}
         Return:
         {1,3,4,5}
     */

    static int[] myInput = {1,3,4,1,4,5};

    static public void main(String[] args){
        List<Integer> newArray = new ArrayList<Integer>();

        for (int i=0; i<myInput.length; i++){
            if(!newArray.contains(myInput[i])){
                newArray.add(myInput[i]);
            }
        }

        System.out.println(newArray);
    }


}
