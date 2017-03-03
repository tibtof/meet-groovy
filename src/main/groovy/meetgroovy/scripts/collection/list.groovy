package meetgroovy.scripts.collection

//native syntax
def numbers = [3, 1, 5, 9]
println numbers
println numbers.class.name
println numbers.drop(3)

//flatten
def l = [3, [1, 4], [3, 4], 7].flatten()
println l
println l[1..3]
println l[-1..-3]
println l - 4
println l * 2
println l + 5

//returns a new list
println l + [1, 3, 4]
println l

//modifies the list in place and returns it
println l << [1, 3, 4]
println l

def linkedList = [5, 2, 8, 4, 5, 8, 2] as LinkedList
println linkedList.class.name

//generics are not enforced
List<Integer> nums = [3, 1, 4, 1, 5, 9, 'abc']
nums.add('4')
println nums.class.name

def strings = 'this is a list of strings'.split()
//spread operator to apply a method to all elements
println strings*.size()

//transforming
assert numbers
        .collect { it * 2 } //map
        .findAll { it % 3 == 0 } //filter
        .sum() == 24

//using java streams
assert numbers.stream()
        .map { it * 2 } //closure is coerced into a functional interface
        .filter { it % 3 == 0 }
        .mapToInt { it.intValue() }
        .sum() == 24
