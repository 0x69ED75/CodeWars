import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpinStream {
    public static void main(String[] args) {
        spinWords("Test Test1");
    }
    public static String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                .collect(Collectors.joining(" "));
    }

    }