class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int prefProd = 1;
        int suffProd = 1;
        int maxProd = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            if(prefProd == 0)
                prefProd = 1;
            if(suffProd == 0)
                suffProd = 1;

            prefProd = prefProd * nums[i]; //prefix prod
            suffProd = suffProd * nums[n-i-1]; //suffix prod

            maxProd = Math.max(maxProd,Math.max(prefProd, suffProd));
        }

        return maxProd;
    }
}
