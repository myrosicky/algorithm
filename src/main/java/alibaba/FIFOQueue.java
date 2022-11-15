package main.java.alibaba;

public class FIFOQueue {
        private int[] a;
        private int i;
        private int size=10;
        public MyQueue() {
            a = new int[size];
            i=0;
        }

        public void push(int x) {
            if(i>=size){
                size=size<<1;
                int[] b = new int[size];
                for(int j=0;j<i;j++){
                    b[j]=a[j];
                }
                a=b;
            }
            a[i] = x;
            i++;
        }

        public int pop() {
            if(i>0){
                int tmp = a[0];
                for(int j=0;j<i-1;j++){
                    a[j]=a[j+1];
                }
                i--;
                return tmp;
            }
            return 0;
        }

        public int peek() {
            return a[0];
        }

        public boolean empty() {
            return i==0;
        }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
