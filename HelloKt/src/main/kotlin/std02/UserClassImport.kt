package std02

import std01.Person as User

fun main() {
    val user1 = User("kil", 30)
    val user2 = Person("a12", "kil")

    println(user1.name)
    println(user1.age)
    println(user2.id)
    println(user2.name)
}
class Person(val id: String, val name: String)