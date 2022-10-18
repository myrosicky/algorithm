package main.java.alibaba;

/*
given an int array nums and an integer k, check if array contains 2 same value whose index distance <= k, abs(i-j)<=k, if found return true, otherwise false.
 */
public class ContainNearbyDuplication {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            for(int i = 0, len=nums.length; i<len;i++){
                for(int j=i+1, len2=i+k;j<=len2 && j<len;j++){
                    if(nums[i]==nums[j]){
                        return true;
                    }
                }
            }
            return false;
        }
}
