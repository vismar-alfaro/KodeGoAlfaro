package activity_03_b

/*Instructions :
1. Create an ArrayList of bookname with 20 entries.
2. Create a function "isBookInRecord" that will accept a String and return true if the book is found,
   otherwise false.
3. Create a function "addBook" that will accept a String and add it to the ArrayList.
4. Create a function "removeBook"  that will accept a name and remove it from the ArrayList if it
   exactly matches the book name.
5. Create a function "countBooks" that will return the size of the ArrayList.
6. Create a function "searchBookWildSearch" that will accept a String and search if
   that string is found with in the ArrayList, it will return an ArrayList of books
   that matched if there are.
7. Create a function  "searchBookName" that will accept a String and search if there
   is an exact match of the String input, it will return an ArrayList of books that
   matched if there are.
8.  Create a function "showBooks" that will print all the entries in the ArrayList.
* */

import mu.KotlinLogging
import java.util.*
import kotlin.collections.ArrayList

private val logger = KotlinLogging.logger{}

fun main() {
    var books = arrayOf("Life and Works of Rizal",
        "Purposive Communication","Mathematics in the Modern World ",
        "The Contemporary World","Ethics","Fundamentals of Accounting",
        "Introduction to Computing","Algebra","Physics","Trigonometry","Logic",
        "Set Theory","Natures Numbers","Geometry","Chemistry","Biology","Philippine History",
        "English 1","Topology", "Basic Programming")

    /*2. Create a function "isBookInRecord" that will accept a String and return true if
    the book is found,otherwise false.
     */
    var bookName: String? = null
    logger.info{"Enter a Book Title: "}
    bookName = readLine().toString()
    logger.info{ isBookInRecord(books,bookName) }

    //3. Create a function "addBook" that will accept a String and add it to the ArrayList.
    var addBook:String? = null
    logger.info { "Input Book Title to be Added: " }
    addBook = readLine().toString()
    books = addBook(books,addBook)
    logger.info { books.contentToString() }

    /*4. Create a function "removeBook"  that will accept a name and remove it from the ArrayList if it
       exactly matches the book name.*/
    var removeBook:String? = null
    logger.info { "Input Book Title to be Remove: " }
    removeBook = readLine().toString()
    books = removeBook(books, removeBook)
    logger.info { books.contentToString() }

    //5. Create a function "countBooks" that will return the size of the ArrayList.
    countBooks(books)

    /*6. Create a function "searchBookWildSearch" that will accept a String and search if
         that string is found with in the ArrayList, it will return an ArrayList of books
         that matched if there are.*/
    var bookWildSearch: String? = null
    logger.info{"Input String to be Search: "}
    bookWildSearch = readLine().toString()
    searchBookWildSearch(books,bookWildSearch)

    /*7. Create a function  "searchBookName" that will accept a String and search if there
         is an exact match of the String input, it will return an ArrayList of books that
         matched if there are.*/
    var bookSearchName: String? = null
    logger.info{"Input String to be Search: "}
    bookSearchName = readLine().toString()
    searchBookName(books,bookSearchName)

    //Create a function "showStudents" that will print all the entries in the ArrayList.
    showBooks(books)
}

fun isBookInRecord(books:Array<String>, target: String):Boolean{
    var index = 0
    var element = false
    while (index < books.size){
        if(target.lowercase() == books[index].lowercase()){
            element = true
        }
        index++
    }

    return element
}

fun addBook(add:Array<String>, element:String): Array<String> {
    val list: MutableList<String> = add.toMutableList()
    list.add(element)
    return list.toTypedArray()
}

fun removeBook(books:Array<String>, element:String): Array<String> {
    var index = 0
    val list: MutableList<String> = books.toMutableList()

    while (index < books.size){
        if(element.lowercase() == books[index].lowercase()){
            list.remove(books[index])
        }
        index++
    }

    return list.toTypedArray()
}

fun countBooks(arr:Array<String>){
    val list: MutableList<String> = arr.toMutableList()
    logger.info {"Number of Books in List: ${arr.count()}"}
}

fun searchBookWildSearch(mylist:Array<String>, target:String): Array<String>{
    var index = 0
    var hashList:ArrayList<String> = ArrayList()

    while (index < mylist.size){
        if(target.lowercase() in mylist[index].lowercase()){
            hashList.add(mylist[index])
        }
        index++
    }
    logger.info{hashList}
    return hashList.toTypedArray()
}

fun searchBookName(mylist:Array<String>, target: String):Array<String>{
    var index = 0
    var hashList:ArrayList<String> = ArrayList()

    while (index < mylist.size){
        if(target == mylist[index]){
            hashList.add(mylist[index])
        }
        index++
    }
    logger.info{hashList}
    return hashList.toTypedArray()
}

fun showBooks(arr:Array<String>){
    logger.info { arr.joinToString(
        prefix = "[",
        separator = ",",
        postfix = "]",
        truncated = "...",
    ) }
}