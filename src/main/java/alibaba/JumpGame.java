package main.java.alibaba;

/*
given a non-negative integer array nums, the initial place is the very beginning index 0.
each element in the array is the maximum length to jump.
the target is to reach the last element with the least jump.

sample:
input: nums = [2,3,1,1,4]
output: 2
the lease jump needed is 2: nums[0] (jump) nums[1] (jump) nums[4]

input: nums = [2,3,0,1,4]
output: 2
the lease jump needed is 2: nums[0] (jump) nums[1] (jump) nums[4]


 */
public class JumpGame {

        public int jump(int[] nums) {
            int end = nums.length-1;
            int tmp = end;
            int result = 0;
            for(int i = end - 1; i > -1; i--){
                if(nums[i]+i >= end){
                    tmp = i;
                }
                if(i == 0){
                    end = tmp;
                    i = end;
                    result++;
                }
            }
            return result;
        }
}

