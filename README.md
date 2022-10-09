# Design-Patterns

![Design-Pattern](design-patterns.png)

<summary> Behavioural Patterns</summary>

| #   | Pattern Name | Context (The Problem)                    | Classes With Description                                                                                                                                                                                                                                                                                                                                                                                                                            |                                             
|-----|--------------|------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1   | Memento      | Implement Undo mechanism Like (CTRL + Z) | `Memento:` is a value object that acts as a snapshot of the originator’s state. It’s a common practice to make the memento immutable and pass it the data only once, via the constructor <br/> `Caretaker:`  knows not only “when” and “why” to capture the originator’s state, but also when the state should be restored<br/>`Originator:` class can produce snapshots of its own state, as well as restore its state from snapshots when needed. |                                             
