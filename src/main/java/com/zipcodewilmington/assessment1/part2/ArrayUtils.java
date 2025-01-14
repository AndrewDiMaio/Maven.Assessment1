package com.zipcodewilmington.assessment1.part2;


import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for  (int i = 0;i < objectArray.length; i++)
            if (objectArray[i].equals(objectToCount)){
                count++;

            }

        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        List<Object> list = new ArrayList<>(Arrays.asList(objectArray));
        list.removeAll(Arrays.asList(objectToRemove));
        Object[] finalArray = list.toArray();
    return finalArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        //List<Object> list = new ArrayList<>(Arrays.asList(objectArray));
        Object max = new Object();
        for (int i = 0; i<objectArray.length; i++){
            int currMax = 0;
            for (int j = 0; j<objectArray.length; j++){
                int count = 0;
                if (objectArray[i].equals(objectArray[j])) {
                count++;
                    if (count > currMax){
                        currMax = count;
                        max = objectArray[i];
                    }
                }
            }
        }

        return max;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
      //  for (int i = 0; i<objectArray.length; i++){
        //   if (getNumberOfOccurrences(objectArray[i])
        //}

        return null;
    }


    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
    List<Object> newList = new ArrayList<>(Arrays.asList(objectArray));
    List<Object> mergeList = new ArrayList<>(Arrays.asList(objectArrayToAdd));
    newList.addAll(mergeList);
    Integer[] finalList = newList.toArray(new Integer[0]);
        return finalList;
    }
}
