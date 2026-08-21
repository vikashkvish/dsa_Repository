/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

// N-ary - multiple children

class Solution {
    public List<Integer> postorder(Node root) {
       List<Integer> result = new ArrayList<>();
       if(root==null){
         return result;
       }

       for(Node child: root.children){
          // recursion postorder(all child)
          result.addAll(postorder(child));
       } 

       //In last root value
       result.add(root.val);

       return result;
    }
}