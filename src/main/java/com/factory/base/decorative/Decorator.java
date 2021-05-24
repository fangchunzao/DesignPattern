package com.factory.base.decorative;

public class Decorator extends Component {

    private Component component;

    public void setComponent(final Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }

}
