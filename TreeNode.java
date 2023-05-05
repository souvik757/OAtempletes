/*
Contains template for Tree problems :::
 */
/*
imports :::
Queue interface :::
LinkedList as wrapper class of Queue interface :::
 */
import java.util.Queue ;
import java.util.LinkedList ;
import java.util.Scanner ;
/*
Functions :::
1 . TreeNode()
2 . TreeNode(val)
3 . FormTreeByLevel(TreeNode)
4 . ShowTreeByLevel(TreeNode)
 */
public class TreeNode {
    int val ;
    TreeNode left ;
    TreeNode right ;
    public TreeNode() {}
    public TreeNode(int val) {
        this.val = val;
        this.left = null ;
        this.right = null ;
    }
// 3 . FormTreeByLevel(TreeNode) :::
    public TreeNode FormTreeByLevel(TreeNode root) {
        int value ;
        System.out.println("Root's value : ");
        value = new Scanner(System.in).nextInt() ;
        root = new TreeNode(value) ;
        Queue<TreeNode> queue = new LinkedList<>() ;
        queue.add(root) ;
        while (!queue.isEmpty()) {
            TreeNode front = queue.remove() ;
            System.out.println(front.val+"->left  : ");
            value = new Scanner(System.in).nextInt() ;
            if (value != -1){
                front.left = new TreeNode(value) ;
                queue.add(front.left) ;
            }
            System.out.println(front.val+"->right :");
            value = new Scanner(System.in).nextInt() ;
            if (value != -1){
                front.right = new TreeNode(value) ;
                queue.add(front.right) ;
            }
        }
        return root ;
    }
// 4 . ShowTreeByLevel(TreeNode) :::
    public void ShowTreeByLevel(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>() ;
        queue.add(root) ;
        queue.add(null) ;
        while (!queue.isEmpty()) {
            TreeNode front = queue.remove() ;
            if (front == null){
                System.out.println();
                if (!queue.isEmpty())
                    queue.add(null) ;
            }
            else{
                System.out.print("->"+front.val) ;
                if (front.left != null)
                    queue.add(front.left);
                if (front.right != null)
                    queue.add(front.right) ;
            }
        }
    }
}
