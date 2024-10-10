package generics.generics_challenge2;

public class Main {
    public static void main(String[] args) {
        CompareNumbers<Integer> compareNumbers = new CompareNumbers<>();
        System.out.println(compareNumbers.minimum(1, 2, 3, 4, 5));
    }
}
