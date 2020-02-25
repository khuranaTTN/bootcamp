package java8session.Q2;

import java.util.function.BiFunction;

public class BiFunImplement {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> Myfunc = (e1, e2) ->
                e1 + e2;
        System.out.println(Myfunc.apply(2, 8));
    }

}
