fun main() {
//    println("City: Ankara")
//    println("Low temperature: 27, High temperature: 31")
//    println("Chance of rain: 82%")
//    println()
//
//    println("City: Tokyo")
//    println("Low temperature: 32, High temperature: 36")
//    println("Chance of rain: 10%")
//    println()
//
//    println("City: Cape Town")
//    println("Low temperature: 59, High temperature: 64")
//    println("Chance of rain: 2%")
//    println()
//
//    println("City: Guatemala City")
//    println("Low temperature: 50, High temperature: 55")
//    println("Chance of rain: 7%")
//    println()
//
    tempratureAtCity()
}
//fun tempratureAtCity(City: String, Low: Int,  High : Int, Rain : Int){
fun tempratureAtCity():Unit{
    println("Enter the city name - ")
    var City = readLine()
    println("Enter the lowest temprature -")
    var Low = readLine()
    println("Enter the highest temp -")
    var High = readLine()
    println("enter the chance of rain")
    var Rain= readLine()
    println("City $City")
    println("Low temperature: $Low, High temperature: $High")
   println("Chance of rain: $Rain %")
   println()



}