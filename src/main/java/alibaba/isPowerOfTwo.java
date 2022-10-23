package main.java.alibaba;

public class isPowerOfTwo {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if(n<=0){ return false;}
            int cnt=0;
            int tmpN = n;
            while(n>0){
                if(n%2==1){
                    cnt++;
                }
                if(cnt>1){
                    return false;
                }
                n=n>>1;
            }
            return true;
        }
    }
}
