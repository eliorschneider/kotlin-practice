class ItemWithCategory(id: String, name: String, val categoryId: String) : Item(id, name) {

    override fun getIdOfItem(): String {
        super.getIdOfItem()
        return "hey"
    }
}