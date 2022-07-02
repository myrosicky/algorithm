package main.java.alibaba;
/*
there is 7 chars in Roman numeral.
I -> 1
V -> 5
X -> 10
L -> 50
C -> 100
D -> 500
M -> 1000

in normal cases:
2 in Roman is II
12 is XII
27 is XXVII

but some special cases:
IV -> 4
IX -> 9
XL -> 40
XC -> 90
CD -> 400
CM -> 900

so given an integer, pls transform into Roman

 */
public class RomanNumeral {
        public String intToRoman(int num) {
            String rtn = "";
            int tmp = num;
            int[] vals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] chas = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            int len = vals.length;
            while(tmp > 0){
                for(int i =0; i < len;i++){
                    if(tmp >= vals[i]){
                        tmp -= vals[i];
                        rtn += chas[i];
                        break;
                    }
                }
            }
            return rtn;
        }

}
