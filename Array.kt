fun main() {
    val names: Array<String> = arrayOf("Gajah", "Singa", "Harimau", "Kelinci")

    println(names[0]) // get index sama
    println(names.get(0)) // get index sama


    names.set(1, "Gagak") // change index sama
    names[1] = "Gagak 2" // change index sama
    println(names[1])

    println(names.size) // panjang array
}

