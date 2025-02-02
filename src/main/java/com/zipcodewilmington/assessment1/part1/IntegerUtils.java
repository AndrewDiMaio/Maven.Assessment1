package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        Integer sum = 0;
        for (int i = 0; i<=n; i++){
            sum = sum+i;
        }

        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer product = n;
        for (int i = 1; i<n; i++){
            int temp = product*i;
            product = temp;
        }
        return product;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        StringBuilder reverse = new StringBuilder();
        String valLen = val.toString();
       int valLength = valLen.length();
        for (int i = 0; i<valLength; i++) {
            char temp = valLen.charAt(i);
            reverse.append(temp);
            System.out.println(reverse.toString());

        }return Integer.valueOf(reverse.reverse().toString());
    }
}
