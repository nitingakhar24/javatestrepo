package com.sample.misc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



class Result {

    /*
     * Complete the 'customSort' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void customSort(List<Integer> arr) {
    Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            if (countMap.containsKey(arr.get(i))) {
                countMap.put(arr.get(i), countMap.get(arr.get(i)) + 1);
            } else {
                countMap.put(arr.get(i), 1);
            }
        }

        class FreqComparator implements Comparator<Integer> {
            Map<Integer, Integer> refMap;

            public FreqComparator(Map<Integer, Integer> input) {
                this.refMap = input;
            }

            @Override
            public int compare(Integer key1, Integer key2) {
                Integer value1 = refMap.get(key1);
                Integer value2 = refMap.get(key2);
                int num = value1.compareTo(value2);
                return num;
            }
        }

        FreqComparator comp = new FreqComparator(countMap);
        TreeMap<Integer, Integer> sortedMap = new TreeMap<Integer, Integer>(comp);
        sortedMap.putAll(countMap);
       
            for(Integer i : sortedMap.keySet()) {
            int frequencey = sortedMap.get(i);
            for(int count  = 1 ; count <= frequencey ; count++) {
                System.out.print(i + " " );
            }
        }
        
    }
/*
    private static TreeMap<Integer, Integer> getSortedMap(Map<Integer, Integer> countMap)
    {
        FreqComparator comp = new FreqComparator(countMap);
        TreeMap<Integer, Integer> sortedMap = new TreeMap<Integer, Integer>(comp);
        sortedMap.putAll(countMap);
        return sortedMap;
    }*/

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
            arr.add(arrItem);
        }

        Result.customSort(arr);

        bufferedReader.close();
    }
}
