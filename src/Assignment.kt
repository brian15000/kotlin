import kotlin.collections.plusAssign
import kotlin.compareTo

fun main() {
    var studentName: String = "Alex Morgan"
    val studentId: Int = 2024001
    val GPA: Float = 3.75f
    val isEnrolled: Boolean = true
    val middleInitial = 'J'

    println("Student: $studentName $middleInitial. (ID: $studentId) has GPA $GPA and is enrolled: $isEnrolled")

    val phoneNumber: String? = null
    println("--------------------")
    println(phoneNumber)

    displayMenu()
    getGrade(10)
    isEven(20)


    temperature(35)
     temperature(25)
     temperature(15)


    println(dayMessage("Monday"))
    println(calculateDiscount(20.0,10.0))

    println(number(0))





}



// FUNCTION
fun displayMenu() {
    println("=== MENU ====")
    println("1. View")
    println("2. Edit Settings")
    println("3. Logout")
    println("==============")
}

fun calculateDiscount(price: Double, discountPercent: Double): Double {
    return price - (price * discountPercent/100)
}
fun getGrade(score: Int){
    if (score >79)
        println("A")
    else if (score >64)
        println("B")
    else if (score >49)
        println("C")
    else if (score >34)
        println("D")
    else
        println("F")

}
fun isEven(number: Int): Boolean = number % 2 == 0


//conditinal Statements
fun temperature(temperature: Int){
    if (temperature > 30)
        println("Hot day")
    else if (temperature >= 20)
        println("perfect weather")
    else
        println("cool day")

}

fun dayMessage(dayOfWeek: String) {
    when (dayOfWeek) {
        "Saturday", "Sunday" -> println("Weekend! Time to relax")
        "Monday" -> println("Back to work")
        "Friday" -> println("TGIF")
        else -> println("Regular Weekday")
    }
    }

fun trafficAction(trafficColor: String) {
        if (trafficColor == "Red")
            println("Stop")
        else if (trafficColor == "yellow")
            println("Caution")
        else if (trafficColor == "green")
            println("Go")
        else
            println("Invalid")
    }



    //LOOPS
    //4.1
fun number(start: Int) {
        var num = start   // mutable copy

        while (num < 10) {
            num += 1
            print("$num ")



            }
    }



