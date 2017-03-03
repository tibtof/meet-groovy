package meetgroovy.scripts

//spaceship operator -- compareTo
int x = 2
int y = 5

assert (x <=> y) == -1
assert (y <=> y) == 0
assert (y <=> x) == 1

//elvis operator
String name

//java like
//String n = (name != null && name.size() > 0 ? name : 'World')
n = name ?: 'World'
assert "Hello, $n"


