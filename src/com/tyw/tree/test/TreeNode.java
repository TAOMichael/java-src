package com.tyw.tree.test;

/**
 * @Description 树节点
 * @Author taoyinwu
 * @Date 2019/8/15 9:44
 */
public class TreeNode {
    //左节点 （左儿子）
    private TreeNode leftTreeNode;

    //右节点（右儿子）
    private TreeNode rightTreeNode;

    //数据
    private int value;

    public TreeNode getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(TreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public TreeNode getRightTreeNode() {
        return rightTreeNode;
    }

    public void setRightTreeNode(TreeNode rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode(int value) {
        this.value = value;
    }

    /**
     * 先序遍历
     *
     * @param rootTreeNode 根节点
     */
    public static void preTraverseBTree(TreeNode rootTreeNode) {

        if (rootTreeNode != null) {

            //访问根节点
            System.out.println(rootTreeNode.getValue());

            //访问左节点
            preTraverseBTree(rootTreeNode.getLeftTreeNode());

            //访问右节点
            preTraverseBTree(rootTreeNode.getRightTreeNode());
        }
    }


    /**
     * 中序遍历
     *
     * @param rootTreeNode 根节点
     */
    public static void inTraverseBTree(TreeNode rootTreeNode) {

        if (rootTreeNode != null) {

            //访问左节点
            inTraverseBTree(rootTreeNode.getLeftTreeNode());

            //访问根节点
            System.out.println(rootTreeNode.getValue());

            //访问右节点
            inTraverseBTree(rootTreeNode.getRightTreeNode());
        }
    }

    /**
     * 后序遍历
     *
     * @param rootTreeNode 根节点
     */
    public static void nextTraverseBTree(TreeNode rootTreeNode) {

        if (rootTreeNode != null) {

            //访问左节点
            inTraverseBTree(rootTreeNode.getLeftTreeNode());


            //访问右节点
            inTraverseBTree(rootTreeNode.getRightTreeNode());

            //访问根节点
            System.out.println(rootTreeNode.getValue());

        }
    }
}
