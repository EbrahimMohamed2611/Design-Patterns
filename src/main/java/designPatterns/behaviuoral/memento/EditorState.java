package designPatterns.behaviuoral.memento;

// memento : must be in immutable
public final class EditorState {

    // this state should not be changed from outside so make it final and immutable object if you can like String
    private final String state;

    public EditorState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
