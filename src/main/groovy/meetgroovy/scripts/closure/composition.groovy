package meetgroovy.scripts.closure

def add2 = { a -> a + 2 }
def multiply2 = { a -> a * 2 }

def add2multiply2 = add2 >> multiply2
assert add2multiply2(5) ==  14

def multiply2add2 = add2 << multiply2
assert multiply2add2(5) == 12