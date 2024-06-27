
# Definition for a binary tree node.
class TreeNode(object):
     def __init__(self, val=-1, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right

class Solution(object):
    def isSameTree(self, p, q) -> bool:
        if not p and not q:
            return True
        if not p or not q or p.val != q.val :
            return False
        
        return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)

def create_tree(values):
    if not values:
        return None
    root = TreeNode(values[0])
    nodes = [root]
    index = 1
    while index < len(values):
        node = nodes.pop(0)
        if values[index] is not None:
            node.left = TreeNode(values[index])
            nodes.append(node.left)
        index += 1
        if index < len(values) and values[index] is not None:
            node.right = TreeNode(values[index])
            nodes.append(node.right)
        index += 1
    return root

tree1_values = [1,2,3]
tree2_values = [1,2,3]
tree1 = create_tree(tree1_values)
tree2 = create_tree(tree2_values)

solution = Solution()
result = solution.isSameTree(tree1, tree2)
print(result)
        