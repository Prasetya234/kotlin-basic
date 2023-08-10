
fun main() {
    var firstName: String = "Prasetya Dhany" // string
    var lastName: String = "Putra" // string
    var age: Int = 18 // integer
    var health: Double = 99.99 // floating point
    var rank: Char = 'A' // char
    var bol: Boolean = true // boolean

    println(firstName + " "  + lastName)
    println(age)
    println(health)
    println(rank)
    println(bol)

    // string template
    var templateString: String = "Hello My name is $firstName and my last name is $lastName"
    println(templateString)
}