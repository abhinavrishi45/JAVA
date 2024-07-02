fun main() {


    print(gmailMaker())
}
fun gmailMaker(): String
{
    println("Enter your first name  ")
    val name = readLine()
    println("Enter your last name ")
    val last= readLine()

    return "your eMail is $name$last@gmail.com"
}