class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i=0;i<nums.length;i++){
            int con = 0;
            while(nums[i]!=0){
                con++;
                nums[i] = nums[i]/10;
            }
            if (con%2==0){
                count++;
            }
        }
        return count;
    }
}