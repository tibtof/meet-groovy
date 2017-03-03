package meetgroovy.demo

class FărăNumăr {
    static Number fărăNumăr(Number self) {
        self + new Random().nextInt(1_000_000_000)
    }

    static void amValoare(Object self, Object o) {
        println "am valoare $o fără număr"
    }

}

use(FărăNumăr) {
    amValoare 42.fărăNumăr()
}

