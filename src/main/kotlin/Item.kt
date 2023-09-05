// By default, Kotlin's classes are closed for extension, like final in Java
open class Item(val id: String, val name: String = "unknown_name") {

    // denoted as open, to allow overriding
    open fun getIdOfItem(): String {
        return id
    }

}