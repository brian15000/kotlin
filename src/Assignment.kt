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

    countDown(5)


    //4.3
    val shoppingList=listOf("Milk","Eggs","Bread","Butter","Coffee")

    for ((index, shoppingList) in shoppingList.withIndex()) {


        println("[${index + 1}] $shoppingList")
    }

    //4.4
    for (number in 1..20)
    println("$number.")



    for (number in 1 until 20)
        println("$number.")

    for (number in 2..20 step 2)
        println("$number.")

    for (letter in 'A'..'Z')
        println(letter)

    //5.2
val age:Int=20
    val status = if (age >= 18 ) "Adult" else
        "MInor"
    println(status)

    var a :Int=0
    //5.3
    var b:Int=1
    var maxNumber=if (a>b) b else a
    println(maxNumber)

//SECTION 6
    displayAllStudents()
    println("Average:${getAverageScore()}")
    println("To Student: ${findTopStudent()}")
    classifyStudents()
//BONUS

        println("Enter first number:")
        val num1 = readln().toDouble()

        println("Enter second number:")
        val num2 = readln().toDouble()

        println("Enter operation (+, -, *, /):")
        val op = readln()

        val result = when (op) {
            "+" -> add(num1, num2)
            "-" -> subtract(num1, num2)
            "*" -> multiply(num1, num2)
            "/" -> divide(num1, num2)
            else -> {
                println("Invalid operation")
                null
            }
        }

        if (result != null) {
            println("Result: $result")
        }
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
        }}

            //4.2
fun countDown(num: Int) {
    var n = num
     while (n > 0) {
         print("$n ")
         n -= 1}

                    println("Blast off!")
                }



// SECTION 5: STATEMENTS VS EXPRESSIONS
//5.1
//SECTION 6
val students = listOf(
    "Alice" to 85,
    "Bob" to 42,
    "Charlie" to 67,
    "Diana" to 91,
    "Ethan" to 38
)

fun displayAllStudents() {
    for ((name, score) in students) {
        println("Name: $name, Score: $score")
    }
}

fun getAverageScore():  Int {
    var total = 0
    for ((_, score) in students) {
        total += score
    }
    return total.toInt() / students.size

        }
fun findTopStudent(): String {
    var topName = ""
    var highestScore = 0
    for ((name, score) in students) {
        if (score > highestScore) {
            highestScore = score
            topName = name
        }
    }
    return topName
}

fun classifyStudents() {
    for ((name, score) in students) {
        val grade = getGrade(score)
        println("Name:$name, Score: $score, Grade: $grade")
    }
}
//BONUS CHALLENGE

fun add(a: Double, b: Double) = a + b
fun subtract(a: Double, b: Double) = a - b
fun multiply(a: Double, b: Double) = a * b
fun divide(a: Double, b: Double): Double? {
    return if (b == 0.0) {
        println("Error: Cannot divide by zero")
        null
    } else {
        a / b
    }
}










