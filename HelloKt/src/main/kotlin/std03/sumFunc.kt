package std03

fun sum(a: Int, b: Int): Int {
    var sum = a+b
    return sum
}

fun sum2(a: Int, b: Int): Int = a+b

fun sum3(a: Int, b:Int) = a+b

fun max(a: Int, b: Int) = if (a>b) a else b

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a+b}")
}
