package meetgroovy.scripts

//the smallest type that fits the literal is used
println 34.class.name
println 323434123554.class.name
println 4325345213215345435341451.class.name

//the default type for floating point literals is BigDecimal
println 35.2.class.name
println 2.0d - 1.1d
println 2.0 - 1.1

//division defaults to BigDecimal precision
println 3 / 2

//iterate
3.upto(6) { println it }
10.downto(0) { println it }
0.step(10, 2) { println it }

//spaceship operator
println 0 <=> 5
println 3 <=> 1
println 3 <=> 3