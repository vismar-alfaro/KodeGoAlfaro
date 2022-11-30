package activity_01_d

import mu.KotlinLogging

import java.lang.ArithmeticException

private val logger = KotlinLogging.logger{}

//Create an application that will accept 5 monetary amounts.
//After the input is done, the user will be asked “Divide the value by how many?”.
// It will only accept an Integer as input.
//The total of the 5  input will be divided by the answer in the second question input.
//Note: Error checking must be done.

fun main(args: Array<String>) {

    var sum: Int? = null
    var num1: Int? = null
    var num2: Int? = null
    var num3: Int? = null
    var num4: Int? = null
    var num5: Int? = null
    var result: Double? = null
    var divisor1: String? = null
    var divisor2: Int? = null
    var sumTotal: Double? = null

    var amount1: String? = null
    logger.info{("Enter first amount: ")}
    amount1 = readLine()?.toString()

    var index = 0
    var newAmount1:String = ""
    var newAmount2:String = ""
    var newAmount3:String = ""
    var newAmount4:String = ""
    var newAmount5:String = ""


    while(index in 0 until amount1!!.length){
        if (amount1[index] in '0' until '9'|| amount1[0] == '-' || amount1[index] == '.' ){
            newAmount1 = newAmount1 + amount1[index]

        }
        else{
            logger.info { "Your Input is Invalid" }
            return
        }
        index++
    }

    num1= newAmount1?.toInt()

    var index2 = 0

    var amount2: String? = null
    logger.info{("Enter second amount: ")}
    amount2 = readLine()?.toString()

    while(index2 in 0 until amount2!!.length){
        if (amount2[index2] in '0' until '9'|| amount2[0] == '-' || amount2[index2] == '.'){
            newAmount2 = newAmount2 + amount2[index2]

        }
        else{
            logger.info { "Your Input is Invalid" }
            return
        }
        index2++
    }

    num2= newAmount2?.toInt()

    var index3 = 0

    var amount3: String? = null
    logger.info{("Enter Third amount: ")}
    amount3 = readLine()?.toString()

    while(index3 in 0 until amount3!!.length){
        if (amount2[index3] in '0' until '9'|| amount3[0] == '-' || amount3[index3] == '.'){
            newAmount3 = newAmount3 + amount3[index3]

        }
        else{
            logger.info { "Your Input is Invalid" }
            return
        }
        index3++
    }

    num3= newAmount3?.toInt()

    var index4 = 0

    var amount4: String? = null
    logger.info{("Enter Fourth amount: ")}
    amount4 = readLine()?.toString()

    while(index4 in 0 until amount4!!.length){
        if (amount4[index4] in '0' until '9'|| amount4[0] == '-' || amount4[index4] == '.'){
            newAmount4 = newAmount4 + amount4[index4]

        }
        else{
            logger.info { "Your Input is Invalid" }
            return
        }
        index4++
    }

    num4= newAmount4?.toInt()

    var index5 = 0

    var amount5: String? = null
    logger.info{("Enter Fifth amount: ")}
    amount5 = readLine()?.toString()

    while(index5 in 0 until amount5!!.length){
        if (amount5[index5] in '0'.. '9'|| amount5[0] == '-' || amount5[index5] == '.'){
            newAmount5 = newAmount5 + amount5[index5]

        }
        else{
            logger.info { "Your Input is Invalid" }
            return
        }
        index5++
    }

    num5= newAmount5?.toInt()

    var index6 = 0

    var divisor: String? = null
    logger.info{("Divide the value by how much?: ")}
    divisor = readLine().toString()

    while(index6 in 0 until divisor!!.length){
        if (divisor[index6] in '0'.. '9'|| divisor[0] == '-' || divisor[index6] == '.'){
            divisor1 = divisor1 + divisor[index6]

        }
        else{
            logger.info { "Your Input is Invalid" }
            return
        }
        index6++
    }
    divisor2 = divisor1?.toInt()

    sum= num1!!+num2!!+num3!!+num4!!+num5!!
    result=sum.toDouble()/divisor2!!.toDouble()

    logger.info{"Result: $result "}

}