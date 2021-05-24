package com.factory.base.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 枝节点对象
 */
public class Composite extends Component {

    private final List<Component> children = new ArrayList<>();

    public Composite(final String name) {
        super(name);
    }

    @Override
    public void add(final Component c) {
        children.add(c);
    }

    @Override
    public void remove(final Component c) {
        children.remove(c);
    }

    @Override
    public void display(final int depth) {
        System.out.println("---" + depth + "---" + super.name);
        for (final Component component : children) {
            component.display(depth + 1);
        }
    }
}
