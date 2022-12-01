package activity_04_a

import Student
import java.util.*
import kotlin.collections.ArrayList
/*
* Instructions :

1. Use class to represent the student rather string.Make sure the student has a firstName,
   lastName, nickName, id and year enrolled
2. Update the searchStudentWildSearch to search for the wild string in the lastname,
   middle name, and firstname. Return the Arraylist of students that match the searched string,
   if there are no entries return an emptry ArrayList.
3. Add a function searchStudentWildSearch that will accept a string and either of the following
   values, lastname, middlename, nickname. This will search the specific wild string depending
   where it was mentioned to be searched for. Return the Arraylist of students that match the
   searched string, if there are no entries return an emptry ArrayList.*/

interface StudentDAO{
    fun addStudent(student:Student)
    fun getStudent() : ArrayList<Student>
    fun searchStudent(firstName:String = "", middleName:String = "", lastName:String = "")
}

class StudentStub() : StudentDAO{

    var studentRecords: ArrayList<Student> = ArrayList()

    override fun addStudent(student: Student) {
        studentRecords.add(student)
    }

    override fun getStudent(): ArrayList<Student> = studentRecords

    override fun searchStudent(firstName: String, middleName: String, lastName: String) {
        println("Searching stub")
    }
}

fun main() {
    var names = arrayOf("James","Nikko","Pam","Lorie","Delight","Sancho","Norway","Willy",
        "Ruthchel","Rachel","Jacob","Reuben","Simeon","Levi","Judah","Gad","Asher","Dan","Naphtali",
        "Joseph")

    //accept a name and return true if the name is found, otherwise false.
    var name: String? = null
    println("Enter a Name: ")
    name = readLine().toString().lowercase()
    var newname = name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    println(isStudentInRecord(names,newname))

    //accept a name and add it to the ArrayList.
    var addName:String? = null
    println("Input a Name to be Added: " )
    addName = readLine().toString().lowercase()
    var newaddName = addName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    names = addStudent(names,newaddName)
    println(names.contentToString())

    //accept a name and remove it from the ArrayList.
    var removeName:String? = null
    println("Input a Name to be Remove: " )
    removeName = readLine().toString().lowercase()
    var newremoveName = removeName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    names = removeStudent(names, newremoveName)
    println(names.contentToString())

    //return the size of the ArrayList.
    countStudent(names)

    //accept a String and search if
    //that string is found with in the ArrayList, it will return an ArrayList of names that matched
    //if there are.
    var studentWildSearch: String? = null
    println("Input String to be Search: ")
    studentWildSearch = readLine().toString()
    searchStudentWildSearch(names,studentWildSearch)

    //accept a String and search if there is an
    //exact match of the String input, it will return an ArrayList of names that matched if there are.
    var studentSearchName: String? = null
    println("Input String to be Search: ")
    studentSearchName = readLine().toString()
    searchStudentName(names,studentSearchName)

    //function "searchStudent" that will accept a String and call "searchStudentWildSearch"
    //if the String input is less than or equal to three, and it will call "searchStudentName" if the
    //String input is greater than three.
    var searchStudentString: String? = null
    println("Input String to be Search: ")
    searchStudentString = readLine().toString()
    searchStudent(names,searchStudentString)

    //Create a function "showStudents" that will print all the entries in the ArrayList.
    showStudent(names)
}

fun isStudentInRecord(names:Array<String>, target: String):Boolean{
    return names.contains(target)
}

fun addStudent(add:Array<String>, element:String): Array<String> {
    val list: MutableList<String> = add.toMutableList()
    list.add(element)
    return list.toTypedArray()
}

fun removeStudent(remove:Array<String>, element:String): Array<String> {
    val list: MutableList<String> = remove.toMutableList()
    list.remove(element)
    return list.toTypedArray()
}

fun countStudent(arr:Array<String>){
    val list: MutableList<String> = arr.toMutableList()
    println("Number of Names in List: ${arr.count()}")
}

fun searchStudentWildSearch(mylist:Array<String>, target:String): Array<String>{
    var index = 0
    var hashList:ArrayList<String> = ArrayList()

    while (index < mylist.size){
        if(target.lowercase() in mylist[index].lowercase()){
            hashList.add(mylist[index])
        }
        index++
    }
    println(hashList)
    return hashList.toTypedArray()
}

fun searchStudentName(mylist:Array<String>, target: String):Array<String>{
    var index = 0
    var hashList:ArrayList<String> = ArrayList()

    while (index < mylist.size){
        if(target == mylist[index]){
            hashList.add(mylist[index])
        }
        index++
    }
    println(hashList)
    return hashList.toTypedArray()
}

fun searchStudent(mylist: Array<String>, target:String){
    if (target.length == 3 || target.length < 3 ){
        searchStudentWildSearch(mylist,target)
    }
    else if (target.length > 3){
        searchStudentName(mylist,target)
    }
}

fun showStudent(arr:Array<String>){
    println( arr.joinToString(
        prefix = "[",
        separator = ",",
        postfix = "]",
        truncated = "...",
    ) )
}