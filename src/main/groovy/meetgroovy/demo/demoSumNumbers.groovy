package meetgroovy.demo

List nums = [3, 1, 4, 1, 5, 9, 2, 6, 5]

println nums.sum() * 2

println nums.collect { it * 2 }.sum()

println nums.sum { it * 2 }

//sum with spread
println nums*.multiply(2).sum()

println((nums * 2).sum())

//reduce
println nums.inject(0) { acc, val ->
    println "acc=$acc, val==$val"
    acc + val * 2
}