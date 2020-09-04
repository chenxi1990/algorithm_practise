package com.algorithm.practise.Bean;
/**
 *  @ClassName InsertionSort.java
 *  @author: 陈希
 *  @Date: 2020/9/4 14:30
 *  @Description: 插入排序 额外空间O(1)
 *  @Version 1.0
 */
public class InsertionSort {
    public static void    insertionSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>0&&arr[j]>arr[j+1];j--){
                swap(arr,j,j+1);
            }
        }
    }
    /**
     *  @ClassName InsertionSort.java
     *  @author: 陈希
     *  @Date: 2020/9/4 14:40
     *  @Description: 交换数组
     *  @Version 1.0
     */
    private static void swap(int[] arr, int j, int i) {
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
    }

    public static void main(String[] args) {
        System.out.println("插入排序");
    }
}
