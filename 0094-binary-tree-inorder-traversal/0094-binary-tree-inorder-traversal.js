/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var inorderTraversal = function(root) {
    let res = [];
    let curr = root;
    let pre;
    while (curr != null) {
        if (curr.left == null) {
            res.push(curr.val);
            curr = curr.right; // move to next right node
        } else {
            // has a left subtree
            pre = curr.left;
            while (pre.right != null) {
                // find rightmost
                pre = pre.right;
            }
            pre.right = curr; // put curr after the pre node
            let temp = curr; // store curr node
            curr = curr.left; // move curr to the top of the new tree
            temp.left = null; // original curr left be null, avoid infinite loops
        }
    }
    return res;

};