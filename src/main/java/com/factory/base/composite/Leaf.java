package com.factory.base.composite;

/**
 * 叶子节点对象
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("add for leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("remove for leaf");
    }

    @Override
    public void display(int depth) {
        System.out.println("---" + depth + "---" + super.name);
    }

}
