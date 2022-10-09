package designPatterns.behaviuoral.memento;
// Originator
public class Editor {
    //Here should we have just the Editor features
    private StringBuilder content;

    public Editor() {
        content = new StringBuilder();
    }

    public String getContent() {
        return content.toString();
    }

    public void setContent(String content) {
        this.content.append(content);
    }

    // we have two functionalities
    // First: create New State for the content
    public EditorState hitSave(){
        return new EditorState(content.toString());
    }

    // Second ability to restore the previous states
    public void restore(EditorState editorState){
        content = new StringBuilder(editorState.getState());
    }
}
