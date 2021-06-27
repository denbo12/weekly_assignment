fun main(args: Array<String>) {
    println(evenlySpaced(6,4,2))
}

fun evenlySpaced(num1: Int, num2: Int, num3: Int): Boolean{
    val diff1: Int = Math.abs(num1 - num2)
    val diff2: Int = Math.abs(num2 - num3)
    return (diff1 == diff2)
}