

fun sum (a: Int, b: Int): Int {
    return a + b
}



fun main(args: Array<String>) {
    println("Hello World! ${sum(5, 7)}")

    var email: String? = null
    email = "value"
    println("check category is ${ItemManager("cat_id", "db://connection").isFromSpecificCategory("cat_id")}")
    ItemManager("cat_id", "db://connection", "foo@bar.com")

    println("${sumLambda(5,11 )}")
    ItemWithCategory("hey", "wow", "another")
    println("p iwc: ${ItemWithCategory("hey", "wow", "another")}")
    println("email string contents is ${email}")
    println("Program arguments: ${args.joinToString()}")
    ItemWithConditionalStatements("ID!", "NAME!", "CATID!").makeAnalysisOfCategory("100")
    ItemWithConditionalStatements("ID!", "NAME!", "CATID!").makeAnalysisOfCategory("90")
}