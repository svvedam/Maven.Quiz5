package rocks.zipcode.io.quiz4.generics;

import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<T> extends TreeSet<T> implements Comparable {

    public ComparableTreeSet(T... arr) {


        for (int i = 0; i < arr.length; i++) {
            T t = arr[i];
            this.add(t);

        }
    }
    public ComparableTreeSet() {

    }

    public int compareTo(ComparableTreeSet<T> o) {

        return this.toString().compareTo(o.toString());
    }

    @Override
    public int compareTo(Object o){
        if(!(o instanceof ComparableTreeSet))
            return -1;
        ComparableTreeSet<T> set2 =(ComparableTreeSet)o;
        return this.compareTo(set2);
    }

}
