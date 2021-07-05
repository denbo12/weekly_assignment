fun main(args: Array<String>) {
    print(vowelLessString("denbofa"))

}

fun vowelLessString(word: String): String{
    var processedWord: String = ""
    val a: Char = 'a'
    val e: Char = 'e'
    val i: Char = 'i'
    val o: Char = 'o'
    val u: Char = 'u'

    for (k in word){
        if(k == a || k == e|| k == i || k == o || k == u){
            continue
        } else {
            processedWord += k
        }
    }

    return processedWord
}