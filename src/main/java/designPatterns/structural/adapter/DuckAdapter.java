package designPatterns.structural.adapter;

import designPatterns.structural.adapter.duck.Duck;
import designPatterns.structural.adapter.turky.Turkey;

// Convert Duck To Turkey
public class DuckAdapter implements Turkey {
    //Composition
    private final Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }


    // Delegation
    @Override
    public void gobble() {
        duck.quack();
    }

    // Delegation
    @Override
    public void fly() {
        duck.fly();
    }
}
