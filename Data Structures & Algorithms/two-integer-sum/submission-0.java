class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> check = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            int val = nums[i];
            if(check.containsKey(target-val))
               return new int[]{check.get(target-val),i};
            check.put(val,i);
        }

        return new int[]{};
    }
}
