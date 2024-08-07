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
 * @return {number}
 */
var maxDepth = function (root) {
      if (!root) return 0
      // return 1 + Math.max(maxDepth(root.left), maxDepth(root.right)) */

      let depth = 0
      let queue = [root]

      while (queue.length) {
         let len = queue.length

         for (let i = 0; i < len; i++) {
            let current = queue.shift()

            if(current.left) queue.push(current.left)
            if(current.right) queue.push(current.right)
         }
         
         depth++
      }
      return depth
}
