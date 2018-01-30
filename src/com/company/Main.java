package com.company;

import com.company.tree.BinTree;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinTree binTree=new BinTree();
        binTree.insert(2);
        binTree.insert(3);
        binTree.insert(1);
        binTree.insert(5);
        binTree.insert(4);
        binTree.insert(6);
        binTree.insert(9);
        binTree.insert(7);
        binTree.insert(8);

        System.out.println("root:"+binTree.getRoot().getData());
        System.out.println("--------中序遍历--------");
        binTree.inOrderTraverse(binTree.getRoot());
        System.out.println("--------先序遍历--------");
        binTree.preOrderTraverse(binTree.getRoot());
        System.out.println("--------后序遍历--------");
        binTree.postOrderTraverse(binTree.getRoot());




    }
}
