package designPatterns.structural.adapter;

import designPatterns.structural.adapter.duck.Duck;
import designPatterns.structural.adapter.turky.Turkey;

// we need to convert turkey to duck
public class TurkeyAdapter implements Duck {
    // Composition
    private final Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    // Delegation
    @Override
    public void quack() {
        turkey.gobble();
    }

    // Delegation
    @Override
    public void fly() {
        turkey.fly();
    }
}
