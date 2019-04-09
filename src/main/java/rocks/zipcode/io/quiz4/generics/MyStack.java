package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Stack;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable{

    Stack<SomeType> stack;
    public MyStack() {
        stack = new Stack<>();
    }

    public Boolean isEmpty() {

        if(stack.isEmpty())
            return true;
        else
            return false;
    }

    public void push(SomeType i) {
        stack.push(i);
    }

    public SomeType peek() {
        if(stack.isEmpty())
            return null;
        return stack.peek();

    }

    public SomeType pop() {

        return stack.pop();
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
