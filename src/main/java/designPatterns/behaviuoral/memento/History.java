package designPatterns.behaviuoral.memento;

import java.util.Stack;

//Caretaker
public class History {
    // should have the list of prev states
    Stack<EditorState> history = new Stack<>();

    //should have two functionalities
    // First push new State
    public void push(EditorState editorState){
        history.push(editorState);
    }

    //Second pop the prev state
    public EditorState pop(){
        return history.pop();
    }
}
