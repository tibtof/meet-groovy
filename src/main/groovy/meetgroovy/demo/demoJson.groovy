package meetgroovy.demo

import groovy.json.JsonSlurper

String api = 'http://api.icndb.com/jokes/random'
def sq = [limitTo: '[nerdy]', firstName: 'Chuck', lastName: 'Norris']
        .collect { k, v -> "$k=$v" }.join('&')
def json = new JsonSlurper().parseText("$api?$sq".toURL().text)
println json.value.joke
