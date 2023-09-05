class ItemManager(val categoryId: String, val dbConnection: String) {
    var email = ""

    constructor(categoryId: String, dbConnection: String, email: String)
            : this(categoryId, dbConnection) {
        this.email = email
    }

    fun isFromSpecificCategory(catId: String): Boolean {
        return categoryId == catId
    }
}