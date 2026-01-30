class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> temp = new HashSet<>();
        for(int i:nums){
            if(!temp.add(i)){  
                return true;
            }
        }
        return false;
    }
}
