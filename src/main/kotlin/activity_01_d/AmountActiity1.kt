package activity_01_d

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

fun main(args: Array<String>) {

    var sum: Int? = null
    var num1: Int? = null
    var num2: Int? = null
    var num3: Int? = null
    var num4: Int? = null
    var num5: Int? = null
    var result: Double? = null
    var divisor1: Int? = null
    var sumTotal: Double? = null
    var amount1: String? = null
    logger.info { ("Enter first amount: ") }
    amount1 = readLine()?.toString()
    var amount2: String? = null
    logger.info { ("Enter second amount: ") }
    amount2 = readLine()?.toString()
    var amount3: String? = null
    logger.info { ("Enter third amount: ") }
    amount3 = readLine()?.toString()
    var amount4: String? = null
    logger.info { ("Enter fourth amount: ") }
    amount4 = readLine()?.toString()
    var amount5: String? = null
    logger.info { ("Enter fifth amount: ") }
    amount5 = readLine()?.toString()

    var divisor: String? = null
    logger.info { ("Divide the value by how much?: ") }
    divisor = readLine().toString()
}
