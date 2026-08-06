class Solution {
    public int smallestNumber(int n, int t) {
        int small = 0;
        while(small%t==0){
            int num = n;
            int product = 1;
            while (num!=0){
                int digit = num%10;
                product *= digit; 
                num/=10;
            }
            if (product==0){
                small = n;
                break;
            }
            if (product%t==0){
                small = n;
                break;
            }
            n++;
        }

        return small;
    }
}