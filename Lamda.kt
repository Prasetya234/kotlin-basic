// lambda parameter function
fun hello(name: String, transformer: (String) -> String): String {
    return transformer(name)
}

// inline function lebih cepat dari pada function lamda
inline fun helloInline(name: String, transformer: (String) -> String): String {
    return transformer(name)
}

// note
// lambda tidak bisa menghasilkan return atau kode yang kompleks
// maka dari itu kita menggunakan anonymous function


fun main() {
    // Nama  function param lambda
    val result1 = hello("prasetya", {value:String -> value.toUpperCase()})

    // Nama  function param trailing lambda
    val result2 = hello("DHANY") {
            value:String -> value.toLowerCase()
    }

    println(result1)
    println(result2)


    val upper = fun(value: String): String {
        if (value == "") {
            return "CAN'T CONVERT UPPER"
        } else {
            return value.toUpperCase()
        }
    }

    // Nama function param trailing lambda anonymous functionm
    val result3 = hello("putra", upper)
    println(result3)

    val result4 = helloInline("kakakak", upper)
    println(result4)
}