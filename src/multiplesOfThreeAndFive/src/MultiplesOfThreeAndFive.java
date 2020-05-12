package multiplesOfThreeAndFive.src;

import java.util.ArrayList;
import java.util.List;

public class MultiplesOfThreeAndFive {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                list.add(i);
            }
        }
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}