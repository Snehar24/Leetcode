class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int c=0;
        for(int st=0;st<nums.length;st++){
            sum=0;
            for(int j=st;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    c++;
                }
            }
        }
        return c;
    }
}