package rocks.zipcode.io.quiz4.generics;

import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<T> {
    TreeSet<T> myTreeSet;
    public ComparableTreeSet(T... arr) {
        for (int i = 0; i < arr.length; i++) {
            T t = arr[i];
            myTreeSet.add(t);

        }
    }

    public ComparableTreeSet() {
        myTreeSet = new TreeSet<>();
    }

    public int compareTo(ComparableTreeSet<T> o) {

        if(myTreeSet.equals(o))
            return 0;
            else
                return -1;

        //return Integer.valueOf(null);
    }
}
