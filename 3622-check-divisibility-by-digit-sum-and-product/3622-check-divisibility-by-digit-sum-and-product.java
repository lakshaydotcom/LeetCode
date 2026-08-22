class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int total = 0;
        int dup = n;
        while(n!=0){
            int digit = n%10;
            sum+=digit;
            product*=digit;
            n/=10;
        }
        total = sum+product;
        if (dup%total==0){
            return true;
        }
        return false;
    }
}