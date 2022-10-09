package designPatterns.behaviuoral.state;

// Represent the State

/*
The State interface declares the state-specific methods. These
methods should make sense for all concrete states because
you don’t want some of your states to have useless methods
that will never be called
 */
public interface Tool {
    void mouseUp();
    void mouseDown();
}
