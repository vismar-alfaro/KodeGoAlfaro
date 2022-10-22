package activity_01_i

//Using Activity 01 - B, Implement a process where someone can borrow a book.
//User: Librarian
//Goal: Keep track book borrowed, who borrowed and how long it can be borrowed.
//Scope :
//Data Structures

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

fun main() {

    val availableBooks = ArrayList<String>()
    var booksBorrowed: ArrayList<String> = ArrayList()
    var hashBorrower: HashMap<String,String> = HashMap<String,String>(3)

    availableBooks.add("Life and Works of Rizal")
    availableBooks.add("Programming 1")
    availableBooks.add("Data Structures")
    availableBooks.add("Mathematics 1")
    availableBooks.add("Purposive Communication")
    availableBooks.add("Statistics")
    availableBooks.add("Logic and Ethics")

    for(book in availableBooks){
        logger.info {"Books Available: $book" }
    }

    logger.info{"Enter Book Title to be Borrowed: "}
    val enteredBook =  readLine().toString()
    if(enteredBook in availableBooks){
        booksBorrowed.add(enteredBook)
    }
    else{
        logger.info { "Book Not Available" }
        return
    }
    logger.info { "Name of Borrower: " }
    var borrowersName:String? = readLine().toString()
    logger.info{"Days Borrowed: "}
    var daysBorrowed: String? = readLine().toString()

    hashBorrower.put("Name of Borrower","$borrowersName")
    hashBorrower.put("Book Borrowed","$enteredBook")
    hashBorrower.put("Days to be Borrowed","$daysBorrowed")

    for (key in hashBorrower.keys){
        logger.info{"$key = ${hashBorrower[key]}"}
    }

    logger.info { "Books Borrowed: $booksBorrowed" }




}