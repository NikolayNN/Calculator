package ru.nhorushko.part5;

import java.util.Arrays;

/**
 * Created by Nikol on 12/13/2016.
 */
public class Solution {
    public int[] arrayMerge(int[] firstArray, int[] secondArray){
        int[] result = new int[firstArray.length + secondArray.length];
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        int resultArrayIndex = 0;
        while(firstArrayIndex < firstArray.length
                && secondArrayIndex < secondArray.length){
            if(firstArray[firstArrayIndex] < secondArray[secondArrayIndex]){
                result[resultArrayIndex++] = firstArray[firstArrayIndex++];
            }else{
                result[resultArrayIndex++] = secondArray[secondArrayIndex++];
            }
        }
        while (firstArrayIndex < firstArray.length){
            result[resultArrayIndex++] = firstArray[firstArrayIndex++];
        }
        while (secondArrayIndex < secondArray.length){
            result[resultArrayIndex++] = secondArray[secondArrayIndex++];
        }
        return result;
    }
}
