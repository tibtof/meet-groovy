package meetgroovy.scripts.closure

import groovy.transform.TailRecursive

def fib
fib = { long n -> n < 2 ? n : fib(n - 1) + fib(n - 2) }

//assert tfib(100) == 573147844013817084101G //StackOverflowError

//trampoline
def tfib
tfib = { n, last1 = 1G, last2 = 1G -> n == 0 ? 1G : n == 1 ? last1 : tfib.trampoline(n - 1, last1 + last2, last1) }.trampoline()

assert tfib(100) == 573147844013817084101G

//tail recursive method

@TailRecursive
mtfib(n, last1 = 1G, last2 = 1G) {
    n == 0 ? 1G : n == 1 ? last1 : mtfib(n - 1, last1 + last2, last1)
}

assert mtfib(100) == 573147844013817084101G
