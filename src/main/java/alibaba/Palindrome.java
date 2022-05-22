package main.java.alibaba;

/*
the longest Palindrome
given a String s, please find out the longest palindrome of s.

sample1:
input: s = "babad"
output: "bab"
explanation: "aba" is correct also.

sample2:
input：s = "cbbd"
output："bb"

sample3：
input：s = "a"
output："a"

sample4：
input：s = "ac"
output："a"

 */
public class Palindrome {
    public String longestPalindrome(String s) {
        int ansLength = 0;
        int ansStart = -1;
        int length = s.length();
        char[] c = s.toCharArray();
        for(int i=0; i < length; i++){

            for(int j=1;true;j++){
                int i2 = i+1;
                while(i2 < length && c[i2]==c[i]){
                    i2++;
                }
                i2--;
                if(i - j < 0 || i2+j == length || c[i-j]!=c[i2+j]){
                    int tmpLen = ((j-1)<<1)+1+i2-i;
                    if(tmpLen > ansLength){
                        ansLength = tmpLen;
                        ansStart = i-j+1;
                    }
                    break;
                }
            }
        }
        return s.substring(ansStart, ansStart+ansLength);
    }

}
