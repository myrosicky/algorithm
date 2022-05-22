package main.java.alibaba;

/*
Find the median between 2 arrays sorted in ascending order.
say 2 arrays nums1, nums2 with length m & n, pls find out the median.
the time complexity should be O(log (m+n))

sample1:
input：nums1 = [1,3], nums2 = [2]
output：2.00000
explanation：the merged array = [1,2,3], median=2

sample2:
input：nums1 = [1,2], nums2 = [3,4]
output：2.50000
explanation：the merged array = [1,2,3,4], median= (2 + 3) / 2 = 2.5

*/
public class algorithm1 {

    private int min(int a, int b){
        return a > b?b:a;
    }
    private int max(int a, int b){
        return a > b?a:b;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int targetStart = ((len1+len2) >> 1);
        int targetEnd = targetStart;
        if((len1+len2)%2==0){
            targetStart--;
            targetEnd = targetStart+1;
        }
        int tmp1=0;
        double rtnStart = 0.0;
        int i = 0, j=0;
        while(i < len1 || j < len2){
            if(i>=len1){
                tmp1 = nums2[j];
            }else if(j>=len2){
                tmp1 = nums1[i];
            }else{
                tmp1 = min(nums1[i], nums2[j]);
            }

            if(i+j==targetStart){
                rtnStart = tmp1;
            }
            if(i+j==targetEnd){
                return (rtnStart + tmp1 )/2;
            }
            if(i < len1 && tmp1 == nums1[i]){
                i++;
            }else if (j < len2 && tmp1==nums2[j]){
                j++;
            }


        }
        return 0;
    }
}