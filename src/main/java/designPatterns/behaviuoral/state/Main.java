package designPatterns.behaviuoral.state;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setState(new BrushTool());
        canvas.mouseUp();
        canvas.mouseDown();
        canvas.setState(new SelectionTool());
        canvas.mouseUp();
        canvas.mouseDown();
        canvas.setState(new EraserTool());
        canvas.mouseUp();
        canvas.mouseDown();

    }
}
