package com.algorithm.practise.Bean;
/**
 *  @ClassName MaxArr.java
 *  @author: 陈希
 *  @Date: 2020/9/4 14:41
 *  @Description: 数组找最大值
 *  @Version 1.0
 */
public class MaxArr {

    public static   int getMax(int[] arr,int L,int R){
        if(L==R){
            return  arr[L];
        }
        int mid=(L+R)/2;
        int maxLeft=getMax(arr,L,mid);
        int maxRight=getMax(arr,mid+1,R);
        return Math.max(maxLeft,maxRight);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(getMax(arr,0,arr.length-1));
    }
}
