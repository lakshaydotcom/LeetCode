class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (n>=0){
            return Math.pow(x,N);
        }
        else{
            return Math.pow(1/x,-N);
        }
    }
}