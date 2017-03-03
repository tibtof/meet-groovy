package meetgroovy.scripts

import meetgroovy.Person

import static java.time.LocalDate.parse

def csv = """John,Doe,1945-06-10
            |Marry,White,1999-01-05
            |Albert,Bane,1996-05-08
            |""".stripMargin()

def persons = (csv =~ /(.*),(.*),(.*)/).collect { match, firstName, lastName, birthDate ->
    new Person(firstName: firstName, lastName: lastName, birthDate: parse(birthDate))
}

assert persons*.birthDate.year == [1945, 1999, 1996]
