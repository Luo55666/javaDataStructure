package com.company.tree;

/**
 * tree:链表实现
 *
 * @author Luo
 * @create 2018-01-29 9:56
 **/
public class normalTree  {
    private Object data;
    private normalTree parent;
    private normalTree child;

    public normalTree(Object data,normalTree parent){
        this.data=data;
        this.parent=parent;
    }


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public normalTree getParent() {
        return parent;
    }

    public void setParent(normalTree parent) {
        this.parent = parent;
    }

    public normalTree getChild() {
        return child;
    }

    public void setChild(normalTree child) {
        this.child = child;
    }
}
