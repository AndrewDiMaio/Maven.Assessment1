package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        StringBuilder subStrings = new StringBuilder();
        String[] test = new String[9];
         for (int i = 0; i<input.length()-1; i++){
             for (int j = 0; j<input.length(); j++){
                 test[j] = (input.subSequence(i,j+1).toString());
             }
         }

         for (int h = 0; h<input.length(); h++){
             System.out.println(test[h]);
         }
        return null;
    }
}
