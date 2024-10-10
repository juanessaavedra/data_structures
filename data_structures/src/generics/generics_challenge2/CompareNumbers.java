package generics.generics_challenge2;

public class CompareNumbers {

    public static <T extends Comparable<T>> T minimum (T a, T b, T c, T d, T e) {
        T min = a;
        if (b.compareTo(min) < 0)
            min = b;

        if (c.compareTo(min) < 0)
            min = c;

        if (d.compareTo(min) < 0)
            min = d;

        if (e.compareTo(min) < 0)
            min = e;

        return min;
    }
}
