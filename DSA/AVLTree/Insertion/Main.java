public class Main {
    public static void main(String args[]) {
        AVL newAVL = new AVL();
        newAVL.insert(30);
        newAVL.insert(25);
        newAVL.insert(35);
        newAVL.insert(20);
        newAVL.insert(15);
        newAVL.insert(5);
        newAVL.insert(10);
        newAVL.insert(50);
        newAVL.insert(60);
        newAVL.insert(70);
        newAVL.insert(65);
        System.out.println();
        newAVL.levelOrder();
        System.out.println();
        newAVL.preOrder(newAVL.root);
        System.out.println();
        newAVL.inOrder(newAVL.root);
        System.out.println();
        newAVL.postOrder(newAVL.root);
        System.out.println();
        newAVL.levelOrder();
    }
}
