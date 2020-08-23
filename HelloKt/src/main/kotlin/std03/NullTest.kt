package std03

fun main() {
    var str1: String? = "Hello"
    str1 = null
    println("str1: ${str1?.length ?: -1}")
}