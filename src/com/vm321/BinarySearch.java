package com.vm321;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 6, 12, 87, 66, 123, 874};
        Arrays.sort(arr);
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入key: ");
        int key = scan.nextInt();
        int index=rank(key, arr);
        if(index < 0){
            System.out.println("无法匹配");
        }else{
            System.out.println("属于第" + index + "位");
        }
    }

    private static int rank(int key, int[] arr) {
        int lo = 0;
        int hi = arr.length -1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(key < arr[mid]){
                hi = mid - 1;
            }else if (key > arr[mid]){
                lo = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
