package main.java.alibaba;

public class Tmp {
    // TODO: in progress
    public int divide(int dividend, int divisor) {
        int rtn = 0;
        boolean diff = false;
        int tmpDividend = dividend;
        int tmpDivisor = divisor;
        if(dividend > 0 && divisor < 0){
            tmpDivisor = 0- divisor;
            diff = true;
        }else if(dividend<0&& divisor > 0){
            tmpDividend = 0-dividend;
            diff = true;
        }else if(dividend < 0 && divisor < 0){
            tmpDividend = 0-dividend;
            tmpDivisor = 0- divisor;
        }
        while(tmpDividend > tmpDivisor){
            rtn++;
            tmpDividend-=tmpDivisor;
        }
        return diff? (0-rtn) : rtn;
    }
}
