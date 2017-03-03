package meetgroovy.scripts.collection

Range r = 1..10
println r
println "$r.from $r.to"

//opened range
r = 1..<10
println r

//backwards
(10..1).each { println it }

//reversed
r.reverse().each { println it }