package main.java.alibaba;

/*
given an integer x, return ture if x is a palindrome number, otherwise false 。

palindrome number: the same value from left to right or right to left, for example: 121.

sample1：

input：x = 121
output：true
sample2：

input：x = -121
output：false
explanation：left to right -121, while right to left 121-, not PalindromeNumber
sample3：

input：x = 10
output：false
explanation：right to left 01. not PalindromeNumber
sample4：

input：x = -101
output：false
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        char[] tmpX = String.valueOf(x).toCharArray();
        for(int i = 0, len = tmpX.length; i < len; i++){
            if(tmpX[i]!=tmpX[len-i-1]){
                return false;
            }
        }
        return true;
    }
}
