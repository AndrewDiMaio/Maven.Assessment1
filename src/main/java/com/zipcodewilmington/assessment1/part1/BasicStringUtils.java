package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.toCharArray()[i];
            if (i == 0){
                newString.append(Character.toUpperCase(temp));
            }else {
                newString.append(temp);
            }

        }
        return newString.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder newString = new StringBuilder();
        for (int i = str.length() - 1; i > -1; i--) {
            char temp = str.toCharArray()[i];
            newString.append(temp);

        }
        return newString.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder newString = new StringBuilder();
        for (int i = str.length() - 1; i > -1; i--) {
            if (i == str.length()-1) {
                char temp = str.toCharArray()[i];
                char tempCap = Character.toUpperCase(temp);
                newString.append(tempCap);
            } else {
                char temp = str.toCharArray()[i];
                newString.append(temp);

            }



        }return newString.toString();
    }


        /**
         * @param str a string input from user
         * @return string with identical contents excluding first and last character
         */
        public static String removeFirstAndLastCharacter (String str){
            StringBuilder newString = new StringBuilder();
            for (int i = 1; i < str.length()-1; i++) {
                char temp = str.toCharArray()[i];
                newString.append(temp);

            }
            return newString.toString();
        }

        /**
         * @param str a string input from user
         * @return string with identical characters, each with opposite casing
         */
        public static String invertCasing (String str){
            StringBuilder newString = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char temp = str.toCharArray()[i];
                if (Character.isLowerCase(temp)){
                    newString.append(Character.toUpperCase(temp));
                }else {
                    newString.append(Character.toLowerCase(temp));
                }

            }
            return newString.toString();
        }
    }

