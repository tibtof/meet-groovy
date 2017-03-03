package meetgroovy.scripts.collection

def a = [1, 5, 6, 9] as Set
def b = [3, 5, 8, 9] as Set

//dif
assert a - b == [1, 6] as Set

//union
assert a + b == [1, 5, 6, 9, 3, 5, 8, 9] as Set

//intersection
assert a.intersect(b) == [5, 9] as Set

//sorted set
def numbers = [4, 2, 4, 8, 5, 8, 6, 5] as SortedSet
assert numbers == [2, 4, 5, 6, 8] as Set
assert numbers.class.name == 'java.util.TreeSet'
