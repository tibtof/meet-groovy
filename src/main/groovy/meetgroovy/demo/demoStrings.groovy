package meetgroovy.demo

import java.util.stream.Collectors


List<String> strings = 'this is a list of strings'.split()

//Java natural sort
Collections.sort(strings)
println strings

//Java sort by length
println strings.stream().sorted(Comparator.comparing({ s -> s.size() })).collect(Collectors.toList())

//groovy way
println strings.sort()

println strings.sort(false) { it.size() }

//fat Elvis carried out by two spaceships
println strings.sort(false) { String s1, String s2 ->
    s1.size() <=> s2.size() ?: s2 <=> s1
}

//assert strings*.size() == [1, 2, 2, 4, 4, 7]