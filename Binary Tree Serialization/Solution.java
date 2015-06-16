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

public class TreeNode {
    public int val;
    public TreeNode left, right;
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

class Solution {
    /**
     * This method will be invoked first, you should design your own algorithm 
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    final String MARKER = "#";
    
    public String serialize(TreeNode root) {
        // write your code here
        StringBuilder str = new StringBuilder();
        serializeHelp(root, str);
        return str.toString();
    }
    
    private void serializeHelp(TreeNode node, StringBuilder str) {
        if (node == null) { str.append(MARKER); }
        // inorder
        str.append(node.val);
        str.append(';');
        serializeHelp(node.left, str);
        serializeHelp(node.right, str);
    }
    
    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method.
     */
    
    public TreeNode deserialize(String data) {
        // write your code here
        if (data == "") { return null; }
        String[] strList = data.split(";");
        return deserializeHelp(strList, 0);
    }
    
    private TreeNode deserializeHelp(String[] strList, int index) {
        if (strList.length == 0 || strList[index].equals(MARKER)) {
            return;
        }
        int value = Integer.parseInt(data.charAt(0));
        TreeNode node = new TreeNode()
        deserialize()
    }
}

