class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set checkSet = new HashSet();
        for(int num : nums)
            checkSet.add(num);
        return (checkSet.size() != nums.length);
    }
}
