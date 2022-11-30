package activity_01_h

//Create an application that will accept 2 Integers.
//It will identify the lower value and bigger value of the two inputs.
//Then, your application will print all the prime numbers starting from
// the lower number up to the largest number.
//Scope :
//String
//Loops

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

fun main(args: Array<String>) {

    var integerOne: String? = null
    var integerTwo: String? = null
    var index = 0
    var index2 = 0
    var newNum1: String? = ""
    var integernew1: Int? = null
    var newNum2: String? = ""
    var integernew2: Int? = null

    logger.info { "Please Enter First Number: " }
    integerOne = readLine().toString()

    while(index in 0 until integerOne.length){
        if (integerOne[index] in '0'..'9'){
            newNum1 = newNum1 + integerOne[index]

        }
        else{
            logger.info { "Your Input is Invalid" }
            return
        }
        index++
    }

    integernew1= newNum1?.toInt()
    logger.info { "Please Enter Second Integer: " }
    integerTwo = readLine().toString()

    while(index2 in 0 until integerTwo.length){
        if (integerTwo[index2] in '0'..'9'){
            newNum2 = newNum2 + integerTwo[index2]

        }
        else{
            logger.info { "Your Input is Invalid" }
            return
        }
        index2++
    }

    integernew2= newNum2?.toInt()

    var i:Int = 2

    if (integernew1!! <= integernew2!!){
        logger.info { "$integernew1 is less than $integernew2" }
        while (integernew1!! <= integernew2!!){
            var flag = 0
            if (integernew1 <= 1){
                integernew1++
            }

            while(i in 2..integernew1){
                if (integernew1 % i == 0 && integernew1 != i){
                    break
                    flag = 1
                }

                if (flag == 0 && integernew1 == i){
                    logger.info { "$integernew1"  }
                }
                i++
            }
            i = 2
            integernew1++

        }
    }
    else if (integernew2!! <= integernew1!!){
        logger.info { "$integernew2 is less than $integernew1" }
        while (integernew2!! <= integernew1!!){
            var flag = 0
            if (integernew2 <= 1){
                integernew2++
            }

            while(i in 2..integernew2){
                if (integernew2 % i == 0 && integernew2 != i){
                    break
                    flag = 1
                }

                if (flag == 0 && integernew2 == i){
                    logger.info { "$integernew2 "  }
                }
                i++
            }
            i = 2
            integernew2++

        }
    }
}


