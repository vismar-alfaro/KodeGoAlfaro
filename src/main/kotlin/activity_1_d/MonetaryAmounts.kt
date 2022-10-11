package activity_1_d

//Create an application that will accept 5 monetary amounts.
//Divide the value by how many
//The total of the 5  input will be divided by the answer in the second question input.
//Error checking must be done.

fun main() {

    var monetary1: Int? = null
    var monetary2: Int? = null
    var monetary3: Int? = null
    var monetary4: Int? = null
    var monetary5: Int? = null
    var divisor: Int? = null
    var result: Double? = null
    var sum: Int? = null

    print("Enter Amount1: ")
    monetary1 = readLine()?.toInt()
    print("Enter Amount2: ")
    monetary2 = readLine()?.toInt()
    print("Enter Amount3: ")
    monetary3 = readLine()?.toInt()
    print("Enter Amount4: ")
    monetary4 = readLine()?.toInt()
    print("Enter Amount5: ")
    monetary5 = readLine()?.toInt()

    print("Dive the value by how many? : ")
    divisor= readLine()?.toInt()
    sum= monetary1?.plus(monetary2!!)?.plus(monetary3!!)?.plus(monetary4!!)?.plus(monetary5!!)
    if (divisor != null) {
        result= sum?.toDouble()?.div(divisor.toDouble())
    }
    println("The answer is: $result")

}