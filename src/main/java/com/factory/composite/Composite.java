package com.factory.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 枝节点对象
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println("---" + depth + "---" + super.name);
        for (Component component : children) {
            component.display(depth + 1);
        }
    }
}
