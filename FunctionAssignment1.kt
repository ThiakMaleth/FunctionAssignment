/*
write a function that has three parameters; two doubles and one character
 (*, +, -, /) and checks if third parameter
 == *, it will multiply the two doubles
 == +, it will add the two numbers
 == -, it will subtract the two numbers
 == /, it will divide the two numbers
*/

fun main(){
    println("Enter the first number: ")
    val num1 = readln().toDouble()

    println("Enter the second number: ")
    val num2 = readln().toDouble()

    println("Enter the Operator: ")
    val operator = readln()

    val result = performOperation(num1,num2, operator)
    println(result)
}

fun performOperation(num1: Double, num2:Double, operator: String) {

    when (operator) {
        "+" -> println(num1 + num2)
        "_" -> println(num1 - num2)
        "*" -> println(num1 * num2)
        "/" -> println(num1 / num2)
        else -> println("Wrong Operator")
    }
}


