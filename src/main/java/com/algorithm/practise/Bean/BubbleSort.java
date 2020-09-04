package com.algorithm.practise.Bean;
/**
 *  @ClassName BubbleSort.java
 *  @author: 陈希
 *  @Date: 2020/9/4 14:10
 *  @Description: 冒泡排序
 *  @Version 1.0
 */
public class BubbleSort {
    public static void bubbleSort(int[] arry) {
        if (arry == null || arry.length < 2) {
            return;
        }
        for (int end = arry.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arry[i] > arry[i + 1]) {
                    swap(arry, i, i + 1);
                }
            }
        }
    }

    private static void swap(int[] arry, int i, int j) {
        int temp = arry[i];
        arry[i] = arry[j];
        arry[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
