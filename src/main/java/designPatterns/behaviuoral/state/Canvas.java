package designPatterns.behaviuoral.state;

// Represent the Context Class
/*
Context stores a reference to one of the concrete state objects
and delegates to it all state-specific work. The context communicates with the state object via the state interface.
The context exposes a setter for passing it a new state object.
 */
public class Canvas {
    private Tool state;

    public void mouseUp(){
        state.mouseUp();
    }
    public void mouseDown(){
        state.mouseDown();
    }

    public void setState(Tool state) {
        this.state = state;
    }
}
