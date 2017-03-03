package meetgroovy.demo

println 'https://www.rinftech.com'.toURL().text

String base = 'https://maps.googleapis.com/maps/api/geocode/xml?'
def address = ['2 Gara Herastrau', 'Bucharest'].collect { URLEncoder.encode it, 'UTF-8' }.join(',')
println "${base}address=$address".toURL().text
def root = new XmlSlurper().parseText("${base}address=$address".toURL().text)
def location = root.result.first().geometry.location
println "(${location.lat},${location.lng})"
println root.result.address_component.find { it.type == 'postal_code' }.short_name
