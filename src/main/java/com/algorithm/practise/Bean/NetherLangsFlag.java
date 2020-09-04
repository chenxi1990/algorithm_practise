package com.algorithm.practise.Bean;

public class NetherLangsFlag {
    public   static int[]  partition(int[]arr ,int L,int R,int num){
        int less=L-1;
        int more=R+1;
        while(L<more){
            if(arr[L]<num){
                swap(arr,++less,L++);
            }else if(arr[L]>num){
                swap(arr,--more,L);
            }else {
                L++;
            }
        }
        return new int[]{less+1,more-1};
    }

    private static void swap(int[] arr, int L, int R) {
        int temp=arr[L];
        arr[L]=arr[R];
        arr[R]=temp;
    }
}
