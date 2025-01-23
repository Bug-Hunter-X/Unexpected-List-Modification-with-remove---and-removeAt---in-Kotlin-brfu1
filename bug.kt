fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.remove(3) // Removes the first occurrence of 3
    println(list) // Output: [1, 2, 4, 5]

    list.removeAt(1) // Removes the element at index 1
    println(list) // Output: [1, 4, 5] 
}