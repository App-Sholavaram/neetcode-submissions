class Solution {
    public boolean isAnagram(String s, String t) {
        int[] check = new int[26];
        for(char c : s.toCharArray()){
            check[c - 'a'] = check[c - 'a']+1;
        }
        for(char c : t.toCharArray()){
           check[c - 'a'] = check[c - 'a'] -1;
        }

        for(int val : check){
            if(val !=0)
              return false;
        }

        return true;
    }
}
