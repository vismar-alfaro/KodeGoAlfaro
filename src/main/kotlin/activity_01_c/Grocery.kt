package activity_01_c

import java.time.LocalDate
import java.time.format.DateTimeFormatter

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


}