package activity_01_b

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

//You are tasked to automate a school’s library.
//Identify the items that can be borrowed in a Library.
//After listing the different items, identify the characteristics of the items.
//Use the proper data types.

fun main() {

    //Books in the Library if can be borrowed
    var rizal: Boolean = true
    var discreteMath: Boolean = true
    var modernStat: Boolean = true
    var purposiveCom: Boolean = true
    var artApp: Boolean = true

    //Book Characteristics
    val author: String? = null
    val yearPublished: Int? = null
    val publisher: String? = null
    val edition: String? = null
    val placePublished: String? = null

    //Data Structure
    val availableBooks = ArrayList<String>()
    var booksBorrowed: ArrayList<String> = ArrayList()
    var hashBorrower: HashMap<String,String> = HashMap<String,String>(3)
}
