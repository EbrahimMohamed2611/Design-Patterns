package designPatterns.behaviuoral.memento;

public class Main {
    /*
    Challenges of memento pattern
    A high number of mementos require more storage. At the same time, they put additional burdens on a caretaker.
    It also increases maintenance costs in parallel because code efforts needs to be made to manage memento classes as well.
    The additional time to save the states decreases the overall performance of the system.
     */
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("A\n");
        history.push(editor.hitSave());

        editor.setContent("B");
        history.push(editor.hitSave());

        editor.setContent("C"); // we will not save this change
        EditorState pop = history.pop();
        editor.restore(pop);

        System.out.println(editor.getContent());
    }
}
