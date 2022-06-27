package main.java.alibaba;

/*
strStr() implementation
given 2 string: haystack, needle.
find out the 1st occurrence of needle in haystack(start from 0), return -1 if not found.
 */
public class StrStr {
    public int strStr(String haystack, String needle) {
        if(needle==null || needle.trim().length()==0)
            return 0;
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        int len2=needle.length();
        for(int i = 0, len = haystack.length()-len2+1; i < len; i++){
            int j = 0;
            for(; j<len2;j++){
                if(h[i+j]!=n[j]) break;
            }
            if(j==len2){
                return i;
            }
        }
        return -1;
    }
}
