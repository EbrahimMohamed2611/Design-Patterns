package designPatterns.structural.adapter;

import designPatterns.structural.adapter.duck.Duck;
import designPatterns.structural.adapter.duck.MallardDuck;
import designPatterns.structural.adapter.turky.Turkey;
import designPatterns.structural.adapter.turky.WildTurkey;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.quack();
        duck.fly();

        Turkey turkey = new WildTurkey();
        turkey.gobble();
        turkey.fly();
        System.out.println("Adapter from Turkey To Duck");
        Turkey fromTurkeyToDuck = new WildTurkey();
        Duck duckAfterAdapter = new TurkeyAdapter(fromTurkeyToDuck);
        duckAfterAdapter.quack();
        duckAfterAdapter.fly();
        System.out.println("Adapter from Duck To Turkey");
        Duck fromDuckToTurkey = new MallardDuck();
        Turkey afterAdapterFromDuckToTurkey = new DuckAdapter(fromDuckToTurkey);
        afterAdapterFromDuckToTurkey.gobble();
        afterAdapterFromDuckToTurkey.fly();

    }
}
