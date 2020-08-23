package std03

fun main() {
    val name = "Kim"
    val email = "dobi@gmail.com"

    add(name)
    add(name, email)
    add("Lee", "dooly@gmail.com")
    defaultArgs()
    defaultArgs(200)
    namedParam(x=200, z= 100)
    namedParam(z=200)
    normalVarargs(1,2,3,4,5)
    print(highFunc({x, y -> x + y}, 10, 20))
}

fun add(name: String, email: String = "default") {
    val output = "${name}님의 이멜은 ${email}."
    println(output)
}

fun defaultArgs(x: Int = 100, y: Int = 200) {
    println(x+y)
}

fun namedParam(x: Int = 100, y: Int = 200, z: Int) {
    println(x+y+z)
}
// 여러 인자 전달
fun normalVarargs(vararg counts: Int) {
    for (num in counts) {
        println("$num")
    }
}

// 고차 함수
fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int): Int = sum(a, b)
