class Solution {

    public String encode(List<String> strs) {
        StringBuilder strB = new StringBuilder();
        for(String s : strs){
            strB.append(s.length());
            strB.append("#");
            strB.append(s);
        }
        return strB.toString();
    }

    public List<String> decode(String s) {
        List<String> strs = new ArrayList<>();
        int i = 0;
        while(i < s.length()) {
            int j = s.indexOf('#', i);  // find next #
            int len = Integer.parseInt(s.substring(i, j));  // length
            strs.add(s.substring(j+1, j+1+len));  // extract string
            i = j + 1 + len;  // move pointer
        }
        return strs;
    }
}
