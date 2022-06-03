import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Outlier {
    public static void main(String[] args) {
        int[] exampleTest1 = {11, 63, 91, 200003, 101, 103, 44};
        System.out.println(find(exampleTest1));
    }

    public static int find(int[] integers) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();

        for (int i = 0; i < integers.length ; i++){
            if (integers[i] % 2 == 0){
                x.add(integers[i]);
            }
            else{
                y.add(integers[i]);
            }
        }
        if (x.size() > y.size()){
            return y.get(0);
        }
        return x.get(0);
    }
}
