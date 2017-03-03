package meetgroovy;

import java.util.Arrays;
import java.util.Date;

public class MethodOverloadingJava {

    public static int foo(String o) {
        return 1;
    }

    public static int foo(Date o) {
        return 2;
    }

    public static int foo(Object o) {
        return 3;
    }

    public static void main(String[] args) {
        Arrays.stream(new Object[]{"a string", new Date(), 666})
                .forEach(o -> System.out.println(foo(o)));
    }

}
