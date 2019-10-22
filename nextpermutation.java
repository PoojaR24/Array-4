//worst case time complexity: O(n)
//Space Complexity: O(1) (constant)
//Expectation here is: input: [1,5,8,4,7,6,5,3,1] then expected output should be: [1,5,8,5,1,3,4,6,7]
//In order to achive this first we iterate from the 2nd last position of the nums array till we reach a position where it is no more in the decreasing pattern.
//Here 4 is lesser than 7 afterwhich everything is in decreasing pattern.
//Now we take a j index from the last postion and iterate till we find the next largest value after this value that value next greater than 4 here which will be 5 in this example.
//Now the value at i and value at j must be swapped ie; positions of 4 and 5 is swapped in the given example.
//Finally the value from i+1 th position to the last value must be reversed. giving us the final array as: [1,5,8,5,1,3,4,6,7] which is our expected output.
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length<=1)
        {
            return;
        }
        int i = nums.length-2;
        while(i>=0 && nums[i] >= nums[i+1]) 
        {
            i--;
        }
        if(i>=0)
        {
            int j = nums.length-1;
            while(nums[j]<=nums[i])
            {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length-1);
    }
    public void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums, int i, int j)
    {
        while(i<j)
        {
            swap(nums,i++,j--);
        }
    }
}