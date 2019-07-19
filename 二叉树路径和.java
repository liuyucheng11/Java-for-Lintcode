/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param root: the root of binary tree
     * @param target: An integer
     * @return: all valid paths
     */
     List<List<Integer>> total = new ArrayList<>();
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        // write your code here
      
        dfs(root,target,new ArrayList<Integer>());
        return total;
        
    }
    public void dfs(TreeNode root,int target,List<Integer> list){
        if(root==null){
            return ;
        }
          target =  target-root.val;
          list.add(root.val);
          if(target==0 && root.left == null && root.right==null){
              total.add(new ArrayList(list));
              return;
          }

          if(root.left!=null){
              dfs(root.left,target,list);
              list.remove(list.size()-1);
          }
          //搜索右子树
          if(root.right!=null){
              dfs(root.right,target,list);
              list.remove(list.size()-1);
          }
    }
    
    
}
