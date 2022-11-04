package main.java.alibaba;

/*
given 2 array arr1 & arr2, arr2 elements are all unique and exists at arr1. pls sort arr1 in arr2 order,
and sort the left number in arr1 in ascending order.

sample:
arr1=[2,3,1,3,2,4,6,7,9,2,19], arr2=[2,1,4,3,9,6]
output [2,2,2,1,4,3,3,9,6,7,19]

arr1=[28,6,22,8,44,17], arr2=[22,28,8,6]
output [22,28,8,6,17,44]
 */
public class relativeSortArray {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            int[] rtn = new int[arr1.length];
            int i=0,l=arr1.length, i2=0, l2=arr2.length, rtnI=0;
            while(i2<l2){
                if(arr1[i]==arr2[i2]){
                    rtn[rtnI++]=arr1[i];
                    arr1[i]=-1;
                }
                i=(i+1)%l;
                if(i==0) i2++;
            }
            i=0;
            int min=1001, minIdx=-1;
            while(rtnI<l){
                if(arr1[i]!=-1 && arr1[i]<min){
                    min=arr1[i];
                    minIdx=i;
                }

                i=(i+1)%l;
                if(i==0){
                    rtn[rtnI++]=arr1[minIdx];
                    arr1[minIdx]=-1;
                    min=1001;
                }
            }
            return rtn;
        }
}
