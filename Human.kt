class Human(val name: String) {

    //property / atribut / field
    var email: String = ""
    var addres: String = ""

    //method / fungsi
    fun talk() {
        println("Alamat email saya adalah $email")
    }

    fun verify(email: String): Boolean {
        return email == this.email
    }

    fun introduce() {
        println("Perkenalkan, nama saya adalah $name")
    }
}