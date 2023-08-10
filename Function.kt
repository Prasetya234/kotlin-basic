// gaya penulisan camel case

// function biasa
fun helloWorld() {
    println("Hello World")
}

// function parameter
fun sayHello(firstName: String, lastName: String?) {
    if (lastName == null){
        println("Hello, $firstName")
    } else {
        println("Hello, $firstName $lastName")
    }
}

// function default parameter
fun sayHello2(firstName: String, lastName: String? = null): Unit {
    if (lastName == null){
        println("Hello, $firstName")
    } else {
        println("Hello, $firstName $lastName")
    }
}

// function return value
fun penjumlahan(a: Int, b: Int): Int {
    return  a + b
}


// function vararg equals ...nilai
fun hitungTotal(name:String, vararg nilai: Int): Int {
    println(name)

    var total = 0
    for (item in nilai) {
        total += item
    }
    return total
}

infix fun String.compair(type: String): String {
    when (type) {
        "UP" -> return this.toUpperCase()
        else -> return this.toLowerCase()
    }
}

fun main() {
    helloWorld()

    // parameter wajib di isi walapun tidak di pakai
    sayHello("Prasetya", "Dhany")
    sayHello("Putra", null)

    // Function default param
    sayHello2("Prasetya", "Dhany")
    sayHello2("Putra")

    // function return value
    val hasil = penjumlahan(10, 10)
    println(hasil)

    // vararg function
    val total = hitungTotal("Penjumlahan" , 10 , 10, 10 , 10)
    println(total)

    // infix function
    val nama = "prasetya dhany putra"
    val res = nama compair "UP" // nama.compair("up) -- sama
    println(res)

}

