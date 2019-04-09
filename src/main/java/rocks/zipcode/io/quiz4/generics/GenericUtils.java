package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <T extends Comparable> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet) {
        return null;
    }

    public static <T extends Comparable> Iterable<? extends Iterable<T>> powerSet(T... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

