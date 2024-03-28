// with
// run과 동일한 기능을 가지지만 단지 인스턴스를 참조연산자 대신 패러미터로 받는다



class Person {
    var name: String? = null
    var age: Int? = null
}
val person: Person = getPerson()
print(person.name)
print(person.age)

val person: Person = getPerson()
with(person) {
    print(name)
    print(age)
}