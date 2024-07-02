fun main(){
  //  birthdayGreeting()
    println(birthdayGreeting("abhinav", 20))
    println(firstClass("Five",5))
    amount()
}
fun amount(): Unit{

        val baseSalary = 5000
        val bonusAmount = 1000
        val totalSalary = "$baseSalary + $bonusAmount"
        println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")


}
fun firstClass(name : String,age: Int):String{

        return "Happy Birthday, $name! You are now $age years old!"
    }

fun birthdayGreeting(name: String, age : Int): String {
    val nameGreeting = "Happy Birthday, $name"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}