package org.uni.arrays;

public class SolutionSecond {

    public int countEvenDigits(int[] nums) {
       int evenNumbers = 0;

       for (Integer i : nums) {
           int count = 0;

           while (i != 0) {
               i = i / 10;  // Integer division by 10
               count++;
           }

          if ((count & 1) == 0 ) {
              evenNumbers++;
          }
       }

       return evenNumbers;
    }
}
