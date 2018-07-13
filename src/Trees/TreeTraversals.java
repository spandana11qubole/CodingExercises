import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversals {
    public void levelOrderTraversal(TreeNode root){
        ArrayList<Integer> list= new ArrayList<Integer>();
        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        System.out.println("Tree traversal order: ");
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            System.out.println(root.data);
            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
        }
    }

    public void inOrderTraversal(TreeNode root){
        ArrayList<Integer> list= new ArrayList<Integer>();
        System.out.println(root.data);
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
    }



}


