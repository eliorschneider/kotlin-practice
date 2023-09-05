class ItemWithConditionalStatements(id: String, name: String, val catId: String) : Item(id, name){

    override fun getIdOfItem(): String {
        println("id is : ${this.id}, and catId is ${this.catId}")
        return "hi ${this.id}"
    }
}