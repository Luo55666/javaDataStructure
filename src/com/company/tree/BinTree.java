package com.company.tree;

import sun.reflect.generics.tree.Tree;

/**
 * BinTree
 *
 * @author Luo
 * @create 2018-01-29 10:30
 **/
public class BinTree {
    private TreeNode root;


    public TreeNode getRoot() {
        return root;
    }

    /**
     * 插入操作
     * @param data
     */
    public void insert(int data){
        TreeNode treeNode=new TreeNode(data);
        if(root==null){
            root=treeNode;
            root.setlNode(null);
            root.setrNode(null);
        }else{
            TreeNode currentNode=root;
            TreeNode parentNode;
            while(true){
                parentNode=currentNode;
                if(treeNode.getData()>currentNode.getData()){
                    currentNode=currentNode.getrNode();
                    if(currentNode==null){
                        parentNode.setrNode(treeNode);
                        break;
                    }
                }else{
                    currentNode=currentNode.getlNode();
                    if(currentNode==null){
                        parentNode.setlNode(treeNode);
                        break;
                    }
                }

            }
        }

    }

    /**
     * 查找方法
     * @param data
     * @return
     */
    public TreeNode findkey(int data){
        TreeNode currentNode=root;
        while (true){
            if(data==currentNode.getData()){
                return currentNode;
            }else if(data<currentNode.getData()){
                currentNode=currentNode.getlNode();
            }else{
                currentNode=currentNode.getrNode();
            }
            if (currentNode==null){
                return null;
            }
        }

    }

    /**中序遍历：左-根-右
     * @param treeNode
     */
    public void inOrderTraverse(TreeNode treeNode){

        if(treeNode!=null){
            inOrderTraverse(treeNode.getlNode());
            System.out.println(treeNode.getData());
            inOrderTraverse(treeNode.getrNode());
        }


    }

    /**先序遍历：根-左-右
     * @param treeNode
     */
    public void preOrderTraverse(TreeNode treeNode){
        if(treeNode!=null) {
            System.out.println(treeNode.getData());
            preOrderTraverse(treeNode.getlNode());
            preOrderTraverse(treeNode.getrNode());
        }
    }
    /**先序遍历：左-右-根
     * @param treeNode
     */
    public void postOrderTraverse(TreeNode treeNode){
        if(treeNode!=null){
            postOrderTraverse(treeNode.getlNode());
            postOrderTraverse(treeNode.getrNode());
            System.out.println(treeNode.getData());
        }
    }




}
