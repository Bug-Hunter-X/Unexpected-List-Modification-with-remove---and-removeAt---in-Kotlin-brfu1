fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val indexToRemove = list.indexOf(3)
    if (indexToRemove != -1) {
        list.removeAt(indexToRemove)
    }
    println(list) // Output: [1, 2, 4, 5]

    list.removeAt(1) // Removes the element at index 1 (now 4)
    println(list) // Output: [1, 4, 5]

    //Alternative approach using filter
    val newList = list.filter { it != 4 }
    println(newList) //Output: [1,5]
} 