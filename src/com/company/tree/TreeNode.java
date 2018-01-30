package com.company.tree;

/**
 * 二叉树结点
 *
 * @author Luo
 * @create 2018-01-29 10:28
 **/
public class TreeNode {
    private int data;
    private TreeNode lNode;
    private TreeNode rNode;
    private boolean isDeleted;
    private TreeNode(int data,TreeNode lNode,TreeNode rNode,boolean isDeleted){
        this.lNode=lNode;
        this.rNode=rNode;
        this.data=data;
        this.isDeleted=isDeleted;
    }
    public TreeNode(int data){
        this.data=data;
        this.lNode=null;
        this.rNode=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getlNode() {
        return lNode;
    }

    public void setlNode(TreeNode lNode) {
        this.lNode = lNode;
    }

    public TreeNode getrNode() {
        return rNode;
    }

    public void setrNode(TreeNode rNode) {
        this.rNode = rNode;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
