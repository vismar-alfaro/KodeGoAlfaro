package activity_01_a

import java.time.LocalDate
import java.time.Month
import java.time.format.DateTimeFormatter
import java.util.Date

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

//You are tasked to create a directory of the students taking this course.
//The data will be used to send updates regarding the classes.
//There is also a need to know the progress of the students during the progress of this course.
//List down all data that can be used to implement this. Use the proper data types.

fun main (args:Array<String>){

    //Personal Information of Student
    var firstName: String = ""
    var lastName: String = ""
    var middleName: String = ""

    //Contact Information
    var emailAddress: String = ""
    var cellPhone: Long = 0L
    var discordGG: String? = null
    var facebookProfile: String?= null

    //Kode Go Information
    var programEnrolled: String = "MD2P"
    var classStartDate = LocalDate.of(2022,Month.SEPTEMBER,30)

    //Performance
    var absences: Double? = 0.0
    var submittedProject1: Boolean = false
    var submittedProject2: Boolean = false
    var submittedProject3: Boolean = false

    //Data Structure
    var studentInfo:HashMap<String,String> = HashMap<String,String>(40)
    var studentAttenddance: HashMap<String,String> = HashMap<String,String>(40)
    var studentEmail:HashMap<String,String> = HashMap<String,String>(40)
    var studentCellphone:HashMap<String,Long> = HashMap<String,Long>(40)
    var studentFacebook:HashMap<String,String> = HashMap<String,String>(40)
    var studentProject1:HashMap<String,Boolean> = HashMap<String,Boolean>(40)
    var studentProject2:HashMap<String,Boolean> = HashMap<String,Boolean>(40)
    var studentProject3:HashMap<String,Boolean> = HashMap<String,Boolean>(40)





}