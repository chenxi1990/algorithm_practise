package com.algorithm.practise.Bean;
/**
 *  @ClassName SelectionSort.java
 *  @author: 陈希
 *  @Date: 2020/9/4 14:21
 *  @Description: 选择排序
 *  @Version 1.0
 */
public class SelectionSort {
    public   static  void   selectionSort(int[] arr){
        if (arr==null||arr.length<2){
            return;
        }
        for (int i=0;i<arr.length;i++){
            int minIndex=i;
            for (int j=i+1;j<arr.length;j++){
                minIndex=arr[j]<arr[minIndex]?j:minIndex;
                swap(arr,j,minIndex);
            }

        }
    }

    private static void swap(int[] arr, int j, int minIndex) {
        int temp=arr[j];
        arr[j]=arr[minIndex];
        arr[j]=temp;
    }
}
