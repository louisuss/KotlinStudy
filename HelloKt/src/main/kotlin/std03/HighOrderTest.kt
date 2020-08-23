package std03

fun main() {
    var result: Int
    val multi = {x: Int, y: Int -> x*y} // 일반 변수에 람다식 할당
    // val multi: (Int, Int) -> Int = {x:Int, y: Int -> x*y}
    // val multi: (Int, Int) -> Int = {x, y -> x*y}

    result = multi(10, 20)
    println(result)

    val multi2: (Int, Int) -> Int = { x: Int, y: Int ->
        println("x*y")
        x*y
    }
    val great: () -> Unit = {println("Hello")}
    // val great = {println("Hello")}
    val square: (Int) -> Int = {x->x*x}
    // val square = {x: Int -> x*x}
    val nestedLambda: () -> () -> Unit = {{println("nested")}}
    // val nestedLambda = {{println("nested")}}

    var result2: Int
    result2 = highOrder({x,y -> x+y}, 10, 20)
    println(result2)

    val out: () -> Unit = {println("Hello")}
    out()
    val new = out
    new()
}

fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a, b)
}