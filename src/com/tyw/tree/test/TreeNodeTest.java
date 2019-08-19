package com.tyw.tree.test;

/**
 * @Description TODO
 * @Author taoyinwu
 * @Date 2019/8/15 9:48
 */
public class TreeNodeTest {

    public static void main(String[] args) {
        TreeNode treeNode10 = new TreeNode(10);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode20 = new TreeNode(20);
        TreeNode treeNode15 = new TreeNode(15);
        TreeNode treeNode35 = new TreeNode(35);


        //根节点的左右孩子
        treeNode10.setLeftTreeNode(treeNode9);
        treeNode10.setRightTreeNode(treeNode20);

        //20节点的左右孩子
        treeNode20.setLeftTreeNode(treeNode15);
        treeNode20.setRightTreeNode(treeNode35);

        System.out.println("先序遍历");
        TreeNode.preTraverseBTree(treeNode10);

        System.out.println("中序遍历");
        TreeNode.inTraverseBTree(treeNode10);

        System.out.println("后序遍历");
        TreeNode.nextTraverseBTree(treeNode10);


        System.out.println("---------------动态创建树---------------");


        int[] arrays = {2, 3, 1, 4, 5};

        //动态创建树

        TreeRoot root = new TreeRoot();
        for (int value : arrays) {
            TreeRoot.createTree(root, value);
        }

        //先序遍历树
        TreeNode.preTraverseBTree(root.getTreeRoot());


        //中序遍历树
        TreeNode.inTraverseBTree(root.getTreeRoot());


    }


}
