class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev = 0;
        int dup = n;
        while(dup!=0){
            rev = dup%10+rev*10;
            dup/=10;
        }
        int sum = 0;
        int min = Math.min(rev,n);
        int max = Math.max(rev,n);
        for (int i=min;i<=max;i++){
            int prime = 1;
            if (i<=1){
                prime = 0;
            }
            else if (i==2){
                prime =1;
            }
            else if (i%2 == 0){
                prime =0;
            }
            else{
                for (int j = 3;j*j<=i;j+=2){
                    if (i%j==0){
                        prime = 0;
                        break;
                    }
                }
            }
            if (prime == 1){
                sum+=i;
            }
        }
        return sum;
    }
}