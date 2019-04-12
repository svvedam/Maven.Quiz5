package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> implements Iterable<T>, GroupInterface<T>{
    List<T> groupList;
    public Group() {
        super();
        groupList = new ArrayList<>();
    }

    public Integer count() {

        return groupList.size();
    }

    public void insert(T value) {
        groupList.add(value);
    }

    public Boolean has(T value) {

        if(groupList.contains(value))
            return true;
        else
            return false;
    }

    public T fetch(int indexOfValue) {

        return groupList.get(indexOfValue);
    }

    public void delete(T value) {
        groupList.remove(value);
    }

    public void clear() {
        groupList.clear();
    }

    public Iterator<T> iterator() {
        return groupList.iterator();
    }
}
