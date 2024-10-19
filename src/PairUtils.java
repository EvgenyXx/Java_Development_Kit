public class PairUtils {
    public static <T extends Number> double sum(Pair<T, T> pair) {
        return pair.getFirst().doubleValue() + pair.getSecond().doubleValue();
    }

    public static String concatenate(Pair<String, String> pair) {
        return pair.getFirst() + pair.getSecond();
    }
}