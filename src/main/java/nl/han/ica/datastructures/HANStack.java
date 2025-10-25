package nl.han.ica.datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class HANStack<T> implements IHANStack<T> {

    private final LinkedList<T> data = new LinkedList<>();

    @Override public void push(T value) { data.push(value); }
    @Override public T pop() { return data.pop(); }
    @Override public T peek() { return data.peek(); }
}
