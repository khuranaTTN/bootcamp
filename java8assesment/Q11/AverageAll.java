package java8session.Q11;
//Find average of the number inside integer list after doubling it.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageAll {
    public static void main(String[] args) {

        List<Integer> evenList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Double result= evenList.stream().map(e->e*2).collect(Collectors.averagingInt(e->e));
        System.out.println(result);
    }
}

