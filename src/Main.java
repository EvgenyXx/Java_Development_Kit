import static java.lang.Integer.sum;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, Integer> intPair = new Pair<>(3, 5);
        System.out.println("Сумма целых чисел: " + sum(3,5));

        Pair<String, String> stringPair = new Pair<>("Hello, ", "World!");
        System.out.println("Конкатенация строк: " + PairUtils.concatenate(stringPair));
    }




}