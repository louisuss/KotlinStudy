package std03

fun main() {
    val res1 = sumTest(3,2)
    val res2 = mul(sum(3,3), 3)

    println("res1: $res1, res2: $res2")
    println("funcFunc: ${funcFunc()}")
}

fun sumTest(a: Int, b: Int) = a + b
fun mul(a: Int, b: Int) = a * b

fun funcFunc(): Int {
    return sumTest(2,2)
}