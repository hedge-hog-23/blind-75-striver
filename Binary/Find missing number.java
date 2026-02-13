class Solution {
    public int missingNumber(int[] nums) {
        int sum = 1;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return (n*(n+1)/2) - sum;
  }
}

//using bit manipulation

// try :
//   initialize res to length of array
//   then interate the entire nums array and perform ans = ans^i^nums[i]
//   return ans
