package designPatterns.behaviuoral.strategy;



public class BlackAndWhiteFilter implements designPatterns.behaviuoral.strategy.Filter {

    @Override
    public void apply(String image){
        System.out.println("BlackAndWhiteFilter....");
    }
}
