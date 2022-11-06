package main.java.alibaba;

/*
given a non-empty string s, determine if it is a valid palindrome with removing 1 character at most.

sample:
abc = true
abca = true
abc = false
 */
public class ValidPalindrome {
        public boolean validPalindrome(String s) {
            char[] a = s.toCharArray();
            return c(a, 0,a.length-1,0);
        }
        private boolean c(char[] a, int start, int end, int fail){
            int ts=start,te=end;
            if(te==ts)return true;
            boolean match=false;
            while(te>ts && a[ts]==a[te]){
                ts++;
                te--;
                match=true;
            }
            if(ts>=te && match){
                return true;
            }
            if(fail>0) return false;
            return c(a, ts+1, te, fail+1) || c(a, ts, te-1, fail+1);
        }
}
