package activity_01_f

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

fun main(args: Array<String>) {
    var word1: String? = null
    var word2: String? = null
    var index = 0
    var index2 = 0

    logger.info { "Please Input First word: " }
    word1 = readLine().toString()
    logger.info { "Please Input Second Word: " }
    word2 = readLine().toString()

    val wordComb: String = word1 + word2


    while(index in 0 until wordComb.length){
        var mark = 0
        for (index2 in 0 until wordComb.length){
            if (wordComb.lowercase()[index] == wordComb.lowercase()[index2] && index != index2){
                mark = 1
            }
        }
        if (mark == 0){
            logger.info { "Unique Character: ${wordComb[index]}" }
        }
        index2 ++
    index++
    }

}