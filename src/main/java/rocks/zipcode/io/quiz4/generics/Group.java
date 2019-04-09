package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> implements Iterable{
    List<T> groupList;
    public Group() {
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
    }

    public void clear() {
        groupList.clear();
    }

    public Iterator<T> iterator() {
        int current = groupList.size()-1;

        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                 return ( current >= 0 );
            }

            @Override
            public T next() {
                return groupList.get( current + 1 );
            }
        };
    }
}
