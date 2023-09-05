class ItemWithConditionalStatements(id: String, name: String, val catId: String) : Item(id, name){

    override fun getIdOfItem(): String {
        println("id is : ${this.id}, and catId is ${this.catId}")
        return "hi ${this.id}"
    }

    fun makeAnalysisOfCategory(catId: String): Unit {
        val result = if (catId == "100") "Yes" else "No"
        println(result)
    }
}