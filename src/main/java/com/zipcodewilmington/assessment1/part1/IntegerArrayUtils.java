package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int result = 0;
        for (int i = 0; i<intArray.length; i++){
            int temp = intArray[i];
            result = result+temp;

        }

        return result;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int result = 1;
        for (int i = 0; i<intArray.length; i++){
            int temp = intArray[i];
            result = temp * result;

        }

        return result;
    }


    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        Integer sum = 0;
        for (int i = 0; i<intArray.length; i++){
            int temp = intArray[i];
            sum = sum+temp;

        }
        Double dividend = Double.valueOf(intArray.length);
        Double result = sum/dividend;

        return result;
    }
}
