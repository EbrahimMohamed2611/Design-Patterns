package designPatterns.behaviuoral.state;
/*
 Concrete States provide their own implementations for the
state-specific methods. To avoid duplication of similar code across multiple states, you may provide intermediate abstract
classes that encapsulate some common behavior
 */
public class BrushTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Brush Tool is Mouse UP....");
    }

    @Override
    public void mouseDown() {
        System.out.println("Brush Tool is Mouse Down....");
    }
}
