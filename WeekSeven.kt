fun main(args: Array<String>) {
    reverseArray(arrayListOf(3,4,8,5,9,7))
}

fun reverseArray(arrayList: List<Int>){
    var k: Int = arrayList.size -1
    for(i in arrayList){
        print(arrayList[k])
        k--
    }
}