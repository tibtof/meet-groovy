package meetgroovy;

import groovy.lang.Reference;

public class LambdaCaptureVariable {

    public static void main(String[] args) {
        Integer i = 0;
        Reference<Integer> ref = new Reference<>(i);
        Runnable r = () -> ref.set(ref.get() + 1);
        r.run();
        i = ref.get();
        System.out.println(i);
    }

}
