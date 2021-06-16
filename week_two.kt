fun main(args: Array<String>) {


    //Question-1
    // Define 10 if statements and 5 conditional expressions using the when keyword.
    var a: Int = 1
    var b: Int = 2
    var c: Int = 3
    var d: Int = 4
    var e: Int = 5
    if (a in 1..10){
        println(a)
    }
    else if (b in 1..10){
        println(b)
    }
    else if (c in 1..10){
        println(c)
    }
    else if (c in 1..10){
        println(c)
    }
    else if (d in 1..10){
        println(d)
    }
    else if (e in 1..10){
        println(e)
    }

    var store: Int = when{
        a in 1..10-> 1
        b in 1..10-> 2
        c in 1..10-> 3
        d in 1..10-> 4
        e in 1..10-> 5
    }

    // Question-2
    // Define a loop which will print out 1 - 100.
    for(k in 1..100){
        println(k)
    }

    //Also define a loop which will print out 1 - 10 to the console without printing out the numbers 4 and 5.
    for(i in 1..10){
        if((i == 4) || (i == 5)){
            continue
        }
        println(i)
    }
    //Question-3
    /*
    Using a loop and the modulus operator, write a program which will print out only the even numbers between 10 and 20
    and the odd numbers between 20 and 30:
    NB: Use only one loop
     */

    for(l in 10..30){
        if((l%2 == 0) && (l in 10..20)){
            println(l)
        }
        else if ((l%2 != 0) && (l in 20..30)){
            println(l)
        }

    }

    /*Question-4
    Define 5 Classes;
    let each class definition contain at least 5 instance variables;
    let each class contain at least 1 constructor.
     */


}

class Class1{
    var name: String = ""
    var age: Int = 0
    var id: String = ""
    var height: Int = 0
    var sex: Char = ''
    constructor()
    {
    }

}

class Class2{
    var name: String = ""
    var age: Int = 0
    var id: String = ""
    var height: Int = 0
    var sex: Char = ''
    constructor()
    {
    }
    constructor(){

    }

}

class Class3{
    var name: String = ""
    var age: Int = 0
    var id: String = ""
    var height: Int = 0
    var sex: Char = ''
    constructor()
    {
    }
    constructor(){

    }

}

class Class4{
    var name: String = ""
    var age: Int = 0
    var id: String = ""
    var height: Int = 0
    var sex: Char = ''
    constructor(){

    }

}

class Class5{
    var name: String = ""
    var age: Int = 0
    var id: String = ""
    var height: Int = 0
    var sex: Char = ''
    constructor(){

    }

}