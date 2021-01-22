class Person(var id: String, var name: String, var age: String, var address: Address) {
    override fun toString(): String {
        return "Person(id='$id', name='$name', age='$age', address=$address)"
    }
}