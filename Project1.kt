fun main() {
    val andi = user(firstName = "Andi", lastname = "Budiman", age = 34 )
    val rudi = user(firstName = "Rudi", lastname = "Budiman", age = 36 )
    val dedi = user()
    dedi.age = 37
    dedi.firstName = "Dedi"

    println(andi)
    println(rudi)
    println(dedi)



}