class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set checkSet = new HashSet();
        for(int num : nums){
            if(checkSet.contains(num))
                return true;
            checkSet.add(num);
        }
        return false;
    }
}
