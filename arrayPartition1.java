//Worst case time complexity: O(N)
//Space Complexity: O(1) no extra space
//In a given input the numbers are paired such that if input is: [1,4,3,2] it is paired such that (1,2),(3,4).
//Here the min of 1,2 is 1 and min of 3,4 is 3 sum of both gives us 4 which is the expected output.
//In order to identify this pairing we sort the given array then it automatically comes in the paired format.
//Here we observe a pattern that every element at the even index will be the min of the particular pair 
//sum of these gives us out output.
class Solution {
    public int arrayPairSum(int[] nums) {
        int l = nums.length;
        Arrays.sort(nums);
        int sum =0;
        for(int i =0; i<l; i+=2)
        {  
            sum +=nums[i];      
        }
       return sum;
    }
}