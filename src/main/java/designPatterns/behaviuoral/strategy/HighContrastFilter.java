package designPatterns.behaviuoral.strategy;

public class HighContrastFilter implements designPatterns.behaviuoral.strategy.Filter{

    @Override
    public void apply(String image){
        System.out.println("HighContrastFilter");
    }
}
