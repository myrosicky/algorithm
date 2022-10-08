package main.java.alibaba;
/*
dailyTemperatures
refer to the array temperature, please calculate the days to a higher temperature. if it never increases, set as 0.

sample1:
input: tempeartures = [73,74,75,71,69,72,76,73]
output: [1,1,4,2,1,1,0,0]


 */
public class DailyTemperatures {
        public int[] dailyTemperatures(int[] temperatures) {
            int[] rtn = new int[temperatures.length];

            for(int i =0,len=temperatures.length;i<len;i++){
                rtn[i]=0;
                for(int y=i+1;y<len;y++){
                    if(temperatures[y]>temperatures[i]){
                        rtn[i] = y - i;
                        break;
                    }
                }
            }

            return rtn;

        }
}
