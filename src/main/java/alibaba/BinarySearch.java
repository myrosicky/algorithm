package main.java.alibaba;

/*
given an n elements in ascending order array nums, and a value target. if nums contain target then return the index. otherwise -1.
 */
public class BinarySearch {
        public int search(int[] nums, int target) {
            int begin = 0;
            int end=nums.length-1;
            int pilot = -1;
            while(end>= begin){
                pilot = (end+begin)>>1;
                if(nums[pilot] > target){
                    end=pilot-1;
                }else if(nums[pilot]<target){
                    begin=pilot+1;
                }else{
                    return pilot;
                }
            }
            return -1;
        }
}
