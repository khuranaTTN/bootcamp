package java8session.Q9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenList {
    public static void main(String[] args) {

        List<Integer> evenList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List result= evenList.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(result);
    }
}

