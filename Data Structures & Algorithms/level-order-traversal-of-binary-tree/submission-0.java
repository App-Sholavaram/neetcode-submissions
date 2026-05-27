/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
    List<List<Integer>> result = new ArrayList<>();
Queue<TreeNode> que = new LinkedList();
if(root !=null) que.add(root);
while(!que.isEmpty()){
List<Integer> level = new ArrayList<>();
for(int i=que.size(); i >0 ; i--){
TreeNode cur = que.poll();
if(cur != null){
    level.add(cur.val);
   if(cur.left !=null) que.add(cur.left);
   if(cur.right !=null) que.add(cur.right);
}
}
result.add(level);
}
return result;
}
}
