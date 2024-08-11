fun main() {
    val count = 5
    val a = add(count,5)
    val b = sub(count,3)
    println(a)
    println(b)
    println(a)
    println(b)
}

fun add(a: Int, b: Int): Int = a + b
fun sub(a: Int, b: Int): Int = a - b
