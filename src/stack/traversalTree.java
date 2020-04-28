package stack;

import java.util.Stack;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/4 23:43
 */
public class traversalTree {
    NodeType root = null;
    static int i = 0;
    private int[] arr;

    public NodeType buildTree() {
        int t = arr[i];
        NodeType node = new NodeType();
        if (t == 0)
            return null;
        node.value = t;
        i++;
        node.left = buildTree();
        i++;
        node.right = buildTree();
        return node;
    }


    public void preTraversal() {
        Stack a = new Stack();
        a.push(root);
        NodeType t;
        while (!a.isEmpty()) {
            t = (NodeType) a.pop();
            //System.out.println(a.isEmpty() );
            while (t != null) {
                System.out.println(t.value);
                if (t.right != null) {
                    a.push(t.right);
                }
                t = t.left;
            }
        }
    }

    public void midTraversal() {
        Stack a = new Stack();

        NodeType t = root;
        while (t != null || !a.isEmpty()) {
            while (t != null) {
                a.push(t);
                t = t.left;
            }
            t = (NodeType) a.pop();
            System.out.println(t.value);
            t = t.right;
        }
    }

    public void postorderTraversal() {
        int[] sign = new int[20];
        Stack stack = new Stack();
        NodeType t = new NodeType();
        t = root;
        if (t == null)
            return;

        while (t != null) {
            stack.push(t);
            sign[stack.size() - 1] = 0;
            t = t.left;
        }
        while (!stack.isEmpty()) {
            t = (NodeType) stack.peek();
            while (t.right != null && sign[stack.size() - 1] == 0) {
                sign[stack.size() - 1] = 1;
                t = t.right;
                while (t != null) {
                    stack.push(t);
                    sign[stack.size() - 1] = 0;
                    t = t.left;
                }
                t = (NodeType) stack.peek();

            }
            System.out.println(t.value);
            stack.pop();
        }


    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 0, 4, 0, 0, 5, 6, 0, 0, 0, 7, 8, 0, 10, 0, 0, 9, 0, 0};
        /*                             1
         *                          2     7
         *                       3     5  8  9
         *                         4 6      10
         */

        traversalTree tree = new traversalTree();
        tree.arr = a;
        Integer i = 0;
        tree.root = tree.buildTree();
       // tree.preTraversal();
        tree.midTraversal();
    }

}


class NodeType {
    NodeType left, right;
    int value;

    public NodeType(int _value) {
        this.value = _value;
        left = null;
        right = null;
    }

    public NodeType() {

    }
}
