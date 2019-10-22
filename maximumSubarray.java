//DP Solution
//Time Complexity: O(n)
//Space Complexity: O(n)
//Take a dp array the first 0 th value in dp must be the value at 0th position in nums array. Initialise max value to dp[0]
//Iterate over nums array from 1 to end of array. 
// calculate dp value which is the sum of nums value at i position and the value at previous position in dp array if the dp val > 0 else add 0 to nums[i].
//Calculate the max by comparing max value at every iteration with dp[i]. Finally return max
class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int[] dp = new int[n];
        dp[0]= nums[0];
        int max = dp[0];
        for(int i =1; i<n; i++)
        {
            dp[i]= nums[i]+(dp[i-1] > 0 ? dp[i-1] : 0);
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
//Other Solution.
//time complexity: O(n)
//space complexity: O(1)
//Intialize max value to lowest integer value and sum as 0 
//Iterate over the nums array and check if the sum is less than 0 then equate sum to nums[i] 
//else add nums[i] to sum
//Check if the sum is greater than max if so update max to current sum. Finally return max.
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i =0; i< nums.length; i++)
        {
            
            if(sum<0)
            {
                sum = nums[i];
            }
            else
            {
                sum+=nums[i];
            }
            
            if(sum>max)
            {
                max = sum;
            }
        }
        return max;
    }
}