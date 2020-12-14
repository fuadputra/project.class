fun main() {

    val fuad = Human("Fuad Putra")
    val jono = Human( "Jono")

    fuad.email = "fuadputra@gmail.com"
    fuad.addres = "Maguwoharjo, Depok, Sleman, Yogyakarta"

    jono.email = "jonojoni@gmail.com"
    jono.addres = "CondongCatur, Depok, Sleman, Yogyakarta"

    fuad.talk()
    jono.talk()

    fuad.introduce()

    println(fuad.verify(email = "fuadputraa@gmail.com"))

    println(Fuad.name)

    val dimas : Fuad = Fuad
    println(dimas.nationality)
}