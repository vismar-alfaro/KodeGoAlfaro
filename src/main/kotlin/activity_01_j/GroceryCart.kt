package activity_01_j

//Using Activity 01 - C
//Implement a process where items are added to the grocery cart.
//User : Cashier
//Goal : List of Items bought, how many items were bought and total cost.
//Scope :
//Data Structures

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

fun main() {
    var hashItems:ArrayList<String> = ArrayList<String>()
    var hashPrice:HashSet<String> = HashSet<String>()
    var newPrice:HashSet<Double> = HashSet<Double>()

    do{
        logger.info { "Enter Item Name: " }
        var enteredItem:String = readLine().toString()
        if (enteredItem != ""){
            hashItems.add(enteredItem)
        }
        logger.info{"Price: "}
        var enteredPrice: String = readLine().toString()
        if (enteredPrice != ""){
            hashPrice.add(enteredPrice)
        }

    }while(enteredItem != "" || enteredPrice != "")

    for(item in hashItems){
        logger.info { "Item: $item" }
    }

    logger.info { "${hashItems.size} Items Bought" }

    var newAmount:Double? = null

    for (element in hashPrice){
        newAmount = element.toDouble()
        newPrice.add(newAmount)
    }

    val sum = newPrice.sum()
    logger.info { "Total Amount: $sum" }


}
