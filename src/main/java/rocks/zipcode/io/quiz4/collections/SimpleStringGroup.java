package rocks.zipcode.io.quiz4.collections;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup<T> implements Iterable<T> {
    List<T> myList;
    public SimpleStringGroup() {
       myList = new ArrayList<>();
    }

    public Integer count() {

        return myList.size();
    }

    public void insert(T string) {
        myList.add(string);
    }

    public Boolean has(T string) {

       if(myList.contains(string))
           return true;
       else
           return false;
    }

    public T fetch(int indexOfValue) {

        if(indexOfValue>count())
            throw new IndexOutOfBoundsException();
        else
            return myList.get(indexOfValue);
    }

    public void delete(T string) {
        myList.remove(string);
    }

    public void clear() {
        myList.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {

//        Objects.requireNonNull(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }
}
