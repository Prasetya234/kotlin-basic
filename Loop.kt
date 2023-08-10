import java.util.Objects

fun main() {
    val array = arrayOf("Gajah", "Kerbau", "Singa" )

    // in loop
    for (item in array) {
        println(item)
    }

    // manual loop
    for (idx in 0..10) {
        println(idx)
    }

    println("Loop step")
    // step adalah jumlah jeda dari loop 0 - 10
    // manual loop step
    for (idx in 0..10 step 5) {
        println(idx)
    }
}