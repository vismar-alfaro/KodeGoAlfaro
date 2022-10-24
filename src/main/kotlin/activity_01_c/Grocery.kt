package activity_01_c

import java.time.LocalDate
import java.time.format.DateTimeFormatter

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

//You are tasked to automate an inventory system for a grocery.
//Identify the items that can be bought in a grocery store.
//After listing the different items, identify the characteristics of the items.
//You are also tasked to group the items in categories to help manage the grocery.
// Use the proper data types.
fun main() {

    //Items in the grocery
    var groceryProduct1: String? = null
    var groceryProduct2: String? = null
    var groceryProduct3: String? = null

    //Item Category
    var junkFood: Boolean = false
    var fruit: Boolean = false
    var cannedGood: Boolean = false

    //Item Characteristics
    var manufacturedDate = LocalDate.parse("2022-10-06")
    var dateFormat = DateTimeFormatter.ofPattern("MM-dd-yyy")
    var formattedManufacturedDate = manufacturedDate.format(dateFormat)

    var expiryDate = LocalDate.parse("2026-10-06")
    var formattedExpiryDate = manufacturedDate.format(dateFormat)

    var weight: Double?= null
    var isbn: Int?=null

    //Data Structure
    var hashItems:ArrayList<String> = ArrayList<String>()
    var hashPrice:HashSet<String> = HashSet<String>()
    var newPrice:HashSet<Double> = HashSet<Double>()


}