package main.java.alibaba;


/*
given a intteger array nums, pls move all 0 to the end and keep the non-0 elements' order.
*/
public class MoveZeros {
        public void moveZeroes(int[] nums) {
            for(int i =0,l=nums.length;i<l;i++){
                if(nums[i]==0) c(nums,i);
            }

        }
        public void c(int[] n, int idx){
            for(int i=idx+1, l=n.length;i<l;i++){
                if(n[i]!=0){
                    int tmp=n[i];
                    n[i]=0;
                    n[idx]=tmp;
                    idx=i;
                }
            }
        }
}
