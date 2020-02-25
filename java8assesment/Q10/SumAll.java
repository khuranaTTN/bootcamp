package java8session.Q10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumAll {
    public static void main(String[] args) {

        List<Integer> evenList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer result= evenList.stream().filter(e->e>5).collect(Collectors.summingInt(e->e));
        System.out.println(result);
    }
}
