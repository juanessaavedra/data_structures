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

    public static <T extends Comparable<T>> T maximum (T a, T b, T c, T d, T e) {
        T max = a;
        if (b.compareTo(max) > 0)
            max = b;

        if (c.compareTo(max) > 0)
            max = c;

        if (d.compareTo(max) > 0)
            max = d;

        if (e.compareTo(max) > 0)
            max = e;

        return max;
    }
}
