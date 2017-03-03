package meetgroovy.scripts.collection

def map = [a: 1, b: 2, 'has space': 2]
map.put('d', 3)
map['e'] = 1
map.f = 3
assert map == [a: 1, b: 2, 'has space': 2, d: 3, e: 1, f: 3]

//.class looks for the 'class' key in the map
assert map.class == null
assert map.getClass().name == 'java.util.LinkedHashMap'

def map2 = [c: 4, a: 2]

assert map + map2 == [a: 2, b: 2, 'has space': 2, d: 3, e: 1, f: 3, c: 4]
//map is still the same
assert map == [a: 1, b: 2, 'has space': 2, d: 3, e: 1, f: 3]

assert map << map2 == [a: 2, b: 2, 'has space': 2, d: 3, e: 1, f: 3, c: 4]
//map has been mutated
assert map == [a: 2, b: 2, 'has space': 2, d: 3, e: 1, f: 3, c: 4]

//iterating
map.each { println "$it.key:$it.value" }
map.each { k, v -> println "$k:$v" }

//transforming
assert map.collect { k, v -> "$k=$v" }.join('&') == 'a=2&b=2&has space=2&d=3&e=1&f=3&c=4'