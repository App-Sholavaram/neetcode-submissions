class Solution {
    public int longestConsecutive(int[] nums) {
        Set set = new HashSet();
        int maxCount =0;
        for(int num : nums)
          set.add(num);
        for(int num : nums){
            if(!set.contains(num-1)){
                int temp = num;
                while(set.contains(temp+1))
                    temp++;
                maxCount = Math.max(maxCount,temp-num+1);
            }
        }
        return maxCount;
    }
}
