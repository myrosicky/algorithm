package main.java.alibaba;

/*
ugly number: whose prime factors are 2, 3 or 5
 */
public class isUgly {
        public boolean isUgly(int n) {
            if(n<=0) return false;
            while(n>1 || n<-1){
                if(n%2==0) n/=2;
                else if(n%3==0) n/=3;
                else if(n%5==0) n/=5;
                else return false;
            }
            return true;
        }
}
