package com.factory.base.composite;

public class Main {

    public static void main(final String[] args) {
        final Composite root = new Composite("root");
        root.add(new Leaf("leaf A"));
        root.add(new Leaf("leaf B"));

        final Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));

        root.add(comp);

        final Composite comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("Leaf XYA"));
        comp2.add(new Leaf("Leaf XYB"));

        comp.add(comp2);

        root.add(new Leaf("leaf C"));

        final Leaf leaf = new Leaf("leaf D");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);
    }
}
