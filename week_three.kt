fun main(args: Array<String>) {
    //puts range of numbers in checkForMultipleOf3and5() function.
    for (k in 1..100){
        checkForMultipleOf3and5(k)
    }
    //calls the printStringBackward function to print any string place inside it backward.
    printStringBackward("wood")
}

//Task 1: checks for multiple of 3 and 5 or prints the number that is not multiple of 3 or 5.
fun checkForMultipleOf3and5(num: Int){
    when{
        ((num%3 == 0) && (num%5 == 0))-> println("FizzBuzz")
        (num%3 == 0) -> println("Fizz")
        (num%5 == 0) -> println("Buzz")
        else -> println(num)
    }
}
//task 2: function to print string backward
fun printStringBackward(str: String){
    var l: Int = 0
    //gets the last index of the String
    for(k in str){
        l++
    }
    l--
    //prints the string backwards
    while(l >= 0){
        print(str[l])
        l--
    }
}