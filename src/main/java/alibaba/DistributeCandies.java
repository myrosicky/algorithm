package main.java.alibaba;

/*
Alice has n candies. the type of the ith one is candyType[i]
she can only eat n/2 candies（n is even）.
given an array candyType whose size=n, pls calculate the most types Alice can have when only n/2 candies was ate.

sample1:
input:candyType = [1,1,2,2,3,3]
output:3
illustration: Alice can only have 6 / 2 = 3 candies, and as there are only 3 types of candies, so 3

sample 2：
input:candyType = [1,1,2,3]
output:2
illustration：Alice can only have 4 / 2 = 2 candies, so no matter [1,2]、[1,3] or [2,3], the answer can only be 2

sample 3：
input:candyType = [6,6,6,6]
output:1
illustration: Alice can only have 4 / 2 = 2 candies, there is only 1 type despite she can eat 2 candies
 */
public class DistributeCandies {
        public int distributeCandies(int[] candyType) {
            int limit = candyType.length >> 1;
            quick(candyType, 0, candyType.length-1);
            int preType = candyType[0];
            int j=1;
            for(int i =1,len=candyType.length;i<len && j<limit;i++){
                if(candyType[i]!=preType){
                    j++;
                    preType = candyType[i];
                }
            }
            if(j>limit) return limit;
            return j;

        }

        private void quick(int[] arr, int start,int end){
            if(end<=start) return;
            int tmpS = start;
            int tmpE = end;
            int pilot = (tmpE+tmpS)>>1;
            while(tmpE > tmpS){
                for(;tmpS < pilot && arr[tmpS]<=arr[pilot];){tmpS++;}
                for(;tmpE>pilot && arr[tmpE]>=arr[pilot];){tmpE--;}
                int tmp = arr[tmpS];
                arr[tmpS] = arr[tmpE];
                arr[tmpE] = tmp;
                if(tmpS==pilot){
                    pilot=tmpE;
                }else if(tmpE==pilot){
                    pilot=tmpS;
                }

            }
            quick(arr, start, pilot-1);
            quick(arr, pilot+1, end);
        }
}
