package meetgroovy.scripts.closure

def code = { 123 }

//explicit invoking
assert code.call() == 123
// () is actually an overloading for call()
assert code() == 123
//self invoking anonymous closure
assert { 123 }() == 123
