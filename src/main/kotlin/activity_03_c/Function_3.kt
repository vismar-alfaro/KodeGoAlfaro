package activity_03_c

/*
1. Create an ArrayList of grocery products with 20 entries.
2. Create a HashMap called Cart.
   Hint:  Hashmap<String, Int>
3. Create a function "addToCart" that will accept a String and an Int, the it will add the
   input in the Hashmap. If the Entry already exists, create a new entry in the HashMap.
   Hint : you may add a "_01", "_02"
   Example Coke_01, Coke_02
3. Create a function "checkOut". This will compute how many items have been checked out.
4. Create a function "removefromCart"  that will accept a String and remove the input from
   the Hashmap. If there are multiple entries, remove all from the HashMap.
*
* */

import mu.KotlinLogging
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

private val logger = KotlinLogging.logger{}

private var groceryItems = arrayOf("Bearbrand","Nido 3+","Bonakid","Alaska","Birch Tree",
                           "Youngs Town", "555 Tuna", "555 Corned Beef", "Lucky 7",
                            "Minola", "Datu Puti", "Nova", "Piatos", "Sky Flakes",
                                "Fita","Bravo","C2","Getorade","Vita Milk","Pineapple Juice")


fun main() {
    val cart:HashMap<String,Int> = HashMap<String,Int>()
    logger.info { "Products Available:${groceryItems.contentToString()}" }

    var product:String? = null
    var quantity:Int? = null
    do {
        logger.info { "Please Enter Y to Continue Shopping:" }
        var input = readLine().toString()
        if (input.uppercase() == "Y"){
            logger.info { "Please Enter Product Name:" }
            product = readLine().toString()
            logger.info { "Please Enter Quantity:" }
            quantity = readLine()!!.toInt()
            addToCart(product, quantity)}
    }while (input.uppercase() == "Y")

    for (key in cart.keys){
        logger.info { "Product Name:$key,Quantity: ${cart[key]}" }
    }
}

fun addToCart(item:String,quantity:Int):HashMap<String,Int>{
    var cart: HashMap<String,Int> = HashMap()
    cart.put(item,quantity)
    return cart
}



