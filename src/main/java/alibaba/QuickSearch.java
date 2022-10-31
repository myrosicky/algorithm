package main.java.alibaba;

public class QuickSearch {

        public int[] sortArray(int[] nums) {
            qs(nums,0,nums.length-1);
            return nums;
        }

        public void qs(int[] nums, int start, int end){
            if(end<=start) return;
            int tmpS=start;
            int tmpE=end;
            int pilot=(start+end)>>1;
            while(tmpE>tmpS){
                while(tmpS<pilot && nums[tmpS] <= nums[pilot]){
                    tmpS++;
                }
                while(tmpE>pilot &&nums[tmpE] >=nums[pilot]){
                    tmpE--;
                }
                int tmp=nums[tmpS];
                nums[tmpS]=nums[tmpE];
                nums[tmpE]=tmp;
                if(tmpS==pilot) pilot=tmpE;
                else if(tmpE==pilot) pilot=tmpS;
            }
            qs(nums, start, pilot-1);
            qs(nums, pilot+1,end);
        }
}
