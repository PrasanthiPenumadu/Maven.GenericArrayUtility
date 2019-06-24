package com.zipcodewilmington.arrayutility;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    T [] inputArray;
    Integer count=0;

    public ArrayUtility(T[] inputArray) {
        this.inputArray=inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]==valueToEvaluate)
                count++;}
        for(int i=0;i<arrayToMerge.length;i++){
            if(arrayToMerge[i]==valueToEvaluate)
                count++;
        }return count;

    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        int max=0;
        T value=null;
        for(T i:inputArray){
            for(T j:arrayToMerge){
                if(i==j)
                    count++;
            }if(count>max){
                max=count;
                value=i;
            }
        }
        return value;
    }

    public T[] removeValue(T valueToRemove) {

        List<T> all=new ArrayList<T>();
        for(T i:inputArray){
            if(i!=valueToRemove)
            all.add(i);
        }
       T[] inputArray1= Arrays.copyOf(inputArray, all.size());

       System.out.println(all.size());

        return all.toArray(Arrays.copyOf(inputArray, all.size()));
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]==valueToEvaluate)
                count++;}
        return count;

    }
}
