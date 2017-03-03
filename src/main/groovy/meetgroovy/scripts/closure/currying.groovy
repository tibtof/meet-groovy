package meetgroovy.scripts.closure

//currying
def power = { int n, int power -> n**power }
def power2 = power.rcurry(2)
assert power2(2) == 4

//default argument value
def sum = { n, toAdd = 2 -> n + toAdd }
assert sum(5) == 7
assert sum(5, 3) == 8

//default param for method
def div(n, divisor = 2) {
    n / divisor
}

assert div(5) == 2.5
assert div(10, 5) == 2