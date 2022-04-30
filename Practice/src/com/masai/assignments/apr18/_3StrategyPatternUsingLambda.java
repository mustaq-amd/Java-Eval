package com.masai.assignments.apr18;

public class _3StrategyPatternUsingLambda {
    public static void main(String[] args) {

       SortingAlgo bubbleSortingAlgo=SortingAlgo.bubbleSorting();
        System.out.println(bubbleSortingAlgo.sort(new int[]{3, 2, 1}));

        SortingAlgo.bubbleSorting().sort(new int[]{3, 2, 1});



    }
}

interface SortingAlgo{

    String sort(int[] arr);

    static SortingAlgo bubbleSorting(){
        return arr -> "Bubble sort";
    }

    static  SortingAlgo mergeSorting(){
        return arr -> "Merge Sort";
    }

}
