package meetgroovy

class MethodOverloadingGroovy {

    static int foo(String o) {
        return 1
    }

    static int foo(Date o) {
        return 2
    }

    static int foo(Object o) {
        return 3
    }

    static void main(String[] args) {
        ["a string", new Date(), 42].each { println foo(it) }
    }

}
