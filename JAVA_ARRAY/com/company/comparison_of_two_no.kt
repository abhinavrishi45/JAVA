fun main() {
println(two_no())
}
fun two_no(){
    val num1 : Int = Integer.valueOf(readLine())
    println("your 1 enter no is  $num1")
    val num2 : Int = Integer.valueOf(readLine())
    println("your 2 enter no is  $num2")
if(num1<num2){
    println("$num1 is lesss than $num2")

}
    else{
        println("$num1 is greater than $num2")
    }
}