package meetgroovy.scripts.closure

import groovy.transform.Memoized

//memoization
def fib
fib = { n -> n < 2 ? 1G : fib(n - 1) + fib(n - 2) }

assert fib(10) == 89G
// assert fib(100) == 573147844013817084101 //very slow

def fibm
fibm = { n -> n < 2 ? 1G : fibm(n - 1) + fibm(n - 2) }.memoize()

assert fibm(100) == 573147844013817084101G

//memoized method

@Memoized
mfibm(n) {
    n < 2 ? 1G : mfibm(n - 1) + mfibm(n - 2)
}

assert mfibm(100) == 573147844013817084101G
