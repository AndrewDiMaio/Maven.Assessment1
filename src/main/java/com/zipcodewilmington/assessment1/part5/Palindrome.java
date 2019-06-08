package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        int count = 0;
        StringBuilder newString = new StringBuilder();
        if (newString.equals(newString.reverse())){
            count += input.length()*2;
    }return count;

    }
}
