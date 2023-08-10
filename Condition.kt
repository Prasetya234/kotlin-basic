fun main() {
    val num1: Int = 10
    val num2: Int = 10

    val hasil: Int = num1 + num2


    // if statement
    if (hasil == 20) {
        println("Jawaban Benar")
    } else {
        println("Jawaban Salah")
    }


    // switch / when hanya operator ==
    val nilai: Char = 'A'

    when (nilai) {
        'A' -> {
            println("Luar biasa")
            println("Amazing")
        }

        'B' -> println("Not Bad")
        'C' -> println("Bad")
        'D' -> println("Poor")
        else -> println("Gagal")
    }


    // when expession in
    val daftarNilaiBaik: Array<Char> = arrayOf('A', 'B', 'C')
    when (nilai) {
        in daftarNilaiBaik -> println("LULUS")
        !in daftarNilaiBaik -> println("TIDAK LULUS")
    }
//    sama seperti
//    daftarNilaiBaik.find((item) => item = nilai) true
//    if true ->  println("LULUS")
//    else -> println("TIDAK LULUS")

    val nilai2: Int = 60

    when {
        nilai2 >= 90 -> println("Nilai bagus")
        nilai2 >= 80 -> println("Nilai sedang")
        nilai2 >= 70 -> println("Nilai rendah")
        else -> println("Gagal")
    }
}